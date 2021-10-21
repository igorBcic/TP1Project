package principal;

import java.util.Scanner;

import entities.Paciente;
import entities.Recepcionista;
import entities.Triagem;

public class MainHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recepcionista recepcao = new Recepcionista();
		Triagem triagemPaciente = new Triagem();
		Paciente paciente = new Paciente();
		float temperatura, pressao, oxigenio;
	    boolean paladar,oufato;
		int nivelGravidade;
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out
					.println("\n\n### ### ### ### ### Hpvate ### ### ### ### ###");
			System.out.println("\n                ===============================");
			System.out.println("                  |     1 - Funcionario         |");
			System.out.println("                  |     2 - Paciente            |");
			System.out.println("                  |     0 - Sair                |");
			System.out.println("                  ==============================\n");
			
			System.out.print("\n");
			opcao = sc.nextInt();
			String nome, email, data, CadUnico;
			String cep, cpf, telefone;
			nome = "Maria Rafaela";
			recepcao.setNome(nome);
			email = "Maria_R@gmail.com";
			recepcao.setEmail(email);
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("Area do Recepcionista");
				System.out.println("\n                ======================================");
				System.out.println("                  |     1 - Cadastrar Paciente         |");
				System.out.println("                  |     2 - Historico de Atividades    |");
				System.out.println("                  |     0 - Sair                       |");
				System.out.println("                  =====================================\n");
				opcao = sc.nextInt();
				sc.nextLine();
				
				
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do Paciente");
					nome = sc.nextLine();
					paciente.setNome(nome);
					System.out.println("Digite o Cadastro Unico");
					CadUnico = sc.nextLine();
					paciente.setCadastroUnico(CadUnico);
					System.out.println("Digite a Data de nascimento: ");
					data = sc.nextLine();
					paciente.setDataNacimento(data);
					System.out.println("Digite o CEP: ");
					cep = sc.nextLine();
					paciente.setCep(cep);
					System.out.println("Digite o CPF: ");
					cpf = sc.nextLine();
					paciente.setCpf(cpf);
					System.out.println("Digite o Telefone: ");
					telefone = sc.nextLine();
					paciente.setTelefone(telefone);
					sc.nextLine();
					System.out.println("Digite a Data de Hoje: ");
					data = sc.nextLine();
					recepcao.setDataNacimento(data);
					recepcao.CadastroPaciente(paciente);
					System.out.println("Cadastro feito com sucesso! ");
					System.out.println("Triagem do Passiente");
					System.out.println("Informe a Temperatura: ");
					temperatura = sc.nextFloat();
					paciente.triagem.setTemperatura(temperatura);
					System.out.println("Informe a Pressão Arterial: ");
					pressao = sc.nextFloat();
					paciente.triagem.setPressao(pressao);
					System.out.println("Informe O nivel de Oxigenio: ");
					oxigenio = sc.nextFloat();
					paciente.triagem.getOxigenio();
					System.out.println("Perda de paladar: ");
					System.out.println("<1> Sim: ");
					System.out.println("<2> Não: ");
					opcao = sc.nextInt();
					if(opcao == 1) {
						paciente.triagem.paladar = true;
					}else {
						paciente.triagem.paladar = false;
					}
					System.out.println("Perda de Oufato: ");
					System.out.println("<1> Sim: ");
					System.out.println("<2> Não: ");
					opcao = sc.nextInt();
					if(opcao == 1) {
						paciente.triagem.oufato = true;
					}else {
						paciente.triagem.oufato = false;
					}
					break;
					
				case 2:
					recepcao.HistoricoSistema();
					break;
				}
			
				break;
			case 2:
				System.out.println("Paciente: Acesse seu Historico");
				paciente.HistoricoSistema();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
		sc.close();

	}

}
