package collectionlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class CollectionListTest {
	@Test
	public void IntialList() {
		CollectionList<Integer> myList=new CollectionList<Integer>();
		Assert.assertEquals(10,myList.size()); 
		myList.add(11);
		int t=myList.get(10);
		Assert.assertEquals(11,t); 
		
		myList.add(21);
		myList.add(22);
		myList.add(23);
		Assert.assertEquals(14,myList.size());

		
		myList.add(31);

		int removedVal=myList.remove(3);
		Assert.assertEquals(14,myList.size());
	}

	
}
