

//�빮�� �ڿ� �ٷ� .(method)�� ���ٴ� ���� �� �޼ҵ尡 staticŸ���̶�� ��. Ŭ����(�빮�ڴϱ�)�� �޼ҵ带 �ٷ� �� �� �ִ°��� static��츸.


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
