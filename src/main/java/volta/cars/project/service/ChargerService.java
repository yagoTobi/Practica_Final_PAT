package volta.cars.project.service;

import volta.cars.project.model.ChargerModel;

public interface ChargerService {

    Iterable<ChargerModel> retrieveAll();

    Iterable<ChargerModel> retrieveChargerLat(float latitude);

    Iterable<ChargerModel> retrieveChargerLong(float longitude);

    ChargerModel retrieveCharger(Long id);

    ChargerModel updateCharger(Long id, ChargerModel charger);

    void deleteCharger(Long id);

    void createCharger(ChargerModel newCharger);

    //Get 
    Iterable<ChargerModel> getChargerByUserId(Long userId); 
}


/*@Query("SELECT * FROM CHARGERS WHERE CHARGER.USER_ID= :user_id")
    public Iterable<ChargerModel> retrieveChargerByUser(Long userId);*/