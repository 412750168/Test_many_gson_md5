import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestCollection {

	
	public void test(){
		
		Set<Integer> coll = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		Iterator<Integer> iterator2 = list.iterator();
		while(iterator2.hasNext()){
			int i = iterator2.next();
			System.out.println(i);
		}
		coll = new HashSet<Integer>(list);
	/*	coll.add(44);
		coll.add(45);
		coll.add(89);
		coll.add(44);
		*/
		Iterator<Integer> iterator = coll.iterator();
		while(iterator.hasNext()){
			int i = iterator.next();
			System.out.println(i+"@");
		}
		
	}
}
