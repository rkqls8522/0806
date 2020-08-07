

//대문자 뒤에 바로 .(method)를 쓴다는 것은 그 메소드가 static타입이라는 것. 클래스(대문자니까)의 메소드를 바로 쓸 수 있는것은 static경우만.


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
		
		//list2를 만들되 list1의 값 중 1번째 인덱스에서 4번째 인덱스의 값까지 복사해. -> .subList(,)
		// + subList말고 asList도 있는데, 값을 넣는 것.
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1,4));
		for(Integer i: list1) System.out.print(i + "  ");
		System.out.println();
		for(Integer i: list2) System.out.print(i + "  ");
		System.out.println();
		
		//list1과 list2를 오름차순으로 정렬해. -> .sort()
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
		
		//list1안에 list2의 값이 다 있나?하는 확인하는 것 -> .containsAll()
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		System.out.println("list2.containsAll(list1) : " + list2.containsAll(list1));
		
		//list1에서 list2ㅇ와 겹치는 것 빼고 다 삭제해. -> .retainAll()
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		for(Integer i: list1) System.out.print(i + "  ");
		System.out.println();
		for(Integer i: list2) System.out.print(i + "  ");
		System.out.println();
		
		
		
		
	}

}
