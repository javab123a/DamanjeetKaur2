package in.btes.BtesFeedbackPortals.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class adminEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private String questions;
     private final String option1;
     private final String option2;
     private final String option3;
     private final String option4;
     private final String option5;
     //private String status;
     public adminEntity() {
       this.questions = "";
       this.option1 = "";
       this.option2 = "";
       this.option3 = "";
       this.option4 = "";
       this.option5 = "";
     }

     public adminEntity(String questions, String option1, String option2, String option3, String option4, String option5) {
		this.questions = questions;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
     }
	public long getId() {
         return id;
     }
     public void setId(long id) {
		this.id = id;
	}

	public String getQuestions() {
         return questions;
     }
     public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOption1() {
         return option1;
     }
     public String getOption2() {
         return option2;
     }
     public String getOption3() {
         return option3;
     }
     public String getOption4() {
         return option4;
     }
     public String getOption5() {
         return option5;
     }
     
     @Override
     public String toString() {
         return "adminEnity{" + "id=" + id + ", questions=" + questions + ", option1=" +option1 + ", option2=" +option2 + ", option3=" +option3 + ", option4=" +option4 + ",option5=" +option5+ '}';
     }
}