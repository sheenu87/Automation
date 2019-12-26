import java.util.ArrayList;
import java.util.Collection;

//Adding multiple elements in a collection
public class ALDemo {

	public static void main(String[] args) {
	Collection<String> cl=new ArrayList<String>();
	cl.add("Sheena");
	cl.add("Daisy");
	cl.add("Jay");
	cl.add("Sheena");
	cl.add("Kiki");
	System.out.println(cl);
	ArrayList<String> al=new ArrayList<String>();
	al.addAll(cl);
	System.out.println(al);
	
	System.out.println("The elements present in collection are: ");
	for(int i=0;i<al.size();i++)
	{
		String ele=al.get(i);
		System.out.println(ele);
	}
	
	}

}
