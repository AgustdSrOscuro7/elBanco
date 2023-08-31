import javax.xml.bind.annotation.XmlID;

public class Cliente {
    @id
    @column(nullable=false)
    @generatedvalue(strategy=GenerationType.IDENTITY)
    private Integer idCliente;

    @column(nullable=false,length=50)
    private String nombres;

    column(nullable=false,length=50)
    private String apellido;

    column(nullable=false,length=50)
    private String documento;

    column(nullable=false,length=1)
    private String estado;

    @ManyToOne
    @JoinColumn()
    private TipoDocumento tipoDoc;
}
