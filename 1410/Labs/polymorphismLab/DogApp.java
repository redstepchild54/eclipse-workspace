package polymorphismLab;

public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array:\n");
        
        Dog[] dogs = new Dog[] {myDog, mySledDog, myCircusDog};
        
        for (Dog el : dogs)
        {
        	System.out.println(el.toString());
        	if (el instanceof SledDog)
        		((SledDog) el).pullSled();
        	actAsDog(el);
        }
        
    }

    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
