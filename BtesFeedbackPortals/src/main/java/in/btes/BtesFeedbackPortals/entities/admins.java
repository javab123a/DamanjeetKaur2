package in.btes.BtesFeedbackPortals.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class admins {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private final String name;
     private final String email;
     private final String password;
     //private String status;
     public admins() {
         this.name = "";
         this.email = "";
         this.password = "";
     }

     public admins(String name, String email, String password) {
		this.name = name;
         this.email = email;
         this.password = password;
        // this.status = status;
     }
	public long getId() {
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
    /* public String getStatus() {
    	 return status;
     }*/
     @Override
     public String toString() {
         return "admins{" + "id=" + id + ", name=" + name + ", email=" + 
email +", password=" +password+ '}';
     }
}