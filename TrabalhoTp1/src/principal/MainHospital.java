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
			String nome, email, data, CadUnico,sintomas;
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
					System.out.println("Temperatura do Paciente: ");
					paciente.temperatura = sc.nextFloat();
					System.out.println("Pressão Arterial: ");
					paciente.pressao = sc.nextFloat();
					System.out.println("Saturação de Oxigenio: ");
					paciente.saturacao = sc.nextFloat();
					System.out.println("Sintomas Relatados pelo Paciente: ");
					int add = 2;
					System.out.println("<1> Adicionar Sintomas ");
					System.out.println("<0> sair ");
					sc.nextLine();
					do {
						
						sintomas = sc.nextLine();
						paciente.Sintomas(sintomas);
						add = sc.nextInt();
						sc.nextLine();
						
					}while(add != 0);
					sintomas = sc.nextLine();
					System.out.println("Digite a Data de Hoje: ");
					data = sc.nextLine();
					recepcao.setDataNacimento(data);
				
					recepcao.CadastroPaciente(paciente);
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
