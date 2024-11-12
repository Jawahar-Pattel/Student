package Capgemini.Training;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	String dob;
	int ID;
	Student (String name,String DOB,int ID){
		this.name=name;
		this.dob=DOB;
		this.ID=ID;
	}
}

public class App {
	static ArrayList<Student> list=new ArrayList<Student>();
	Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    	
        list.add(new Student("Jawahar","03/10/2002",11001));
        list.add(new Student("Pradeep","26/12/2002",11002));
        list.add(new Student("Gowtham","20/05/2003",11003));
        list.add(new Student("Sethu","26/08/2002",11004));
        list.add(new Student("Mohan","13/10/2001",11005));
        list.add(new Student("Vicky","13/03/2003",11006));
         
//        print(list);
    }
//    public static void print(ArrayList<Student> list) {
//    	for(Student i:list) {
//    		
//    		System.out.println(i.name);
//    	}
   // }
//    public static void hello(String s){
//    	System.out.println(s);
//    }
//    public void checkme(String nam) {
//    	for(Student i:list) {
//    		System.out.println(nam);
////    		if(i.name==nam) {
////    			System.out.println("Your name is there , Put your DoB ");
////    		}
////    		String s=sc.nextLine();
////    		if(i.dob==s && i.name==nam) {
////    			System.out.println("You,re in");
////    		}
////    		else {
////    			System.out.println("MisMatched");
////    		}
//    	}
//    	//return false;
//    }
}
