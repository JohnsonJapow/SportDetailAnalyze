/*
*SportActivityApp.java
*@author YuehMingTeng
*08/11/2022
*/
import javax.swing.JOptionPane;

public class SportActivityApp{

	public static void main(String args[]){

	//create variable

	String sports [];                   //detail 1
	float temperature [];               //detail 2
	int duration[];                     //mandatory statement
	int selectOption;                   //functionality
	int count;                          //continue or exit menu
	int times;                          //for record the times of item entering

	//declare data length of array
	sports=new String[5000];
	temperature=new float[5000];
	duration= new int[5000];

	// declare & create constructor

	SportActivityData mySAD= new SportActivityData();
	SportActivity mySA= new SportActivity();


	//initiate variable
	times=0;
	selectOption=0;
	count=0;
	sports[0]="null";
	temperature[0]=0;
	duration[0]=0;

	//inform user the details that need to be provided
	JOptionPane.showMessageDialog(null,"Please provide the recorded duration,the name, the recorded temperature of sports");

	//create menu

		while(count!=1){
		//use try and catch to avoid invalid input
			try{
				selectOption=Integer.parseInt(JOptionPane.showInputDialog(null,"Application Menu - Item Type: Sport Activity \n1 - Add an item\n2 - Displayed the details of the first  entered item\n3 - Displayed the details of the last  entered item\n4 - Calculate and display the average value of the mandatory state of all the\nitems entered until that point\n5 - Calculate and display the item with the lowest mandatory state\n6 - Exit application\nEnter your choice:"));

				//prompt user to enter value, compute value or exit

				switch(selectOption){

					//prompt user to input detail into item type

					case (1):

						sports[times]=JOptionPane.showInputDialog(null,"Please enter a sport>>>");

						//ask user to input valid item

						do{
							duration[times]=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the duration (seconds) of this sport (length between 30 seconds inclusive to 28800 seconds inclusive)>>>"));
							//for testing>>>> System.out.println(i);
							}

						//if the value is valid, send the value to another classes
						//if it is invalid, user will been prompt to input again

						while((30>duration[times])||(duration[times]>28800));
							//for testing>>>> System.out.println(i);
							temperature[times]=Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the temperature (Celsius) of this sport>>>"));

							//set method

							mySA.setTimes(times);
							mySA.setDuration(duration);
							mySAD.setTimes(times);
							mySAD.setTemperature(temperature);
							mySAD.setSports(sports);
							mySAD.setDuration(duration);

						times++;  //for recording the times of entered items

					break;

					// ask SportActivityData display all details of the first entered item

					case (2):

					mySAD.computeFirst();
					break;

					// ask SportActivityData display all details of the last entered item

					case (3):

					mySAD.computeLast();
					break;

					//ask SportActivity compute and display average of entered duration
					case (4):

					mySA.computeAvg();
					break;

					//ask SportActivity compute and display lowest entered duration
					case (5):

					mySA.computeLow();
					break;

					//leave the menu

					case (6):
					count++;
					break;

					//alert: remind user input number 1 to 6

					default:
					JOptionPane.showMessageDialog(null,"Please select function 1 to 6");

				}
			}//try
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"Something went wrong");
			}//catch
		}//while
	}//main
}//class