package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BiConsumerRealTimeExample {
	
	public static List<Patient> getpatientdata(){
		
		List<Patient> list= new ArrayList<>();
		list.add(new Patient ("Hitesh",24,100,102));
		list.add(new Patient ("Ishan",24,105,106));
		list.add(new Patient ("Sky",29,108,107));
		list.add(new Patient ("Rohit",25,122,189));
		
		return list;
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		
	Consumer<List<Patient>>	consumer= (list)-> {list.forEach(patient->
	//write logic data in the db
	{System.out.println("The data is entered in db");
	});
		
	};
		
		
		consumer.accept(getpatientdata());
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
 class Patient{
	 
	 public Patient(String string, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	String name;
	 int age;
	 int bp;
	 int sugar;
	 
 }