/*
* Class: CMSC203
* Instructor:Professor Monshi
* Description: The program is to help solve why you can't connect to the Internet.
* It has 5 steps to go through where you can respond y or n telling the program if that step helped or didn't help solve your issue. 
* Due: 2/09/2021
* Platform/compiler:Eclipse Java
* I pledge that I have completed the programming assignment
independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Azariyas Tafesse
*/
import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		char answer;
		Scanner input =new Scanner(System.in);
		// first step
		System.out.println("This WiFi Diagnostic tool will help you if you have any internet connectivity issues.\n"
				+ " \nFirst step: Reboot your Computer");
		System.out.println("Did the Rebot fix your connection issue? (y or n)");
		String letterInput;
		letterInput = input.next();
		answer = letterInput.charAt(0);
				if(answer == 'y') 
		{
			System.out.println("Rebooting the computer seemed to fix the issue.");
		}
		else // second step
		{
			System.out.println("Second step: Reboot the router.");
			System.out.println("Did the Rebot fix your connection issue? (y or n)");
			letterInput = input.next();
			answer = letterInput.charAt(0);
			if(answer == 'y') 
			{
				System.out.println("Rebooting the router seemed to fix the connection issue.");
			}
			else //Third step
			{
				System.out.println("Third step: Make sure the routers power cable is plugged in.");
				System.out.println("Did checking the power fix your connection issue? (y or n)");
				letterInput = input.next();
				answer = letterInput.charAt(0);
				if(answer == 'y') 
				{
					System.out.println("Checking the router's power seemed to fix the connection issue.");
				}
				else // fourth step
				{
					System.out.println("Fourth step:Move your computer closer to the router and try to connect .");
					System.out.println("Did moving closer to the router fix your connection issue? (y or n)");
					letterInput = input.next();
					answer = letterInput.charAt(0);
					if(answer == 'y') 
					{
						System.out.println("Moving closer to the router seemed to fix the  connection issue.");
					}
					else //Fifth step
					{
						System.out.println("Fifth step: Contact your ISP and make sure its connected to your router");
					}
				}
			}
			
		}
	input.close();
	System.out.println("Thank You for using this Wifi Diagnostic tool. Hopefully it has solved you issues.");
	}

}
