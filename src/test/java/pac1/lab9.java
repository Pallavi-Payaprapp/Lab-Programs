package pac1;

import java.util.Scanner;

public class lab9{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
        String s=sc.nextLine();
		System.out.println("Enter the choice: ");
		int choice=sc.nextInt();
        String result="";
        switch(choice){
        case 1:
            result=s+s;
            break;
        
        case 2:
            for(int i=0; i<s.length(); i++){
                if(i%2==0){
                    result+=s.charAt(i);
                } 
                else{
                    result+="#";
                }
            }
            break;
            
        case 3:
            for(int i=0; i<s.length(); i++){
                char ch=s.charAt(i);
                if(result.indexOf(ch)==-1) {
                    result+= ch;
                }
            }
            break;
            
        case 4:
            for(int i=0; i<s.length(); i++){
                char ch=s.charAt(i);
                if(i%2==0){
                    result+=ch;
                } 
                else{
                    result+=Character.toUpperCase(ch);
                }
            }
            break;

        default:
            result="Invalid choice!";
        
        }
        System.out.println("Result: " + result);
        
        

	}

}
