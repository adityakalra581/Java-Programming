package iterate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		
		Iterator it = values.iterator();
		
		while (it.hasNext()()) {
			System.out.println(it.next());
		}

	}

}
