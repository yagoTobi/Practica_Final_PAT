package volta.cars.project.model;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("VEHICLES")
public class Vehicle {
    private @Column("USER_ID") int userId;
    private @Column("VEHICLE_ID") int vehicleId;
    private @Column("ELECTRIC") boolean isElectric;
    private @Column("MODEL") String model;
    private @Column("LICENSE_PLATE") String licensePlate;
    private @Column("WATTAGE") float wattage;
}
