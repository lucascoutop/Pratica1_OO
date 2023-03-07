package Faculdade;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	private int horasAula;
	
	public static void main(String args[]) {
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
		empregado.setaDadosEmpregado(empregado);
		
		System.out.println("Gastos: " + empregado.getGastos());
		System.out.println("Info: " + empregado.getInfo());
	}
	
	double getGastos(){
		double bonus = horasAula * 40; 
		salario += bonus;
		return this.salario;
	}
	
	String getInfo(){
		return "nome: " + this.nome +  " com salário: "  + this.salario;
	}
	
	public void setaDadosEmpregado(EmpregadoDaFaculdade empregado) {
		empregado.setNome("Lucas Agenor");
		empregado.setSalario(1800);
		empregado.setHorasAula(8);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHorasAula() {
		return horasAula;
	}

	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}
	
	
}
