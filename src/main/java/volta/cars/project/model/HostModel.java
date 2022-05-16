package volta.cars.project.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("HOSTS")
public class HostModel {
    private @Column("USER_ID") int userId;
    private @Column("HOST_ID") int hostId;
    private @Column("VEHICLE_ID") int vehicleId;
    private @Column("CHARGER_LOCATION") String location;
    private @Column("HOURLY_RATE") float hourlyRate;
    private @Column("RATING") int rating;
    private @Column("NUMBER_HOSTED") int numberHosted;
    private @Column("IDENTIFICATION") String identification;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHostId() {
        return this.hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public int getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumberHosted() {
        return this.numberHosted;
    }

    public void setNumberHosted(int numberHosted) {
        this.numberHosted = numberHosted;
    }

    public String getIdentification() {
        return this.identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
