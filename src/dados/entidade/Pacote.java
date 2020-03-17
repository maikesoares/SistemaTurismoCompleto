package dados.entidade;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Pacote {
    
    public Pacote(){}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.idPacote);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pacote other = (Pacote) obj;
        if (!Objects.equals(this.idPacote, other.idPacote)) {
            return false;
        }
        return true;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPacote;
    private LocalDate dataInicial;
    private LocalDate dataSaida;
    private float precoPacote;
    private String nomeDestino;
    private Boolean tipoTransporte;
    private String descricaoPacote;
    @ManyToOne
    private Acomodacao idAcomodacao;

    public Integer getIdPacote() {
        return idPacote;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public float getPrecoPacote() {
        return precoPacote;
    }

    public String getNomeDestino() {
        return nomeDestino;
    }

    public Boolean getTipoTransporte() {
        return tipoTransporte;
    }

    public String getDescricaoPacote() {
        return descricaoPacote;
    }

    public Acomodacao getIdAcomodacao() {
        return idAcomodacao;
    }

    public void setIdPacote(Integer idPacote) {
        this.idPacote = idPacote;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setPrecoPacote(float precoPacote) {
        this.precoPacote = precoPacote;
    }

    public void setNomeDestino(String nomeDestino) {
        this.nomeDestino = nomeDestino;
    }

    public void setTipoTransporte(Boolean tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public void setDescricaoPacote(String descricaoPacote) {
        this.descricaoPacote = descricaoPacote;
    }

    public void setIdAcomodacao(Acomodacao idAcomodacao) {
        this.idAcomodacao = idAcomodacao;
    }
    
    
    
}
