package volta.cars.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import volta.cars.project.model.ChargerModel;
import volta.cars.project.repository.ChargerRepository;
import volta.cars.project.service.ChargerService;

@Service
public class ChargerServiceImpl implements ChargerService {

    @Autowired
    private ChargerRepository repository;

    @Override
    public Iterable<ChargerModel> retrieveAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<ChargerModel> retrieveChargerLat(String latitude) {
        if (latitude == null) {
            return repository.findAll();
        } else {
            float latitudeFloat = Float.parseFloat(latitude);
            return repository.retrieveChargersByLatitude(latitudeFloat);
        }
    }

    @Override
    public Iterable<ChargerModel> retrieveChargerLong(String longitude) {
        if (longitude == null) {
            return repository.findAll();
        } else {
            float longitudeFloat = Float.parseFloat(longitude);
            return repository.retrieveChargersByLongitude(longitudeFloat);
        }
    }

    @Override
    public ChargerModel retrieveCharger(String id) {
        ChargerModel response = null;
        if (repository.existsById(id)) {
            int idInt = Integer.parseInt(id);
            Iterable<ChargerModel> chargers = repository.retrieveCharger(idInt);
            for (ChargerModel charger : chargers) {
                response = charger;
            }
            return response;
        }
        return response;
    }

    @Override
    public ChargerModel updateCharger(String id, ChargerModel charger) {
        if (repository.existsById(id)) {
            return repository.save(charger);
        } else {
            return null;
        }
    }

    @Override
    public void deleteCharger(String id) {
        repository.deleteById(id);
    }

    @Override
    public void createCharger(ChargerModel newCharger) {

        int userId = newCharger.getUserId();
        String chargerName = newCharger.getChargerName();
        float latitude = newCharger.getLatitude();
        float longitude = newCharger.getLongitude();
        float wattage = newCharger.getWattage();

        repository.addCharger(userId, chargerName, latitude, longitude, wattage);

    }
}