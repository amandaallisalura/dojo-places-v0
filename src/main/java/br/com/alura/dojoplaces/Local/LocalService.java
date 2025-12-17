package br.com.alura.dojoplaces.Local;

import br.com.alura.dojoplaces.utils.DateUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    public LocalWithLastUpdateDTO findById(Long id) {
         Local local = localRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Local não encontrado"));

        return LocalMapper.toLocalWithLastUpdateDTO(local, local.getDataUpdate().toString());
    }

    public LocalWithLastUpdateDTO update(Long id, LocalDTO dto) {
        Local local = localRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Local não encontrado"));

        local.setName(dto.getName());
        local.setCode(dto.getCode());
        local.setNeighborhood(dto.getNeighborhood());
        local.setCity(dto.getCity());
        local.setDataUpdate(LocalDateTime.now());
        Local updated = localRepository.save(local);

        return LocalMapper.toLocalWithLastUpdateDTO(
                updated,
                updated.getDataUpdate().toString()
        );
    }

    public void remove(Long id) {
        localRepository.deleteById(id);
    }


}
