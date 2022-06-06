
public class Clients {
	private String name, email;
	// var q indica o quarto alocado p cliente
	private int room;
	
	
	@Override
	public String toString() {
		return "Clients [name=" + name + ", email=" + email + ", room=" + room + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	} 
}
