
public class tiposdoc{
    @id
    @Column(nullable=false)
    @generatedvalue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false,length=10)
    private String descripcion;
}
