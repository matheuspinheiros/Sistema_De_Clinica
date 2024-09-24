
public class Main {
	public static void main(String[] args) {
		
		// Cria o Medico Olival e Gabriela usando os Construtores da Classe Médico, 
		// passando apenas os parametros pros construtores
		Medico olival = new Medico("Olival", "Oftalmologista");
		Medico gabriela = new Medico("Gabriela", "Dermatologista");
		
		// Mesma coisa só que criando os pacientes
		Paciente p1 = new Paciente("Pedro", "000", 30, "0000");
		Paciente p2 = new Paciente("Karol", "111", 25, "0000");
		Paciente p3 = new Paciente("Marcela", "222", 20, "0000");
		Paciente p4 = new Paciente("Roberto", "333", 22, "0000");
		
		// criando a agenda
		Agenda agenda1 = new Agenda(olival);
		agenda1.setData("22/10/2024"); //setando a data
		agenda1.adicionar(p1); //adicionando paciente
		agenda1.adicionar(p4); //adicionando paciente
		agenda1.apresentarListaDePacientes(); //apresentando lista de pacientes no Console
		
		// Mesma coisa porém para a médica Gabriela
		Agenda agenda2 = new Agenda(gabriela);
		agenda2.setData("25/10/2024");
		agenda2.adicionar(p2);
		agenda2.adicionar(p3);
		agenda2.apresentarListaDePacientes();
		
	}
}
