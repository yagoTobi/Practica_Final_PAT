package volta.cars.project.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.ChargerModel;

public interface ChargerRepository extends CrudRepository<ChargerModel, String> {

    //Como hacer un Post 
    @Modifying
    @Query("INSERT INTO CHARGER_MEMBERS (E_MAIL) VALUES (:email)")
    public void createChargerMember(String email);
}
