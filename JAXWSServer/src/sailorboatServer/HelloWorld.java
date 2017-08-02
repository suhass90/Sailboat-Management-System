package sailorboatServer;  
import javax.jws.WebMethod;  
import javax.jws.WebService;  
  
@WebService  
public interface HelloWorld {  
  
 @WebMethod public String helloWorld(String input);
 @WebMethod public String update(String input);
 @WebMethod public String insert(String input);
 @WebMethod public String FetchfromDatabase(String input);
} 

