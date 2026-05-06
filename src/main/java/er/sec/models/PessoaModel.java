package er.sec.models;

@Entity
@Table(name = "tbl_pessoas")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private Long id;
    private String nome;
}
