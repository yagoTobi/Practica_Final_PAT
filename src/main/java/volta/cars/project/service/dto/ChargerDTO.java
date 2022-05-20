package volta.cars.project.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class ChargerDTO {
    int userId;
    int chargerId;
    String chargerName;
    float latitude;
    float longitude;
    float wattage;
}
