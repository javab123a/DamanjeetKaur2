package firstproject;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int i,j;boolean flag=false;
        System.out.println("Enter first word");
        String word1=s.nextLine().toLowerCase();
        System.out.println("Enter second word");
        String word2=s.nextLine().toLowerCase();
        if(word1.length()==word2.length ()) {
            for(i=0;i<word1.length();i++) {
                flag=false;
                for(j=0;j<word2.length();j++) {
                if(word1.charAt(i)==word2.charAt(j)) {
                    flag=true;
                    break;
                }
                }        
            }
            if(flag==true){
            System.out.println("Annagram");    
                
            }
            else {
                System.out.println("Not Annagram");
            }
        }
        else {
            System.out.println("Not Annagram");
        }

	}
}