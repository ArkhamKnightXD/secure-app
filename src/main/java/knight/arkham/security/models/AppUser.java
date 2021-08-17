package knight.arkham.security.models;

//lo llamare appUser para diferenciarlo del user de spring security
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AppUser implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String email;
    private String password;
    private boolean isAdmin;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
}
