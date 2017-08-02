package sailorboatClient.client;  
import sailorboatserver.HelloWorld;
import sailorboatserver.HelloWorldImplService; 
import java.io.InputStream;
import java.util.Scanner;
  
public class JAXWSClient {  
  
	private static Scanner scanner = new Scanner( System.in );    
    public static void main(String[] args) {  
          
    	HelloWorldImplService helloWorldService = new HelloWorldImplService();  
    	HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
        //Scanner scanner = new Scanner( System.in );
        String result = "";
        System.out.println("Please enter the first name of the sailor\n");
        String fname = scanner.nextLine();
        if (fname.equals(""))
        	fname = "empty";
        System.out.println("Please enter the last name of the sailor\n");
        String lname = scanner.nextLine();
        if (lname.equals(""))
        	lname = "empty";
        System.out.println("Please enter the boat type\n");
        String btype = scanner.nextLine();
        if (btype.equals(""))
        	btype = "empty";
        System.out.println("Please enter the length\n");
        String length = scanner.nextLine();        
        if (length.equals(""))
        	length = "empty";
        System.out.println("Please enter year built\n");
        String year = scanner.nextLine();        
        if (year.equals(""))
        	year = "empty";
        System.out.println("Please enter motor type\n");
        String motor = scanner.nextLine();        
        if (motor.equals(""))
        	motor = "empty";
        System.out.println("Slip paid? Yes/No\n");
        String paid = scanner.nextLine();        
        if (paid.equals(""))
        	paid = "empty";
        System.out.println("Please enter dock\n");
        String dock = scanner.nextLine();        
        if (dock.equals(""))
        	dock = "empty";
        String input="";
        input = input.concat(fname);
        input = input.concat("!");
        input = input.concat(lname);
        input = input.concat("!");
        input = input.concat(btype);
        input = input.concat("!");
        input = input.concat(length);
        input = input.concat("!");
        input = input.concat(year);
        input = input.concat("!");
        input = input.concat(motor);
        input = input.concat("!");
        input = input.concat(paid);
        input = input.concat("!");
        input = input.concat(dock);
        System.out.println("Operation? Insert/Query/Update\n");
        String op = scanner.nextLine();
        if (op.equalsIgnoreCase("Insert"))
        	result= helloWorld.insert(input);
        else if (op.equalsIgnoreCase("Update"))
        {
        	System.out.println("Please enter the boat id to be updated\n");
            String boatid = scanner.nextLine();
            input = input.concat("!");
            input = input.concat(boatid);
        	result= helloWorld.update(input);
        }
        else
        	result= helloWorld.fetchfromDatabase(input);
        String a[]=result.split("!");
        System.out.println("FName LName Type Length Year Motor Paid Dock");
        System.out.println("--------------------------------------------");
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
    }  
} 