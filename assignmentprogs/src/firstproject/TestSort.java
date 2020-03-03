package firstproject;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class TestSort {
		public static void main(String[] args)throws IOException {
			ArrayList<Arraysss>al=new ArrayList<Arraysss>();
			al.add(new Arraysss(101,"Kashveer",250));
			al.add(new Arraysss(102,"Daman",220));
			al.add(new Arraysss(103,"Abiee",150));
			al.add(new Arraysss(104,"Aman",234));
			al.add(new Arraysss(105,"Mehak",130));
		//	Collections.sort((List<T>) al);
			for(Arraysss ar:al) {
				//if(ar.marks>ar.marks)
				System.out.println(ar.rollno+" "+ar.name+" "+ar.marks);
			}
	}

}
