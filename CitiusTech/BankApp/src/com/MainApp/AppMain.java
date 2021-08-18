package com.MainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.AppAbstract.BankInterface;
import com.AppAbstract.AbstractUser;
import com.BankAccountDetails.HdfcBank;
import com.BankAccountDetails.IciciBank;
import com.UserDetails.Users;

public class AppMain {
	
		private static Integer accNoHdfc=1000001;
		private static Integer accNoIcici=2000001;
		private static Integer userId ;
		private static String password ;
		private static BankInterface bank;
		private static Integer depositValue;
		private static Integer withdrawValue;

	    public static void main(String[] args) {
	    	
		List<BankInterface> bankList=new ArrayList<BankInterface>();
		List<AbstractUser> userList=new ArrayList<AbstractUser>();
		
		AbstractUser userInterface=new Users("emmanuel","Hdfc", "pass", "9876543210", "emmu@gmail.com");
		
		userList.add(userInterface);		
		System.out.println(userInterface);
		
		userInterface=new Users("george","Hdfc", "pass", "9876543211", "geor@gmail.com");
		
		userList.add(userInterface);
		System.out.println(userInterface);
		
		userInterface=new Users("stefan","Icici", "pass", "9876543212", "stef@gmail.com");
		
		userList.add(userInterface);
		System.out.println(userInterface);
		
		userInterface=new Users("amritha","Icici", "pass", "9876543213", "amri@gmail.com");
		
		userList.add(userInterface);
		System.out.println(userInterface);
		
		userInterface=new Users("john","Icici", "pass", "9876543214", "john@gmail.com");
		
		userList.add(userInterface);
		System.out.println(userInterface);
		
		userList.forEach(user->{	
			Integer userId=user.getUserId();
			String choice=user.getBankName();
			BankInterface bankInterface;
			switch(choice){
			
			case "Hdfc":
				bankInterface=new HdfcBank(accNoHdfc,userId,"Saving",0);
      			bankList.add(bankInterface);
      			System.out.println(bankInterface);
      			accNoHdfc++;
			    break;
			
			case "Icici":
				bankInterface=new IciciBank(accNoIcici,userId,"Saving",0);
      			bankList.add(bankInterface);
      			System.out.println(bankInterface);	
      			accNoIcici++;
      			break;
			}
		
			
		});
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your user id");
		userId= Integer.parseInt(sc.next());
		
		System.out.println("Enter your password");
		password = sc.next();
		
		System.out.println("Enter your deposit amount");
		depositValue= Integer.parseInt(sc.next());
		
		System.out.println("Enter your withdraw amount");
		withdrawValue= Integer.parseInt(sc.next());
		
		userList.forEach(user->{
			
			    if(user.login(userId, password)) {
			    	
			    System.out.println(user);
			    
				bank=getBank(bankList,userId);
				if(user.getBankName().equals("Hdfc"))
					bank.welcomeUser(user.getBankName());
				else
					bank.welcomeUser(user.getBankName(),user.getName());
				
				bank.deposit(depositValue);
				bank.withdraw(withdrawValue);
			}
		});
		
		}
	
	    private static BankInterface getBank(List<BankInterface>  bankLst,Integer userId) {
	    	bankLst.forEach(bankVal->{
				if(bankVal.getUserId().equals(userId)) {
					bank=bankVal;
				}
			});
	    	return bank;
	    }

}
