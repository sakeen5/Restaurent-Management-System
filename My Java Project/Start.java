import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("------Welcome to our console FoodCourt Application-------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Restaurant Management");
			System.out.println("	3. Restaurant FoodItem Management");
			System.out.println("	4. FoodItem Quantity Add-Sell");
			System.out.println("	5. Exit\n");

			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				    System.out.println("--------------------------------");
					System.out.println("You have choosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Remove Existing Employee");
					System.out.println("	3. Show All Employees");
					System.out.println("	4. Search an Employee");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Employee\n");
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Id: ");
							String empid1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setName(name1);
							e1.setEmpid(empid1);
							e1.setSalary(salary1);
							
							fc.insertEmployee(e1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = fc.getEmployee(empId2);
							
							if(e2 != null)
							{
								fc.removeEmployee(e2);
							}
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							
							fc.showAllEmployees();
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search an employee");
							System.out.print("Enter Employee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = fc.getEmployee(empId4);
							
							if(e4 !=null)
							{
								System.out.println();
								System.out.println("Employee Name: "+e4.getName());
								System.out.println("Employee Id: "+e4.getEmpid());
								System.out.println("Employee Salary: "+e4.getSalary());
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 2:
				    System.out.println("--------------------------------");
					System.out.println("You have choosen Restaurant Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Restaurant");
					System.out.println("	2. Remove Existing Restaurant");
					System.out.println("	3. Show All Restaurant");
					System.out.println("	4. Search a Restaurant");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Restaurant\n");
							
							System.out.print("Enter Restaurant RID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
						
							fc.insertRestaurant(r1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = fc.getRestaurant(rid2);
							
							if(r2 != null)
							{
								fc.removeRestaurant(r2);
							}
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Restaurants");
							fc.showAllRestaurants();
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid4 = sc.next();
							
							Restaurant r4 = fc.getRestaurant(rid4);
							
							if(r4 !=null)
							{
								System.out.println();
								System.out.println("Restaurant RID: "+r4.getRid());
								System.out.println("Restaurant Name: "+r4.getName());
								fc.showAllRestaurants();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					
					
					System.out.println("--------------------------------");
					break;
					
				case 3:
				    System.out.println("--------------------------------");
					System.out.println("You have choosen Restaurant FoodItem Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New FoodItem");
					System.out.println("	2. Remove Exixting FoodItem");
					System.out.println("	3. Show All FoodItems");
					System.out.println("	4. Search A FoodItem");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New FoodItem\n");
							
							FoodItem f = null;
							
							System.out.println("Which type of FoodItem do you want to Order?\n");
							System.out.println("	1. MainDish");
							System.out.println("	2. Appitizers");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
							    MainDish md = new MainDish();
								
								System.out.print("Enter FoodItem ID: ");
								String fid1 = sc.next();
								System.out.print("Enter FoodItem Name: ");
								String name1 = sc.next();
								System.out.print("Enter FoodItem Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter FoodItem Price: ");
								double p1 = sc.nextDouble();
								System.out.print("Enter MainDish Category : ");
								String mdc1 = sc.next();
								
								md.setFid(fid1);
								md.setName(name1);
								md.setAvailableQuantity(aq1);
								md.setPrice(p1);
								md.setCategry(mdc1);
								
								f = md;
								
							}
							else if(type == 2)
							{
								Appitizers ap = new Appitizers();
								
								System.out.print("Enter FoodItem ID: ");
								String fid2 = sc.next();
								System.out.print("Enter FoodItem Name: ");
								String name2 = sc.next();
								System.out.print("Enter FoodItem Available Quantity: ");
								int aq2 = sc.nextInt();
								System.out.print("Enter FoodItem Price: ");
								double p2 = sc.nextDouble();
								System.out.print("Enter MainDish Size : ");
								String mdc2 = sc.next();
								
								ap.setFid(fid2);
								ap.setName(name2);
								ap.setAvailableQuantity(aq2);
								ap.setPrice(p2);
								ap.setSize(mdc2);
								
								f = ap;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(f!= null)
							{
								System.out.print("Enter Restaurant Id: ");
								String fid1 = sc.next();
								fc.getRestaurant(fid1).insertFoodItem(f);
							}
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove an Existing FoodItem\n:");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter FoodItem ID: ");
							String f2 = sc.next();
							
							fc.getRestaurant(rid2).removeFoodItem(fc.getRestaurant(rid2).getFoodItem(f2));
							
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All FoodItems\n");
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							
							fc.getRestaurant(rid3).showAllFoodItems();
							
							System.out.println("########################");
							break;
						
						case 4: 
						
							System.out.println("########################");
							System.out.println("Search A FoodItem\n");
							
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
							System.out.print("Enter FoodItem ID: ");
							String fid4 = sc.next();
							
							FoodItem f4 = fc.getRestaurant(rid4).getFoodItem(fid4);
							
							if(f4 != null)
							{
								f4.showInfo();
							}
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					
					System.out.println("--------------------------------");
					break;
					
					
				case 4:
				    System.out.println("--------------------------------");
					System.out.println("You have choosen FoodItem Quantity Add-Sell");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Add FoodItem");
					System.out.println("	2. Sell FoodItem");
					System.out.println("	3. Show Add Sell History");
					System.out.println("	4. Go Back\n");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							System.out.println("#########################");
							System.out.println("Add FoodItem:");
							System.out.print("Enter Restaurant NID: ");
							String rid1 = sc.next();
							System.out.print("Enter FoodItem: ");
							String f1 = sc.next();
							System.out.print("Enter New FoodItem: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								fc.getRestaurant(rid1).getFoodItem(f1).addQuantity(amount1);
								frwd.writeInFile("$"+amount1+" has been Added in FoodItem "+ f1);
								//frwd.writeInFile("Deposit: $"+amount1+" in "+an1);
							}
							System.out.println("#########################");
							break;
							
						case 2:
						
							System.out.println("#########################");
							System.out.println("Sell FoodItem:");
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter Account Number: ");
							String f2 = sc.next();
							System.out.print("Enter Sell FoodItem: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2<=fc.getRestaurant(rid2).getFoodItem(f2).getPrice())
							{
								fc.getRestaurant(rid2).getFoodItem(f2).sellQuantity(amount2);
								frwd.writeInFile("$"+amount2+" has been Sold from FoodItem "+ f2);
							}
							System.out.println("#########################");
							break;
							/*
						
						case 3:
						
							System.out.println("#########################");
							System.out.println("Transfer Money");
							System.out.print("Enter From Customer NID: ");
							int fromNid = sc.nextInt();
							System.out.print("Enter From Account Number: ");
							int fromAN = sc.nextInt();
							System.out.print("Enter Transfer Amount: ");
							double amount3 = sc.nextDouble();
							
							System.out.print("Enter To Customer NID: ");
							int toNid = sc.nextInt();
							System.out.print("Enter To Account Number: ");
							int toAN = sc.nextInt();
							
							if(amount3>0 && amount3<=b.getCustomer(fromNid).getAccount(fromAN).getBalance())
							{
								b.getCustomer(fromNid).getAccount(fromAN).transfer(b.getCustomer(toNid).getAccount(toAN),amount3);
								frwd.writeInFile("$"+amount3+" has been Tranferred from Account Number "+ fromAN +" to Account Number "+toAN);
							}
							System.out.println("#########################");
							break;
							*/
						
						case 3:
						
							System.out.println("#########################");
							System.out.println("Show Add Sell History\n");
							frwd.readFromFile();
							System.out.println("\n#########################");
							break;
							
						case 4:
						
							System.out.println("#########################");
							System.out.println("Going Back");
							System.out.println("#########################");
							break;
							
						default:
						
							System.out.println("#########################");
							System.out.println("Invalid Option");
							System.out.println("#########################");
							break;
						
					}
					
					System.out.println("--------------------------------");
					break;
					
					
					
					
			    case 5:
				System.out.println("--------------------------------");
					System.out.println("You have choosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
			}
		}
	}
}