package volta.cars.project.service;

import volta.cars.project.model.ChargerModel;

public interface ChargerService {
    Iterable<ChargerModel> retrieveAll();
    void createChargerMember(ChargerModel newMember);
}
