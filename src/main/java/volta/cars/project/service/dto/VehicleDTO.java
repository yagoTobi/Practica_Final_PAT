package volta.cars.project.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    int userId;
    int vehicleId;
    boolean isElectric;
    String model;
    String licensePlate;
    float wattage;
}
