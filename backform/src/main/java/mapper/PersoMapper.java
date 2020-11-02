package mapper;

import domain.Perso;
import dto.PersoDto;

import java.util.List;

public interface PersoMapper {
    Perso toEntity(Perso dto);


    PersoDto toDto(Perso entity);


    List<Perso> toEntity(List<PersoDto> dtoList);


    List<PersoDto> toDto(List<Perso> entityList);

}


