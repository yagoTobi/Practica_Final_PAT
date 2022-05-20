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
    private @Column("LATITUDE") float latitude;
    private @Column("LONGITUDE") float longitude;
    private @Column("CHARGER_TYPE") String chargerType;
    
    public Long getUserId() {
        return userId;
    }
    public String getChargerType() {
        return chargerType;
    }
    
    public float getLatitude() {
        return latitude;
    }
    public float getLongitude() {
        return longitude;
    }
}
