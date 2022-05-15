package volta.cars.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import volta.cars.project.model.ChargerModel;
import volta.cars.project.service.ChargerService;

@RestController
@RequestMapping("/api/v1")
public class ChargerController {
    @Autowired
    private ChargerService service;

    @GetMapping("/chargerMembers")
    public ResponseEntity<Iterable<ChargerModel>> retrieveAll() {
        return ResponseEntity.ok().body(service.retrieveAll());
    }

    @GetMapping("/charger")
    public ResponseEntity<Iterable<ChargerModel>> retrieveChargerLon(@RequestParam(required=false) String longitude) {

        Iterable<ChargerModel> response = service.retrieveChargerLong(longitude);
        return ResponseEntity.ok().body(response);
    }
    @GetMapping("/charger")
    public ResponseEntity<Iterable<ChargerModel>> retrieveChargerLat(@RequestParam(required=false) String latitude) {

        Iterable<ChargerModel> response = service.retrieveChargerLat(latitude);
        return ResponseEntity.ok().body(response);
    }
 

    @GetMapping("/charger/{id}/")
    public ResponseEntity<ChargerModel> retrieveCharger(@PathVariable String id) {
        ChargerModel response = service.retrieveCharger(id);
        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/chargers/{id}/")
    public ResponseEntity<ChargerModel> updateCharger(@PathVariable String id, @RequestBody ChargerModel charger) {
        ChargerModel newCharger = service.updateCharger(id, charger);
        if (newCharger == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newCharger);
    }

    @DeleteMapping("/chargers/{id}")
    public ResponseEntity<ChargerModel> deleteCharger(@PathVariable String id) {
        service.deleteCharger(id);
        return ResponseEntity.noContent().build();
    }
}
