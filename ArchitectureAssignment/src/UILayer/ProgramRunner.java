package UILayer;
import ManagementLayer.*;
import java.util.Scanner;
public class ProgramRunner {
public static void main(String args[]){
    DataManage M = new DataManage();
    boolean Run = true;
    Scanner input = new Scanner(System.in);
    M.AddStudent("Majid","SOEN", 2021);
    M.AddStudent("Khalid", "SOEN", 2022);
    M.AddStudent("Ahmed", "IT", 2023);
    while (Run){
    System.out.println("hello, what would you like to do today?\n1-Add a new student \n2-View a student \n3-View All students\n4-Exit Application");
    String choice = input.nextLine();
    if (choice.charAt(0) == '1'){
        System.out.println("ID> ");
        String idString = input.nextLine();
        int id = Integer.parseInt(idString);
        System.out.println("Name> ");
        String name = input.nextLine();
        System.out.println("Major> ");
        String major = input.nextLine();
        M.AddStudent(name, major, id);

    }
    else if (choice.charAt(0) == '2'){
        System.out.println("ID> ");
        String idString = input.nextLine();
        int id = Integer.parseInt(idString);
        System.out.println(M.ViewStudent(id));
    }
    else if (choice.charAt(0) == '3'){
        System.out.println(M.ViewAllStudents());
    }
    else if (choice.charAt(0) == '4'){
        System.out.println("Thank you for using our application!");
        Run = false;
        break;
    }
    else{
        System.out.println("\ninvalid choice, pick again>");
        continue;
    }
    System.out.println("would you like to perform another action?\n1-Yes\n2-No");
    String again = input.nextLine();
    if (again.charAt(0) == '1') {
        Run = true;
        continue;
    }
    else if (again.charAt(0) == '2'){
        System.out.println("Thank you for using our application!");
        Run = false;
        break;
    }
    else{
    	System.out.println("\ninvalid choice, reprinting menu...");
    	Run = true;
        //this is a git test
        
    }
    
    }

    input.close();
}
}
