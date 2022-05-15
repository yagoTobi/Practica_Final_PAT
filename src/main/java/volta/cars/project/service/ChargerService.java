package volta.cars.project.service;

import volta.cars.project.model.ChargerModel;

public interface ChargerService {
    Iterable<ChargerModel> retrieveAll();
    Iterable<ChargerModel> retrieveChargerLat(String latitude);
    Iterable<ChargerModel> retrieveChargerLong(String longitude);
    ChargerModel retrieveCharger(String id);
    ChargerModel updateCharger(String id, ChargerModel charger);
    void deleteCharger(String id);
    void createChargerMember(ChargerModel model);
}
