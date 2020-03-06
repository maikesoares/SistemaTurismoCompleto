package dados.entidade;

import java.time.LocalDate;

public class Venda {
    
    private Integer codVenda;
    private Cliente clienteCpfCliente;
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
