package interfaceLab;

public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		
		System.out.println();
		
		Flyable[] flyingThings = new Flyable[] {myPlane, myHangglider, myBird};
		
		for (Flyable el : flyingThings)
		{
			System.out.println(el);
			el.launch();
			el.land();
			System.out.println();
		}
	}

}
