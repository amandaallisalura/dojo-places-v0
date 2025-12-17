package br.com.alura.dojoplaces.Local;

import br.com.alura.dojoplaces.utils.DateUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {
    private final LocalRepository localRepository;

    private LocalService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public void save(LocalDTO localDTO) {
        Local local = LocalMapper.toEntity(localDTO);
        localRepository.save(local);
    }

    public List<LocalWithLastUpdateDTO> findAll() {
        List<Local> locais = localRepository.findAll();

        return locais.stream()
                .map(item -> LocalMapper.toLocalWithLastUpdateDTO(
                        item,
                        DateUtils.daysSinceLastUpdate(item.getDataUpdate())
                ))
                .toList();
    }

}
