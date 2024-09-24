import java.util.ArrayList;

public class Agenda {
	// Variáveis
	private String data;
	private ArrayList<Paciente> pacientes;
	private Medico medico;
	
	// Construtor de Agenda
	public Agenda(Medico medico) {
		pacientes = new ArrayList<Paciente>(); //Lista de pacientes
		data = ""; //data (Agenda do dia)
		this.medico = medico; //instanciando medico
	}
	
	// Método adicionar paciente na agenda
	public void adicionar(Paciente p) {
		pacientes.add(p);
	}
	
	// Método remover Paciente da Agenda **Estudar sobre e tentar melhorar
	public void remover(String cpf) {
		for (int i=0; i<pacientes.size(); i++) {
			if (pacientes.get(i).getCpf().equals(cpf)) {
				System.out.println(pacientes.get(i).getNome()+" foi removido com sucesso!");
				pacientes.remove(i);
				i=pacientes.size();
			}
		}
	}
	
	// Método pesquisar Paciente
	public void pesquisar(String cpf) {
		for (int i=0; i<pacientes.size(); i++) {
			if (pacientes.get(i).getCpf().equals(cpf)) {
				System.out.println(pacientes.get(i).getNome());
				System.out.println(pacientes.get(i).getIdade());
				System.out.println(pacientes.get(i).getTelefone());
				i=pacientes.size();
			}
		}
	}
	
	// Getters and Setters

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	} 
	
	public void apresentarListaDePacientes() {
		System.out.println("Data do atendimento: "+data+", Médico(a): "+medico.getNome()+", "+medico.getEspecialidade());
		for(int i=0; i<pacientes.size(); i++) {
			Paciente p = pacientes.get(i);
			System.out.println(i+1+", "+p.getNome()+", "+p.getTelefone());
		}
	}
}
