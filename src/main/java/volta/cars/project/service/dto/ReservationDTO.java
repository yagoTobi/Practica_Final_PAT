package volta.cars.project.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {
    String userId;
    String reservationId;
    String hostId;
    float price;
    String location;
    String reservationDate;
    String reservationHour;
}
