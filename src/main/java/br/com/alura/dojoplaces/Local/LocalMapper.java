package br.com.alura.dojoplaces.Local;

import br.com.alura.dojoplaces.utils.DateUtils;

import java.time.LocalDateTime;

public class LocalMapper {
    private LocalMapper() {}

    public static Local toEntity(LocalDTO localDTO) {
        Local local = new Local();
        local.setName(localDTO.getName());
        local.setCode(localDTO.getCode());
        local.setNeighborhood(localDTO.getNeighborhood());
        local.setCity(localDTO.getCity());
        local.setDateCreation(LocalDateTime.now());
        local.setDataUpdate(LocalDateTime.now());
        return local;
    }

    public static LocalDTO localDTO(Local local) {
        LocalDTO localDTO = new LocalDTO();
        localDTO.setName(local.getName());
        localDTO.setCode(local.getCode());
        localDTO.setNeighborhood(local.getNeighborhood());
        localDTO.setCity(local.getCity());
        return localDTO;
    }

    public static LocalWithLastUpdateDTO toLocalWithLastUpdateDTO(Local local, String lastUpdate) {
        LocalWithLastUpdateDTO localWithLastUpdateDTO = new LocalWithLastUpdateDTO();
        localWithLastUpdateDTO.setId(local.getId());
        localWithLastUpdateDTO.setName(local.getName());
        localWithLastUpdateDTO.setCode(local.getCode());
        localWithLastUpdateDTO.setNeighborhood(local.getNeighborhood());
        localWithLastUpdateDTO.setCity(local.getCity());
        localWithLastUpdateDTO.setLastUpdate(lastUpdate);
        localWithLastUpdateDTO.setDataUpdate(local.getDataUpdate());
        localWithLastUpdateDTO.setDateCreation(local.getDateCreation());
        localWithLastUpdateDTO.setCreationDate(DateUtils.formattedDate(local.getDateCreation()));
        return localWithLastUpdateDTO;
    }
}
