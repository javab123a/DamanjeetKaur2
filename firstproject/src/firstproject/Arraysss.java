package firstproject;
public class Arraysss {
		int marks,total,rollno;
		String name;
		Arraysss(int rollno,String name,int marks){
			this.rollno=rollno;
			this.name=name;
			this.marks=marks;
		}
		public void checkArray(Arraysss ar) {
		if(ar.marks>marks) {
			System.out.println(ar.rollno+" "+ar.name+" "+ar.marks);
		}
	}
}

