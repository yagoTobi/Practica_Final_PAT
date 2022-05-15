package volta.cars.project.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.ChargerModel;

public interface ChargerRepository extends CrudRepository<ChargerModel, String> {

    //Como hacer un Post 
    @Modifying
    @Query("SELECT * FROM CHARGER WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<ChargerModel> retrieveChargersByLongitude(float longitude);
    @Query("SELECT * FROM CHARGER WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<ChargerModel> retrieveChargersByLatitude(float latitude);
    @Query("SELECT * FROM CHARGER WHERE CHARGER.ID= :id")
    public Iterable<ChargerModel> retrieveCharger(String chargerId);
    public void createChargerMember(String chargerId);
}
