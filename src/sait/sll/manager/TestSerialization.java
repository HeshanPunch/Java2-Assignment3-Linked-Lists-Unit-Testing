package sait.sll.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import sait.sll.problemdomain.User;
import sait.sll.utility.SLL;

public class TestSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		User u1 = new User(1, "John Smith", "john@email.com", "123456");
		User u2 = new User(1, "Mike Ross", "mike@email.com", "654321");
		SLL list = new SLL();
		list.append(u1);
		list.append(u2);

		//serialize(list);
		deserialize(list);

	}

	private static void deserialize(SLL list) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/test.bin"));
		SLL list1 = (SLL) ois.readObject();
		System.out.println(list1);
		ois.close();

	}

	private static void serialize(SLL list) throws IOException, ClassNotFoundException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/test.bin"));
		oos.writeObject(list);
		oos.close();

	}

}
