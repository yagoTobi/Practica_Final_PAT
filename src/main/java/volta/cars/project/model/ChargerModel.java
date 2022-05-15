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
    private @Column("CHARGER_ID") String chargerId;
    private @Column("CHARGER_NAME") String chargerName;
    private @Column("LATITUDE") float latitude;
    private @Column("LONGITUDE") float longitude;
    private @Column("WATTAGE") float wattage;
    public String getId() {
        return chargerId;
    }
    public void setId(String chargerId) {
        this.chargerId = chargerId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
