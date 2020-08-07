package basic0806_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerTest {

	public static void main(String[] args) {
		
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("È«±æµ¿",223));
		players.add(new Player("¹ä", 356));
		players.add(new Player("¹æÀå", 4123));
		players.add(new Player("±è°³¶Ë", 156));
		
		Collections.sort(players);
		for(Player i : players) {
			System.out.println("ÀÌ¸§Àº : " + i.getName());
			System.out.println("Á¡¼ö´Â : " + i.getScore());
			System.out.println();
			
		}
		
	}
	
	
	
	
}
