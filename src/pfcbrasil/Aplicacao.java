package pfcbrasil;

import java.util.ArrayList;
import java.util.Scanner;

import enums.Sexo;
import model.Paciente;

public class Aplicacao {
	
	//Atributos 
	private static Scanner sc = new Scanner(System.in);
	private static int op;
	private static Paciente p01;
	private static Paciente p02;
	private static Paciente p03;
	private static Paciente p04;
	private static Paciente p05;
	private static Paciente p06;
	private static Paciente p07;
	private static ArrayList<Paciente> relacaoPaciente;
	
	//Criando relação de Paciente
	static {
		p01 = new Paciente("Murillo Pezzuol", Sexo.MASCULINO, 69.80, 21, 1.15);
		p02 = new Paciente("Gabriella Monteiro", Sexo.FEMININO, 75.00, 19, 1.67);
		p03 = new Paciente("Carlos Gabriel", Sexo.MASCULINO, 82.20, 25, 1.72);
		p04 = new Paciente("Matheus Rodrigues", Sexo.MASCULINO, 45.75, 17, 1.75);
		p05 = new Paciente("Manuela Zambelli", Sexo.FEMININO, 25.00, 6, 1.20);
		p06 = new Paciente("Carla Roxa", Sexo.FEMININO, 71.10, 22, 1.61);
		p07 = new Paciente("Carolina Costa", Sexo.FEMININO, 43.50, 10, 1.55);
		
		//Preenchendo Lista
		relacaoPaciente = new ArrayList<>();
		relacaoPaciente.add(p01);
		relacaoPaciente.add(p02);
		relacaoPaciente.add(p03);
		relacaoPaciente.add(p04);
		relacaoPaciente.add(p05);
		relacaoPaciente.add(p06);
		relacaoPaciente.add(p07);
	}
	
	//Aplicação
	public static void main(String[] args) {

		//Listagem da relação de Pacientes
		System.out.println("RELAÇÃO DE PACIENTES");
		System.out.println("________________________________________________");
		for (Paciente p : relacaoPaciente) {
			System.out.println("------------------------------------------------");
			System.out.println("Nome: "+p.getNome());
			System.out.println("Sexo: "+p.getSexo());
			System.out.println("Peso: "+p.getPeso());
			System.out.println("Idade: "+p.getIdade());
			System.out.println("Altura: "+p.getAltura());
			System.out.println("------------------------------------------------");
		}
		System.out.println("FIM");
		
		
		//Exibindo um relatório completo
		try {
			System.out.println();
			System.out.print("DESEJA EXIBIR UM RELATÓRIO COMPLETO? 1 (SIM) OU 2 (NÃO): ");
			op = sc.nextInt(); 
			System.out.println();
			System.out.println();
			
			while (op!=1 && op!=2) {
				System.out.print("Você digitou o número correspondente inválido. Favor digite novamente: ");
				op = sc.nextInt();
			}
			
			if(op==1) {
				System.out.println("RELATÓRIO COMPLETO");
				System.out.println("________________________________________________");
				Paciente.relatorioCompleto(relacaoPaciente);
				System.out.println("________________________________________________");
			}else if (op==2){
				System.out.println("Emissão de relatório não requisitado!");
			}
		} catch (Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
	}

}
