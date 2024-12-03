package pfa.utilisateurservice.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import pfa.utilisateurservice.dto.response.InteretResponseDto;
import pfa.utilisateurservice.entity.Interet;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface InteretMapper {
    // Convertir le modèle Interet vers le DTO de réponse
    InteretResponseDto modelToDto(Interet interet);

    // Convertir une page de Interet en page de DTOs de réponse
    default Page<InteretResponseDto> modelToDtos(Page<Interet> interetPage) {
        return interetPage.map(this::modelToDto);
    }
}
