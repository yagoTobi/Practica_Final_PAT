package volta.cars.project.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("RESERVATIONS")
public class Reservation {
    private @Column("USER_ID") String userId;
    private @Column("RESERVATION_ID") String reservationId;
    private @Column("HOST_ID") String hostId;
    private @Column("PRICE") float price;
    private @Column("CHARGER_LOCATION") String location;
    private @Column("RESERVATION_DATE") String reservationDate;
    private @Column("RESERVATION_HOUR") String reservationHour;
}
