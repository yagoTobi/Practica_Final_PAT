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
    private @Column("USER_ID") Long userId;
    private @Column("CHARGER_ID") Long chargerId;
    private @Column("CHARGER_TYPE") String chargerType;
    private @Column("LATITUDE") float latitude;
    private @Column("LONGITUDE") float longitude;

    
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getChargerId() {
        return chargerId;
    }
    public void setChargerId(Long chargerId) {
        this.chargerId = chargerId;
    }
    public String getChargerType() {
        return chargerType;
    }
    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }
    public float getLatitude() {
        return latitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    public float getLongitude() {
        return longitude;
    }
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

   
}
