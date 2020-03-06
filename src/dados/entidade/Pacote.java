package dados.entidade;

import java.time.LocalDate;

public class Pacote {
    
    private Integer idPacote;
    private LocalDate dataInicial;
    private LocalDate dataSaida;
    private float precoPacote;
    private String nomeDestino;
    private Boolean tipoTransporte;
    private String descricaoPacote;
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
