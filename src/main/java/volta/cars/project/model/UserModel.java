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
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    private @Column("USER_NAME") String name;
    private @Column("SURNAME") String surname;
    private @Column("E_MAIL") String mail;
    private @Column("PASS_WORD") String password;
    private @Column("BIRTH") int birth;
}
