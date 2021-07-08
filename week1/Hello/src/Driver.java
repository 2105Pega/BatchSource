import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args)  throws ClassNotFoundException, IOException{
		// TODO Auto-generated method stub
		
	 // createFiles();
	  readIn();

	}//end main
	
	
   public static void createFiles() throws IOException, ClassNotFoundException {
		File file = new File("employeeData.txt");
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("Tom", 35));
		employee.add(new Employee("Tom2", 35));
		employee.add(new Employee("Tom3", 35));
		
		//serialize the collection of students
//		FileOutputStream fo = new FileOutputStream(file);
//		ObjectOutputStream output = new ObjectOutputStream(fo);
//		output.writeObject(employee);
//		
//		output.close();
//		fo.close();
		
		
		//deseralize the file back into the collection
//		FileInputStream fi = new FileInputStream(file);
//		ObjectInputStream input = new ObjectInputStream(fi);
//		ArrayList<Employee> employee2 = new ArrayList<Employee>();
		
		 try
	        {
	            FileOutputStream fos = new FileOutputStream(file);
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(employee);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
		
//       try {
//   		while (true) {
//			Employee e = (Employee)input.readObject();
//			employee2.add(e);
//		}
//		
//	} catch (EOFException e2) {
//		// TODO: handle exception
//	}
//       
//       for(Employee e: employee2) {
//    	   System.out.println(e);
//       }
//		


   }//end class
   
   
   public static void readIn() {
	   ArrayList<Employee> employees = new ArrayList<>();
       
       try
       {
           FileInputStream fis = new FileInputStream("employees.txt");
           ObjectInputStream ois = new ObjectInputStream(fis);

           employees = (ArrayList) ois.readObject();

           ois.close();
           fis.close();
       } 
       catch (IOException ioe) 
       {
           ioe.printStackTrace();
           return;
       } 
       catch (ClassNotFoundException c) 
       {
           System.out.println("Class not found");
           c.printStackTrace();
           return;
       }
        
       //Verify list data
       for (Employee employee : employees) {
           System.out.println(employee);
       }
   }
   
   
}
