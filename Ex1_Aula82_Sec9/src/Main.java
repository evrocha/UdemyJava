import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta1 = new Conta();
		
		System.out.println("Enter account number: ");
		conta1.setNumConta(sc.nextInt());
		
		System.out.println("Enter account holder: ");
		conta1.setNomeTitular(sc.next());
		
		System.out.println("Is there  na initial deposit (y/n)?");
		char op = sc.next().charAt(0);
		
		if (op=='y') {
			System.out.println("Enter initial deposit value: ");
			conta1.depositar(sc.nextInt());
			System.out.println("Updated Account data: ");
			System.out.println(conta1);
		}
		else {
		System.out.println(conta1);}


		System.out.println("Enter a deposit value: ");
		conta1.depositar(sc.nextDouble());
		System.out.println("Updated Account data: ");
		System.out.println(conta1);

		System.out.println("Enter a withdraw value: ");
		conta1.retirar(sc.nextDouble());
		System.out.println("Updated Account data: ");
		System.out.println(conta1);

		
		sc.close();
	}

}
