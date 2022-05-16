package volta.cars.project.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, String> {

    //Como hacer un Post 
    @Modifying
    @Query("INSERT INTO USERS (USER_ID) VALUES (:user_id)")
    public void createUserMember(int user_id);
}