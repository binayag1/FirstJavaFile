		import java.util.ArrayList;
		import java.util.Scanner;
		
		public class EmployeeDataManager {
			public static void main(String args[]) {
				ArrayList<Storage> al=new ArrayList<Storage>();
				int choice=0;
				int choice2=0;
				System.out.println("        Employee Data Manager       ");
				System.out.println("--------------------------------------");
				System.out.println("1.Input and validate data ");
				System.out.println("2.Display");
				System.out.println("3.Sort By Name");
				System.out.println("4.Sort By Hours");
				System.out.println("5.Search By Name");
				System.out.println("6.Search By Hours");
				System.out.println("7.Statistics ");
				System.out.println("8.Exit");
				
				Scanner sc2=new Scanner(System.in);
				System.out.println("Enter oprion 1-8");
				choice=sc2.nextInt();
				do {
					switch(choice) {
					case 1:
						inputAndvalidate();
						System.out.println("You are good upto here\n");
						break;
						
					case 2:
						display();
						break;
					case 3:
						sortByName();
						break;
					case 4:
						sortByHours();
						break;
					case 5:
						searchByName();
						break;
					case 6:
						searchByHours();
						break;
		
					case 7:
						statistics();
						break;
		
					case 8:
						System.out.println("Thank You for using my Program");
						System.out.println("Written By Binaya Ghimrie");
						System.exit(1);
					default:
						System.out.println("You selected wrong choice");
					}
					
					System.out.println("Enter Option 1-8:");
					choice2=sc2.nextInt();
					choice=choice2;
					System.out.println(choice);
				}while(choice>0 && choice<9);
				System.out.println("Something went wrong.....!!!");
				
		
			}
		
			private static void statistics() {
				System.out.println("This is validate");		
			}
		
			private static void searchByHours() {
				// TODO Auto-generated method stub
				System.out.println("hThis is search by hours");
				
			}
		
			private static void searchByName() {
				System.out.println("This is validate");		
			}
		
			private static void sortByHours() {
				System.out.println("This is validate");		
			}
		
			private static void sortByName() {
				System.out.println("This is validate");		
			}
		
			private static void display() {
				System.out.println("This is validate");		
			}
		
			private static void inputAndvalidate() {
				ArrayList<String> al=new ArrayList<String>();
				try {
				String name;
				int hours;
				int salary;
				Scanner sc1=new Scanner(System.in);
				OUTER:
				while(true) {
					System.out.println("Please enter employee name: ");
					name=sc1.nextLine();
					if(validate(name)==false)
						continue OUTER;
					else {
						break OUTER;
					}
				}
				OUTER1:
				while(true) {
					System.out.println("Please enter hours");
					hours=sc1.nextInt();
					if(validateHours(hours)==false)
						continue OUTER1;
					else
						break OUTER1;
				}
				
				
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				
			}
		
			private static boolean validate(String naam) {
				if(!naam.contains(" ")||naam.length()>25) {
					System.out.println("Invalid Name");
					return false;
				}
				else
					return true;
				
			}
			private static boolean validateHours(int hours) {
				if(hours>60 || hours <0) {
					return false;
				}
				else
				return true;
			}
		
		}
