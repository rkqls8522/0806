package basic0806_1;

public class Player implements Comparable<Player> {

	public Player(){}
	public Player(String name, int score){
		this.name = name;
		this.score = score;
	};
	
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Player o) {
		return this.name.compareTo(o.getName());
	}
	
	
}
