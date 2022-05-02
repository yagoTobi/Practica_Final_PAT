package volta.cars.project.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("NEWSLETTER_MEMBERS")
public class NewsletterMember {
    private @Column("USER_ID") int userId;
    private @Column("E_MAIL") String email;
}
