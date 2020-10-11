package sparrows.ucd.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "properties")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode()
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class PropertyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",insertable = false)
    @Id
    private Long id;

    @NotNull
    @Column(name = "short_name")
    private String shortName;

    @NotNull
    @Column(name = "long_name")
    private String longName;
}
