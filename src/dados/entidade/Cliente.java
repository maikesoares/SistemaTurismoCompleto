package dados.entidade;

import java.time.LocalDate;

public class Cliente {
    
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
