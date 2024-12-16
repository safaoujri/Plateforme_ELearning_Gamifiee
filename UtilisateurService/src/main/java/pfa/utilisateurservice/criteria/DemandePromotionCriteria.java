package pfa.utilisateurservice.criteria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemandePromotionCriteria {
    private Long utilisateurId;
    private String statut;
    private LocalDateTime dateMin;
    private LocalDateTime dateMax;
}
