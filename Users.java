package beans;

public class Users {
	private int id;
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users() {
		super();
	}
	public Users(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
}
