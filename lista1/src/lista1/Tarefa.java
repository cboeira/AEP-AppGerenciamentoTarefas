package lista1;

@Entity
public class Tarefa {

	public enum Status {
		NAO_INICIADA,
		EM_PROGRESSO,
		TERMINADA,
		BLOQUEADA;
	}
	
	public Tarefa() {}
	
	@Id
	int id;
	String descricao;
	String dataCriacao;
	Status situacao;
	String responsavel;
	float horasEstimadas;
	
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return descricao;
    }
     
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDataCriacao() {
        return dataCriacao;
    }
     
    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public String getResponsavel() {
        return responsavel;
    }
     
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public float getHorasEstimadas() {
        return horasEstimadas;
    }
 
    public void setHorasEstimadas(float horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
	
}
