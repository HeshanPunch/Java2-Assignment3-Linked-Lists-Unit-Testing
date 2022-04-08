package sait.sll.manager;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import sait.sll.problemdomain.User;
import sait.sll.utility.Node;
import sait.sll.utility.SLL;

public class TestSerialization {

	public static void main(String[] args) {
		
		try {
					
		User u1 = new User(1, "John Smith", "john@email.com", "123456");
		User u2 = new User(1, "Mike Ross", "mike@email.com", "654321");
		SLL list = new SLL();
		list.append(u1);
		list.append(u2);
				
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/test.bin"));
		oos.writeObject(list);
		oos.close();
		
		
		
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

	}

}
