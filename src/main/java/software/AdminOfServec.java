package software;





public class AdminOfServec {

	private String username;
	private String pasword;
	private Boolean login;
	
	public AdminOfServec() {
		super();
	    this.pasword="";
	    this.username="";
		this.login = false;
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public Boolean getLogin() {
		return login;
	}
	public void setLogin(Boolean login) {
		this.login = login;
	}
	
	public Boolean login() {
		
		for (int i = 0; i <Servec.admins.size(); i++)
	
		{
			
		
		}
		return false;
	}
	
	public boolean logout(String username) {
		
		for (int i = 0; i < Servec.admins.size(); i++)
	
		{
			
	
			
		}
		return false;
	
	}
}
