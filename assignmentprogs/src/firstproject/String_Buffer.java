package firstproject;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Kashveer");
		StringBuffer s=new StringBuffer(sb);
		//sb.reverse();
		if(s.toString().equals(sb.reverse().toString())) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
	}

}
