import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// vetor de 10 indices; simboliza todos os quartos vazio
		
		Clients[] allRooms = new Clients[9];
		
		System.out.println("How many rooms will be rented?");
		// n quartos alugados
		
		int n = sc.nextInt();
		
		Clients client = new Clients();
		
		for(int i = 1; i< n+1; i++) {
			System.out.println("Rent #" + i);
			
			System.out.print("Name: ");
			client.setName(sc.nextLine());
			
			System.out.println("Email: ");
			client.setEmail(sc.nextLine());
			
			System.out.println("Room: ");
			client.setRoom(sc.nextInt());
			
			
	}
		System.out.println("Busy rooms: ");
		System.out.println(client);
		sc.close();
	}

}
