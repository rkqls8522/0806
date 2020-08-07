

//�빮�� �ڿ� �ٷ� .(method)�� ���ٴ� ���� �� �޼ҵ尡 staticŸ���̶�� ��. Ŭ����(�빮�ڴϱ�)�� �޼ҵ带 �ٷ� �� �� �ִ°��� static��츸.


package basic0806_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

//interface List<E> extends Collection<E>{
//	
//}






public class ArrayListTest {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		
		Integer a = new Integer(5);
		Integer b = new Integer(7);
		Integer c = new Integer(11);
		
		list1.add(new Integer(5));
		list1.add(new Integer(7));
		list1.add(new Integer(7));
		list1.add(new Integer(8));
		list1.add(new Integer(9));
		list1.add(new Integer(51));
		list1.add(new Integer(45));
		
		list1.add(a);
		list1.add(b);
		list1.add(c);
		
		list1.add(7);
		
		for(Integer i: list1) System.out.print(i + "  ");
		System.out.println();
		
		//list2�� ����� list1�� �� �� 1��° �ε������� 4��° �ε����� ������ ������. -> .subList(,)
		// + subList���� asList�� �ִµ�, ���� �ִ� ��.
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1,4));
		for(Integer i: list1) System.out.print(i + "  ");
		System.out.println();
		for(Integer i: list2) System.out.print(i + "  ");
		System.out.println();
		
		//list1�� list2�� ������������ ������. -> .sort()
		Collections.sort(list1);
		Collections.sort(list2);
		
		for(Integer i: list1) System.out.print(i + "  ");
		System.out.println();
		for(Integer i: list2) System.out.print(i + "  ");
		System.out.println();
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		System.out.println("list2.containsAll(list1) : " + list2.containsAll(list1));
		list1.add(1,999);
		for(Integer i: list1) System.out.print(i + "  ");
		System.out.println();
		for(Integer i: list2) System.out.print(i + "  ");
		System.out.println();
		
		//list1�ȿ� list2�� ���� �� �ֳ�?�ϴ� Ȯ���ϴ� �� -> .containsAll()
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		System.out.println("list2.containsAll(list1) : " + list2.containsAll(list1));
		
		//list1���� list2���� ��ġ�� �� ���� �� ������. -> .retainAll()
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		for(Integer i: list1) System.out.print(i + "  ");
		System.out.println();
		for(Integer i: list2) System.out.print(i + "  ");
		System.out.println();
		
		
		
		
	}

}
