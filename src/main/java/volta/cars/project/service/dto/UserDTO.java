package volta.cars.project.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    int userId;
    int vehicleId;
    int age;
    String identification;
}
