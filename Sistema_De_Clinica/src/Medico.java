
public class Medico {
	// Variáveis
	private String nome;
	private String especialidade;
	
	// Construtor de Médico
	public Medico(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
