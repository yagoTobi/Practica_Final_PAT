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
    private @Column("NAME") String name;
    private @Column("SURNAME") String surname;
    private @Column("MAIL") String mail;
    private @Column("PASS_WORD") String password;
    private @Column("VEHICLE_ID") int vehicleId;
    private @Column("DAY_BIRTH") int daybirth;
}
