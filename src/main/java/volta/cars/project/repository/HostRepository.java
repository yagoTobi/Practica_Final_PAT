package volta.cars.project.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.HostModel;

public interface HostRepository extends CrudRepository<HostModel, String> {

    //Como hacer un Post 
    @Modifying
    @Query("INSERT INTO HOSTS (USER_IDE, HOURLY_RATE,RATING, NUMBER_HOSTED, IDENTIFICATION) VALUES (:userId, :vehicleId, :hourlyRate, :rating, :numberHosted, :identification)")
    public void addHost(int userId, float hourlyRate, int rating, int numberHosted, String identification);


}
