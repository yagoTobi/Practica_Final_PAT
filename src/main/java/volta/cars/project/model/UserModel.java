package volta.cars.project.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("USERS")
public class UserModel {
    private @Column("USER_ID") int userId;
    private @Column("VEHICLE_ID") int vehicleId;
    private @Column("AGE") int age;
    private @Column("REGION") String region;
    private @Column("IDENTIFICATION") String identification;
}
