package model;

import java.util.ArrayList;
import java.util.Comparator;

import enums.Sexo;

public class Paciente {
	
	//Atributos
	private String nome;
	private Sexo sexo;
	private Double peso;
	private int idade;
	private Double altura;
	
	
	//Análises
	public static void relatorioCompleto(ArrayList<Paciente> relacaoPaciente) {
		System.out.println("Total de pacientes: "+totalPaciente(relacaoPaciente));
		System.out.println("Média de idade dos homens: "+Paciente.mediaHomens(relacaoPaciente));
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "+Paciente.mulheresAltaPeso(relacaoPaciente));
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: "+Paciente.pessoasEntreIdade(relacaoPaciente));
		System.out.println("Nome do paciente mais velho: "+Paciente.pacienteVelho(relacaoPaciente).getNome().toString());
		System.out.println("Nome da mulher mais baixa: "+Paciente.mulherBaixa(relacaoPaciente).getNome().toString());
	}
	
	public static int totalPaciente(ArrayList<Paciente> relacaoPaciente) {
		return relacaoPaciente.size();
	}

	public static Long mediaHomens(ArrayList<Paciente> relacaoPaciente) {
		Long mdIdade = 0L;
		Long ttlPacienteHomem = relacaoPaciente.stream().filter(p -> p.sexo==Sexo.MASCULINO).count();
		
		for (Paciente p : relacaoPaciente) {
			if (p.sexo.equals(Sexo.MASCULINO)) {
				mdIdade += p.getIdade();
			}
		}
		return mdIdade/ttlPacienteHomem;
	}

	public static Long mulheresAltaPeso(ArrayList<Paciente> relacaoPaciente) {
		return relacaoPaciente.stream()
				.filter(p -> (p.altura>1.60 && p.altura<1.70))
				.filter(p -> p.peso>70.00).count();
	}

	public static Long pessoasEntreIdade(ArrayList<Paciente> relacaoPaciente) {
		return relacaoPaciente.stream()
				.filter(p -> (p.idade>18 && p.idade<25)).count();
	}

	public static Paciente pacienteVelho(ArrayList<Paciente> relacaoPaciente) {
		Comparator<Paciente> comparator = Comparator.comparing(Paciente::getIdade);
		Paciente maxObject = relacaoPaciente.stream().max(comparator).get();
		return maxObject;
	}

	public static Paciente mulherBaixa(ArrayList<Paciente> relacaoPaciente) {
		Comparator<Paciente> comparator = Comparator.comparing(Paciente::getAltura);
		Paciente minObject = relacaoPaciente.stream()
				.filter(p -> p.sexo.equals(Sexo.FEMININO))
				.min(comparator).get();
		return minObject;
	}
	
	
	//Constructor's
	public Paciente() {
		
	}
	
	public Paciente(String nome, Sexo sexo, Double d, int idade, Double e) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.peso = d;
		this.idade = idade;
		this.altura = e;
	}
	
	
	//Getter's and Setter's
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", sexo=" + sexo + ", peso=" + peso + ", idade=" + idade + ", altura="
				+ altura + "]";
	}
	
	
	//hashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altura == null) ? 0 : altura.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
}
