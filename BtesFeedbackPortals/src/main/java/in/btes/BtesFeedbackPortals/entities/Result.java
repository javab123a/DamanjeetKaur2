package in.btes.BtesFeedbackPortals.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
@Id
     private final long id;
     private final String question1;
     private final String question2;
     private final String question3;
     private final String question4;
     private final String question5;
     private final String question6;
     private final String question7;
     private final String question8;
     private final String question9;
     private final String question10;
     private final String question11;
     private final String question12;
     private final String question13;
     private final String question14;
     private final String question15;
     private final String question16;
     private final String question17;
     private final String question18;
     private final String question19;
     private final String question20;
     //private String status;
     public Result() {
       this.id = 0;
	this.question1= "";
	this.question2= "";
	this.question3= "";
	this.question4= "";
	this.question5= "";
	this.question6= "";
	this.question7= "";
	this.question8= "";
	this.question9= "";
	this.question10= "";
	this.question11= "";
	this.question12= "";
	this.question13= "";
	this.question14= "";
	this.question15= "";
	this.question16= "";
	this.question17= "";
	this.question18= "";
	this.question19= "";
	this.question20= "";
     }

     public Result(String question1, String question2, String question3, String question4, String question5,String question6,String question7,String question8,String question9,String question10,String question11,String question12,String question13,String question14,String question15,String question16,String question17,String question18,String question19,String question20) {
		this.id = 0;
		this.question1= question1;
		this.question2= question2;
		this.question3= question3;
		this.question4=question4;
		this.question5= question5;
		this.question6= question6;
		this.question7= question7;
		this.question8= question8;
		this.question9= question9;
		this.question10= question10;
		this.question11= question11;
		this.question12= question12;
		this.question13= question13;
		this.question14= question14;
		this.question15= question15;
		this.question16= question16;
		this.question17= question17;
		this.question18= question18;
		this.question19= question19;
		this.question20= question20;
     }
	public long getId() {
         return id;
     }
     public String getQuestion1() {
         return question1;
     }
     public String getQuestion2() {
         return question2;
     }
     public String getQuestion3() {
         return question3;
     }
     public String getQuestion4() {
         return question4;
     }
     public String getQuestion5() {
         return question5;
     }
     public String getQuestion6() {
         return question6;
     }
     public String getQuestion7() {
         return question7;
     }
     public String getQuestion8() {
         return question8;
     }
     public String getQuestion9() {
         return question9;
     }
     public String getQuestion10() {
         return question10;
     }
     public String getQuestion11() {
         return question11;
     }
     public String getQuestion12() {
         return question12;
     }
     public String getQuestion13() {
         return question13;
     }
     public String getQuestion14() {
         return question14;
     }
     public String getQuestion15() {
         return question15;
     }
     public String getQuestion16() {
         return question16;
     }
     public String getQuestion17() {
         return question17;
     }
     public String getQuestion18() {
         return question18;
     }
     public String getQuestion19() {
         return question19;
     }
     public String getQuestion20() {
         return question20;
     }
     @Override
     public String toString() {
         return "Result{" + "id=" + id +", question1=" +question1+", question2=" +question2+", question3=" +question3+", question4=" +question4+", question5=" +question5+", question6=" +question6+", question7=" +question7+", question8=" +question8+", question9=" +question9+", question10=" +question10+", question11=" +question11+", question12=" +question12+", question13=" +question13+", question14=" +question14+", question15=" +question15+", question16=" +question16+", question17=" +question17+ ", question18=" +question18+", question19=" +question19+", question20=" +question20+ '}';
     }
}