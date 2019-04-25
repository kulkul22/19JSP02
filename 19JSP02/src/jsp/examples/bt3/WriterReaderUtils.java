/**
 * 
 */
package jsp.examples.bt3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author TechCare
 *
 */
public class WriterReaderUtils {
	public static void writeEmployee(Employee[] employees) {
		try {
			FileOutputStream f = new FileOutputStream(new File("Employees.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			//write first line is length of employees
			o.writeInt(employees.length);
			// Write objects to file
			for (int i = 0; i< employees.length; i++) {
				o.writeObject(employees[i]);
			}

			o.close();
			f.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}
	}
	
	public static Employee[] readEmployee() {
		Employee[] employees = null;
		try {

			FileInputStream fi = new FileInputStream(new File("Employees.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			int lenght = oi.readInt();
			employees = new Employee[lenght];
			// Read objects
			for (int i = 0; i< lenght; i++) {
				employees[i] = (Employee) oi.readObject();
			}

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
}
