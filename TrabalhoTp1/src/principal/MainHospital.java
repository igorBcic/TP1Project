package principal;

import java.util.Scanner;

import entities.Paciente;
import entities.Recepcionista;

public class MainHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recepcionista recepcao = new Recepcionista();
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
			String nome, email, data, CadUnico;
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastro Recepcionista");
				System.out.println("Cadastre seu nome completo:");
				nome = sc.nextLine();
				recepcao.setNome(nome);
				System.out.println("Cadastre seu email:");
				email = sc.nextLine();
				recepcao.setEmail(email);
				System.out.println("Cadastre sua data de nascimento:");
				data = sc.nextLine();
				recepcao.setDataNacimento(data);
				
				System.out.println("Digite o nome do Paciente");
				nome = sc.nextLine();
				paciente.setNome(nome);
				System.out.println("Digite o nome o Cadastro Unico");
				CadUnico = sc.nextLine();
				paciente.setCadastroUnico(CadUnico);
				System.out.println("Digite a Data: ");
				data = sc.nextLine();
				paciente.setDataNacimento(data);
				recepcao.CadastroPaciente(paciente);
				recepcao.HistoricoSistema();
		 
				
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
