package in.btes.BtesFeedbackPortals.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

     @Id
     private String id;
     private  String name;
     private  String email;
     private  String password;
     private String technology;
     private String batch;
     //private String status;
     public User() {
    	 this.id = "";
         this.name = "";
         this.email = "";
         this.password = "";
         this.technology = "";
         this.batch = "";
     }
     public User(String id,String name, String email, String password, String technology, String batch) {
		this.id = id;
    	 this.name = name;
         this.email = email;
         this.password = password;
         this.technology = technology;
         this.batch = batch;
        // this.status = status;
     }
	public String getId() {
         return id;
     }
     public String getName() {
         return name;
     }

     public String getEmail() {
         return email;
     }
     public String getPassword() {
    	 return password;
     }
   public String getTechnology() {
    	 return technology;
     }
   public String getBatch() {
	   return batch;
   }
   public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	public void setTechnology(String technology2) {
		// TODO Auto-generated method stub
		this.technology = technology2;
	}

	public void setBatch(String batch2) {
		// TODO Auto-generated method stub
		this.batch = batch2;
	}

	public void setId(String id2) {
		// TODO Auto-generated method stub
		this.id = id2;
	}
     @Override
     public String toString() {
         return "User{" + "id=" + id + ", name=" + name + ", email=" + 
email +", password=" + password+ ", technology="+ technology+ ", batch=" +batch+ '}';
     }

}