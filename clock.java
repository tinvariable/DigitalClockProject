package digitalClock;
import java.util.Scanner;

public class clock
{

	public static void main(String[] args) throws InterruptedException
	{
		boolean clock=true;
		Scanner time= new Scanner(System.in);//creates scanner called time
		System.out.println("What is the hour?");
		int hour = time.nextInt();//creates integer hour that is defined by user input after the question "What is the hour?" is asked
		System.out.println("What is the minute?");
		int minute = time.nextInt();//creates integer minute that is defined by user input after the question "What is the minute?" is asked
		System.out.println("What is the second?");
		int second = time.nextInt();//creates the integer minute that is defined by user input after the question "What is the second?" is asked
		System.out.println("Now displaying current time:");
		
		while (clock=true)//loop that will run the clock
		{
			if((hour)==23&&(minute)==59&&(second)==59)//displays time 0:0:0 if the hour=23 and minute=59 and second=59
			{
				hour=0;
				minute=0;
				second=0;
				System.out.println((hour)+":"+(minute)+":"+(second));
				Thread.sleep(1000);
			}
			else if((hour)<23&&(minute)==59&&(second)==59)//adds one to the current value of hour if minute=59 and second=59
			{
				hour++;
				minute=0;
				second=0;
				System.out.println((hour)+":"+(minute)+":"+(second));
				Thread.sleep(1000);
			}
			else if((hour)<24&&(minute)<59&&(second)==59)//adds one to the current value of minute if second=59
			{
				minute++;
				second=0;
				System.out.println((hour)+":"+(minute)+":"+(second));
				Thread.sleep(1000);
			}
			else if((hour)<24&&(minute)<60&&(second)<59)//adds one to the current value of second if second<59gmail
			{
				second++;
				System.out.println((hour)+":"+(minute)+":"+(second));
				Thread.sleep(1000);
			}
		}
		
	}

}
