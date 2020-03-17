package dados.entidade;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Acomodacao {
    
    
    public Acomodacao(){}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idAcomodacao);
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
        final Acomodacao other = (Acomodacao) obj;
        if (!Objects.equals(this.idAcomodacao, other.idAcomodacao)) {
            return false;
        }
        return true;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAcomodacao;
    private Integer idPacote;
    private Boolean statusAcomodacao;

    public Integer getIdAcomodacao() {
        return idAcomodacao;
    }

    public Integer getIdPacote() {
        return idPacote;
    }

    public Boolean getStatusPacote() {
        return statusAcomodacao;
    }

    public void setIdAcomodacao(Integer idAcomodacao) {
        this.idAcomodacao = idAcomodacao;
    }

    public void setIdPacote(Integer idPacote) {
        this.idPacote = idPacote;
    }

    public void setStatusPacote(Boolean statusPacote) {
        this.statusAcomodacao = statusPacote;
    }
    
    
    
}
