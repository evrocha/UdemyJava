// classe que vai conter os metodos e atributos p criacao de conta	

public class Conta {
	private int numConta;
	private String nomeTitular;
	private double valorInicial; //   um const sem parametro
	// p cada saque feito -5 reais
	
	
	// <!-- MÉTODO GET E SET
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getValorInicial() {
		return valorInicial;
	}
	
	// construtor vazio
	public Conta() {
		
	}
	
	
	// deposit method
	public void depositar(double valorAdd) {
		valorAdd += valorInicial;
	}
	public void retirar(double valorRetirar) {
		valorInicial -= valorRetirar + 5;
	}
	@Override
	public String toString() {
		return "Account " + numConta + ", Holder: " + nomeTitular + ", Balance: $" + valorInicial;
	}
	
	public Conta(String texto) {
		String[] arrayLinha = texto.split(",");
		
		String[] arrayNumConta = arrayLinha[0].split(" ");
		
		String[] arrayNomeTitular = arrayLinha[1].split(":");
		
		String[] arrayBalance = arrayLinha[2].split(":");
		
//		Conta conta2 = new Conta(arrayLinha);
//		this.conta = conta;
	}
	
	// CONSTRUTOR COM TODOS OS PARAMETROS
	public Conta(int numConta, String nomeTitular, double valorInicial) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		depositar(valorInicial);
	}
	// CONSTRUTOR SEM O VALOR INICIAL
		public Conta(int numConta, String nomeTitular) {
		
			this.numConta = numConta;
			this.nomeTitular = nomeTitular;
			
		}
	
}
