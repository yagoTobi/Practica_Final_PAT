package volta.cars.project.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserChargerDTO {
    int userId;
    int vehicleId;
    int age; 
    String region; 
    String identification;
    int chargerId; 
    String chargerName;
    float latitude; 
    float longitude;
    float wattage;
}
