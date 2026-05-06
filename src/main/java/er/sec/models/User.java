package er.sec.models;

import er.sec.enums.UserRole;

@Entity
@Table(name = "USERS")
@Data
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private Long id;
    private String login;
    private String password;
    private UserRole role;
}
