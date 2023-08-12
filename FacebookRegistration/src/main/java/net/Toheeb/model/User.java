//Let's create a User JavaBean or model class which we will use in JSP action tags.


package net.Toheeb.model;

public class User{
	
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String address;
    private String contact;
    
    
    public User() {
		super();
	}
	public User(String first_name, String last_name, String email, String password, String address, String contact) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}
	public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLastName(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
	
	

}
