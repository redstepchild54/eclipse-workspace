package treasureChest;

public class TreasureApp {
	static TreasureChest pirate = new TreasureChest(100);

	public static void main(String[] args) {
		pirate.removeGold(10);
		System.out.println(pirate);
	}

}
