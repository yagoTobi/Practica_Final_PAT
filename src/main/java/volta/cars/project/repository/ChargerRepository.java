package volta.cars.project.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.ChargerModel;

public interface ChargerRepository extends CrudRepository<ChargerModel, Long> {

    //Como hacer un Post 
    @Modifying
    @Query("SELECT * FROM CHARGERS WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<ChargerModel> retrieveChargersByLongitude(float longitude);
    
    @Query("SELECT * FROM CHARGERS WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<ChargerModel> retrieveChargersByLatitude(float latitude);
    
    @Query("SELECT * FROM CHARGERS WHERE CHARGER.CHARGER_ID= :id")
    public Iterable<ChargerModel> retrieveCharger(Long chargerId);

    @Query("SELECT * FROM CHARGERS WHERE CHARGER.USER_ID= :user_id")
    public Iterable<ChargerModel> retrieveChargerByUser(Long userId);
    
    @Query("INSERT INTO CHARGERS (USER_ID, LATITUDE, LONGITUDE, CHARGER_TYPE) VALUES (:userId,:latitude,:longitude,:chargerType)")
    public void addCharger(Long userId, float latitude, float longitude, String chargerType);
}
