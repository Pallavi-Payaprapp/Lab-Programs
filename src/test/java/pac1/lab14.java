package pac1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class lab14{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Zone ID:");
		String zoneInput=sc.nextLine();
		ZoneId zone = ZoneId.of(zoneInput);
		ZonedDateTime z=ZonedDateTime.now(zone);
		System.out.println("Current date and time"+zoneInput+" "+z);
		
		
		
	}

}
