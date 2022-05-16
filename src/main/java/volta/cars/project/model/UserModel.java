package volta.cars.project.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;


@Data
@Table("USERS")
public class UserModel {

    private @Column("USER_ID") int userId;
<<<<<<< HEAD
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    private @Column("USER_NAME") String name;
=======
    private @Column("USER_NAME") String user_name;
>>>>>>> 1d345e92668c861998922e36ff6d4397081bfd37
    private @Column("SURNAME") String surname;
    private @Column("E_MAIL") String email;
    private @Column("PASSWORD") String password;
    private @Column("DOB") String dob;

    
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

}
