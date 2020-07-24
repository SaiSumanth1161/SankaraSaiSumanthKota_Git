package collectionlist;
import java.util.Arrays;
 
public class CollectionList<T> 
{
    private int len = 0;
    private int listCapacity = 10;
    private Object customlist[];
 
    public CollectionList() {
        customlist = new Object[listCapacity];
        for(int i=0;i<10;i++) {
        	customlist[len++]=i+1;
        }
    }
 
    private void ensureCapacity() {
        int newSize = customlist.length + customlist.length;
        customlist = Arrays.copyOf(customlist, newSize);
    }
    
    public void add(T element) {
        if (len == customlist.length) {
            ensureCapacity();
        }
        customlist[len++] = element;
    }
    
    public T get(int index) {
        if (index >= len || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) customlist[index];
    }
     
    public T remove(int index) {
        if (index >= len || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object item = customlist[index];
        int numElts = customlist.length - ( index + 1 ) ;
        System.arraycopy( customlist, index + 1, customlist, index, numElts ) ;
        len--;
        return (T) item;
    }
     
    
    public int size() {
        return len;
    }
     
    public void print() {
    	for(int i=0;i<customlist.length;i++)
    		System.out.println(customlist[i]+" ");
    }

}