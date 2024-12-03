package pfa.utilisateurservice.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import pfa.utilisateurservice.dto.request.DemandePromotionRequestDto;
import pfa.utilisateurservice.dto.response.DemandePromotionResponseDto;
import pfa.utilisateurservice.entity.DemandePromotion;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface DemandePromotionMapper {

    DemandePromotion dtoToModel(DemandePromotionRequestDto requestDto);

    DemandePromotionResponseDto modelToDto(DemandePromotion demandePromotion);

    default List<DemandePromotionResponseDto> modelToDtos(List<DemandePromotion> demandes) {
        return demandes.stream()
                .map(this::modelToDto)
                .collect(Collectors.toList());
    }
}

