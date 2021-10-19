package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

	public static void main(String[] args) {
             UserImpl us=new UserImpl();
             Scanner sc=new Scanner(System.in);
             int ch,id;
             String name,email;
            
             do {
            	 System.out.println("1.Add User\n2.Delete User\n3.Modify User email\n4.Display Users\n5.Search user\n6.Display All Users\n0.Exit");
            	 System.out.println("Enter your choice:");
                 ch=sc.nextInt();
                 switch(ch){
                 case 1:us.adduser();
                        break;
                 case 2:System.out.println("Enter id:");
                        id=sc.nextInt();
                        us.deleteuser(id);
                        break;
                 case 3:System.out.println("Enter id:");
                        id=sc.nextInt();
                        System.out.println("Enter user email:");
                	    email=sc.next();
                	    us.updateuseremail(id, email);
                	    break;
                 case 4:System.out.println("Enter id:");
                        id=sc.nextInt();
                        us.displayuser(id);
                        break;
                 case 5:System.out.println("Enter id:");
                        id=sc.nextInt();
                        int res=us.searchuser(id);
                        if(res>-1){
                	    	  System.out.println("User is found");
                	      }
                        else {
                        	System.out.println("user is not found");
                        }
                        break;
                 case 6:us.displayalluser();
                        break;
                 case 0:System.exit(0);
                 }
             }while(ch!=0);
	}

}
