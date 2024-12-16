package pfa.utilisateurservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemandePromotionRequestDto {
    private Long utilisateurId;
    private String commentaireAdmin;
}
