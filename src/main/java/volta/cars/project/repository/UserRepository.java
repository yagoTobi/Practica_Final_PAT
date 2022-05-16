package volta.cars.project.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, String> {

    //Como hacer un Post 
    @Modifying
<<<<<<< HEAD
    @Query("INSERT INTO USERS (USER_ID) VALUES (:user_id)")
    public void createUserMember(int user_id);
=======
    @Query("INSERT INTO USERS (USER_NAME, SURNAME, E_MAIL, PASSWORD, DOB) VALUES (:user_name, :surname, :email,:password, :dob)")
    public void addMember(String user_name, String surname, String email, String password, String dob);

>>>>>>> 1d345e92668c861998922e36ff6d4397081bfd37
}
