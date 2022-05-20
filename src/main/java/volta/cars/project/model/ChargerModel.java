package volta.cars.project.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("CHARGERS")
public class ChargerModel {
    private @Column("USER_ID") int userId;
    private @Column("CHARGER_ID") int chargerId;
    private @Column("CHARGER_NAME") String chargerName;
    private @Column("LATITUDE") float latitude;
    private @Column("LONGITUDE") float longitude;
    private @Column("WATTAGE") float wattage;

    public int getChargerId() {
        return this.chargerId;
    }

    public void setChargerId(int chargerId) {
        this.chargerId = chargerId;
    }

    public String getChargerName() {
        return this.chargerName;
    }

    public void setChargerName(String chargerName) {
        this.chargerName = chargerName;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getWattage() {
        return this.wattage;
    }

    public void setWattage(float wattage) {
        this.wattage = wattage;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
