package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class UserImpl {
      int id;
      String name,email;
	  List userlist=new ArrayList();
	  Scanner sc=new Scanner(System.in);
	  
      int searchuser(int id) {
    	  ListIterator itr=userlist.listIterator();
    	  int count=0;
    	  while(itr.hasNext()) {
    		  if(((User)itr.next()).getId()==id) {
    			  return count;
    		  }
    		  count++;
    	  }
		  return -1;
	  }
	  void adduser() {
		  System.out.println("Enter user id:");
          id=sc.nextInt();
          System.out.println("Enter user name:");
          name=sc.next();
  	      System.out.println("Enter user email:");
  	      email=sc.next();
  	      if(searchuser(id)>-1) {
  	    	  System.out.println("User id  is already exists");
  	      }
  	      else {
  	    	  User user=new User(id,name,email);
  	    	  userlist.add(user);
  	    	  System.out.println("User added..");
  	      }
	  }
	  
	  
	  void deleteuser(int id) {
		  int index=searchuser(id);
		  if(index==-1) {
			  System.out.println("User does not exist..");
		  }
		  else {
			  userlist.remove(index);
			  System.out.println("User deleted..");
		  }
	  }
	  
	  void  updateuseremail(int id,String email) {
		  int index=searchuser(id);
		  if(index==-1) {
			  System.out.println("User does not exist");
		  }
		  else {
			  ((User)userlist.get(index)).setEmail(email);
			  System.out.println("User email upadted");
			  System.out.println((User)userlist.get(index));
		  }
	  }
	  
	  void displayalluser() {
		  if(userlist.isEmpty()) {
			  System.out.println("No Users in List");
		  }
		  else {
			  ListIterator itr=userlist.listIterator();
			  while(itr.hasNext()) {
				  System.out.println((User)itr.next());
			  }
		  }
	  }
	  
	  void displayuser(int id) {
		  int index=searchuser(id);
		  if(index==-1) {
			  System.out.println("User does not exist");
		  }
		  else {
			  System.out.println((User)userlist.get(index));
		  }
	  }
}
