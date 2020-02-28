//print the marks,name,id of three students by input it.
package firstproject;
import java.io.*;
public class Student {
	//instance variables
	 int i; String reg_id,name;
	float marks;
	static final String College="PIMT";
	Student s6;
	Student(String reg,String na,float marks){
		reg_id=reg;
		name=na;
		this.marks=marks;
	}
	//instance variables
	void disp()
	{
		System.out.println("Register ID: "+reg_id+" "+"Name= "+name+" "+"marks: "+marks);
	}
	static void cal_highest(Student stud[]) {
		//int highest;
		System.out.println(stud[0].name);
	}
	public static void main(String args[])throws IOException {
		int i; String reg,name;
		float marks;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Array of Objects
		Student[] stu=new Student[2];
		for(i=0;i<stu.length;i++) {
			System.out.println("Enter Register Id: ");
			reg=br.readLine();
			System.out.println("Enter Name: ");
			name=br.readLine();
			System.out.println("Enter Makrs: ");
			marks=Float.parseFloat(br.readLine());
			stu[i]=new Student(reg,name,marks);
		}
		for(i=0;i<stu.length;i++) {
			stu[i].disp();
		}
		cal_highest(stu);
	}
}