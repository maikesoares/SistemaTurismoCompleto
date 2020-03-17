package dados.entidade;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Venda {
    
    public Venda(){}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.codVenda);
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.codVenda, other.codVenda)) {
            return false;
        }
        return true;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codVenda;
    
    @ManyToOne
    private Cliente clienteCpfCliente;
    
    @ManyToOne
    private Pacote pacoteIdPacote;
    private LocalDate dataVenda;

    public Integer getCodVenda() {
        return codVenda;
    }

    public Cliente getClienteCpfCliente() {
        return clienteCpfCliente;
    }

    public Pacote getPacoteIdPacote() {
        return pacoteIdPacote;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

    public void setClienteCpfCliente(Cliente clienteCpfCliente) {
        this.clienteCpfCliente = clienteCpfCliente;
    }

    public void setPacoteIdPacote(Pacote pacoteIdPacote) {
        this.pacoteIdPacote = pacoteIdPacote;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
    
}
