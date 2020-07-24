package collectionlist;
import java.util.*;
public class CollectionListAccessing {
		public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		CollectionList<Object> a=new CollectionList<Object>();
		System.out.println("Intial Array is : ");
		a.print();
		while(true)
		{
			System.out.println("Select the options");
			System.out.println("1. add Element");
			System.out.println("2.Delete particular position");
			System.out.println("3.fetch data at position");
			System.out.println("4.print the whole list");
			System.out.println("5.break");
			
			int s=sc.nextInt();
			if(s==1)
			{
				int n=sc.nextInt();
					a.add(n);
				
			}
			else if(s==2)
			{
				System.out.println("Enter the position to delete at particualar index");
				int g=sc.nextInt();
				
				try {
				a.remove(g);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
			}
			else if (s==3)
			{
				System.out.println("Enter the position to fetch the data or acess it");
				int g1=sc.nextInt();
				Object y1=a.get(g1);
				System.out.println(y1);
				
				
			}
			else if(s==4)
			{
				a.print();
			}
			else
			{
				break;
			}
			
			
		}
	}
}
