		import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;		
		public class EmployeeDataManager {
			public static ArrayList<Storage> al=new ArrayList<Storage>();
//			main method
			public static void main(String args[]) {
//				declaring variables
				int choice=0;
				int choice2=0;
				Scanner sc2=new Scanner(System.in);
//				displaying message
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
				try {
				
				System.out.println("Enter oprion 1-8");
				choice=sc2.nextInt();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				do {
					switch(choice) {
					case 1:
//						Taking 5 inputs
						for(int i=0;i<5;i++)
						inputAndvalidate();
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
					try {
					System.out.println("Enter Option 1-8:");
					choice2=sc2.nextInt();
					choice=choice2;
					}
					catch(Exception e) {
						System.out.println(e.getCause());
					}
					System.out.println(choice);
				}while(choice>0 && choice<9);
				System.out.println("Something went wrong.....!!!");
				
		
			}
		
			private static void statistics() {
				if(al.isEmpty()) {
					System.out.println("No data to display");
				}
				else {
					int max=0;
					int min=0;
					String minName="";
					String maxName="";
					for(int i=0;i<al.size();i++) {
						if(min==0&&max==0) {
							min=al.get(i).getHours();
							max=al.get(i).getHours();
						}
						if(min>al.get(i).getSalary()) {
							min=al.get(i).getHours();
							minName=al.get(i).getName();
						}
						if(max<al.get(i).getSalary()) {
							max=al.get(i).getSalary();
							maxName=al.get(i).getName();
							
						}
					}
					System.out.println("Statistics");
					System.out.println("Maximum salary is :"+max+"Name of person getting maximum salary is :"+maxName);
					System.out.println("Minumum salary is :"+min+"Name of person getting minimum salry is: "+minName);
					
				
					}
			}
		
			private static void searchByHours() {
				if(al.isEmpty()) {
					System.out.println("no data to search");
				}
				else {
					System.out.println("Searching hours in list");
					Scanner sc=new Scanner(System.in);
					int hours;
					int count=0;
					hours=sc.nextInt();
					for(int i=0;i<al.size();i++) {
						if(al.get(i).getHours()==hours) {
							System.out.println("Name found in list:"+al.get(i).getName()+"Hours:"+al.get(i)+"Salary:"+al.get(i).getSalary());
							count++;
						}
					}
					if(count==0) {
						System.out.println("no hours found in the list");
					}
				}
				
			}
		
			private static void searchByName() {
				if(al.isEmpty()) {
					System.out.println("no data to search");
				}
				else {
					System.out.println("Searching name in list");
					Scanner sc=new Scanner(System.in);
					String name;
					int count=0;
					name=sc.nextLine();
					for(int i=0;i<al.size();i++) {
						if(al.get(i).getName().equals(name)) {
							System.out.println("Name found in list:"+al.get(i).getName()+"Hours:"+al.get(i)+"Salary:"+al.get(i).getSalary());
							count++;
						}
						
					}
					if(count==0) {
						System.out.println("No data found in the list");
					}
				}
			}
		
			private static void sortByHours() {
				if(al.isEmpty()) {
					System.out.println("No data to sort");
				}
				else {
					System.out.println("Sorting data by Hours:");	
					al.sort(Comparator.comparing(Storage::getHours));
					for(int i=0;i<al.size();i++) {
						System.out.println(al.get(i));
					}
				}
			}
		
			private static void sortByName() {
				if(al.isEmpty()) {
					System.out.println("No data to sort");
				}
				else {
					System.out.println("Sorting data by name");	
					al.sort(Comparator.comparing(Storage::getName));
					for(int i=0;i<al.size();i++) {
						System.out.println(al.get(i));
					}
				}
			}
		
			private static void display() {
				if(al.isEmpty()) {
					System.out.println("No data to display");
				}
				else {
					System.out.println("Displaying Data");
					for(int i=0;i<al.size();i++) {
						System.out.println("Name :"+al.get(i).getName()+"Hours :"+al.get(i).getHours()+"Salary:"+al.get(i).salary);
					}
				}
			}
		
			private static void inputAndvalidate() {
				try {
				String name;
				int hours;
				int salary=0;
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
				if(name!=null) {
					salary=hours*20;
					al.add(new Storage(name,hours,salary));
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
