package dados.entidade;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {
    
    public Cliente(){}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cpfCliente);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpfCliente, other.cpfCliente)) {
            return false;
        }
        return true;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cpfCliente;
    private String nome;
    private LocalDate dataNascimentoCliente;
    private String rgCliente;

    public Integer getCpfCliente() {
        return cpfCliente;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setCpfCliente(Integer cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimentoCliente(LocalDate dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }
    
    
    
}
