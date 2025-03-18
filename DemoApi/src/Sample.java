import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sample  {
	public static void main(String [] args)
	{
		HashMap <Integer, String> h1= new HashMap<>();
		h1.put(1,"harsha");
		h1.put(2,"vaishali");
		h1.put(3,"guru");
		h1.put(4,"anand");
		h1.put(5,"mangla");
		h1.put(6,"tarun");
		h1.put(7,"gunjan");
		h1.put(8,"vaishnavi");
		h1.put(9,"amol");
		h1.put(10,"aira");
		System.out.println(h1);
		Iterator<Map.Entry<Integer, String>> i1=h1.entrySet().iterator();
		while(i1.hasNext())
		{
			Map.Entry<Integer, String> e1=i1.next();
			if(e1.getValue().startsWith("v"))
			{
				i1.remove();
				
			}
			
		}
		System.out.println("updated list "+h1);
		System.out.println(h1.get(7));
	}
	
	
	
	
}
