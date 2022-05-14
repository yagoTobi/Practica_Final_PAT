package volta.cars.project.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("HOSTS")
public class HostModel {
    private @Column("USER_ID") int userId;
    private @Column("HOST_ID") int hostId;
    private @Column("VEHICLE_ID") int vehicleId;
    private @Column("CHARGER_LOCATION") String location;
    private @Column("HOURLY_RATE") float hourlyRate;
    private @Column("RATING") int rating;
    private @Column("NUMBER_HOSTED") int numberHosted;
    private @Column("IDENTIFICATION") String identification;
}
