

//대문자 뒤에 바로 .(method)를 쓴다는 것은 그 메소드가 static타입이라는 것. 클래스(대문자니까)의 메소드를 바로 쓸 수 있는것은 static경우만.


package basic0806_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(new Integer(5));
		list1.add(new Integer(7));
		list1.add(new Integer(7));
		list1.add(new Integer(8));
		list1.add(new Integer(9));
		list1.add(new Integer(51));
		list1.add(new Integer(45));
		
		for(Integer i: list1) System.out.println(i);
		System.out.println();
		
		Iterator<Integer> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(list1.get(itr.next()));
		}
		
		
	}

}
