import java.time.LocalDateTime;

public class Voo {
    private String numero;
    private String empresa;
    private TipoVoo tipoVoo; // Partindo ou Chegando
    private LocalDateTime horario; // Embarque ou Desembarque

    public Voo(String numero, String empresa, TipoVoo tipoVoo, LocalDateTime horario) {
        this.numero = numero;
        this.empresa = empresa;
        this.tipoVoo = tipoVoo;
        this.horario = horario;
    }

    // Getters
    public String getNumero() { return numero; }
    public String getEmpresa() { return empresa; }
    public TipoVoo getTipoVoo() { return tipoVoo; }
    public LocalDateTime getHorario() { return horario; }
}