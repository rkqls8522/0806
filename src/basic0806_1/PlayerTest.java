package basic0806_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerTest {

	public static void main(String[] args) {
		
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("ȫ�浿",223));
		players.add(new Player("��", 356));
		players.add(new Player("����", 4123));
		players.add(new Player("�谳��", 156));
		
		Collections.sort(players);
		for(Player i : players) {
			System.out.println("�̸��� : " + i.getName());
			System.out.println("������ : " + i.getScore());
			System.out.println();
			
		}
		
	}
	
	
	
	
}
