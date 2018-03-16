package treasureChest;

public class TreasureChest {

	
	private int gold;
	
	public void addGold(int g)
	{
		gold += g;
	}
	
	public void removeGold(int g)
	{
		if (g > gold)
		{
			IllegalArgumentException error = new IllegalArgumentException("Can't remove more gold than in the chest!");
			throw error;
		}
		gold -= g;
	}
	
	public TreasureChest(int g)
	{
		if (g < 0)
			throw new IllegalArgumentException("Can't create a chest with no gold coins");
		gold = g;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	public String toString() {
		return "TreasureChest [gold= " + gold + "]";
	}
	
	
	
}
