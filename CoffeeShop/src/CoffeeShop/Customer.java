package CoffeeShop;

public class Customer {
    private int ID;
    public String name;
    private String mail;
    private String password;
    private int star;
    
    Customer(){
        name = "no name";
        setID(213214);
        setMail("aaa@aaa.aaa");
        setPassword("123456");
        star = 0;
    }
    
    Customer(int ID){
        this.setID(ID);
    }
      
    
    Customer(int ID, String Name, String mail, String password){
        this.setID(ID);
        this.name = Name;
        this.setMail(mail);
        this.setPassword(password);
        
        star = 0;
        if(Name.equals("Tugce"))
            star = 13;
    }
    
    public int increaseStar() {
        star++;
        return star;
    }
    public int getStar() {
        return star;
    }
    public void resetstar() {
        star= 0;
        
    }
    
    public void changePassword(String password){
        this.setPassword(password);
    }

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
