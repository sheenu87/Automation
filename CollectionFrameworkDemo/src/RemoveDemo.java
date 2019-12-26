import java.util.ArrayList;

//Remove a specified element from collection
public class RemoveDemo {

	String name;
	double price;
	String brand;
	
	public static void main(String[] args) {
		RemoveDemo ele=new RemoveDemo("Pen",10,"Reynolds");
		RemoveDemo ele1=new RemoveDemo("Pencil",10,"Disney");
		RemoveDemo ele2=new RemoveDemo("Notebook",90,"Classmate");
		RemoveDemo ele3=new RemoveDemo("Sketchpen",120.99,"Calomin");
		RemoveDemo ele4=new RemoveDemo("Pen",80,"Parker");
		RemoveDemo ele5=new RemoveDemo("Gel Pen",10,"Max Writer");

		ArrayList<RemoveDemo> al=new ArrayList<RemoveDemo>();
		al.add(ele);
		al.add(ele1);
		al.add(ele2);
		al.add(ele5);
		al.add(ele3);
		al.add(ele4);
		System.out.println("List size(initial): "+al.size());
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");
		for(int i=0;i<al.size();i++)
		{
			RemoveDemo rd=al.get(i);
			System.out.println("Item"+i+": "+rd.name+ " Brand: "+rd.brand+" Price: "+rd.price);
		}	
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");
		
		System.out.println("After removing Pencil, the collection contains following items");
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");
		al.remove(ele1);
		for(int i=0;i<al.size();i++)
	{
		RemoveDemo rd=al.get(i);
		System.out.println("Item"+i+": "+rd.name+ " Brand: "+rd.brand+" Price: "+rd.price);
	}	
		System.out.println("List size(after deletion): "+al.size());
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");
	}
	RemoveDemo(String name,double price,String brand)
	{
		this.name=name;
		this.price=price;
		this.brand=brand;
	}
	
}
