package dados.entidade;

public class Acomodacao {
    
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
