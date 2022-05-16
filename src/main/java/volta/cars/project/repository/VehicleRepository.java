package volta.cars.project.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.VehicleModel;

public interface VehicleRepository extends CrudRepository<VehicleModel, String> {

    //Como hacer un Post 
    @Modifying
    @Query("INSERT INTO Vehicle_MEMBERS (E_MAIL) VALUES (:email)")
    public void createVehicleMember(String email);
}
