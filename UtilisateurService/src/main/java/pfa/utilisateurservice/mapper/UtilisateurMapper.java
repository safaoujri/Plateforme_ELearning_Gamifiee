package pfa.utilisateurservice.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;
import pfa.utilisateurservice.dto.request.UtilisateurRequestDto;
import pfa.utilisateurservice.dto.response.UtilisateurResponseDto;
import pfa.utilisateurservice.entity.Utilisateur;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface UtilisateurMapper {
    Utilisateur dtoToModel(UtilisateurRequestDto utilisateurRequestDto);

    UtilisateurResponseDto modelToDto(Utilisateur utilisateur);

    List<UtilisateurResponseDto> modelToDtos(List<Utilisateur> utilisateurs);

   // @Mapping (target = "id", ignore = true) // On ignore l'id lors de la mise à jour
    @org.mapstruct.Mapping(

            target = "id", ignore = true)
    void updateModel(UtilisateurRequestDto utilisateurRequestDto, @MappingTarget Utilisateur utilisateur);
}

