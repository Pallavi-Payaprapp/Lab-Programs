package pac1;

import java.util.Scanner;

public class lab10{

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        boolean isPositive=true;
        for(int i=0; i<s.length()-1; i++){
            if (s.charAt(i)>s.charAt(i+1)){
                isPositive=false;
                break;
            }
        }
        if (isPositive){
            System.out.println("It is a positive string.");
        } 
        else{
            System.out.println("It is not a positive string.");
        }


	}

}

