import java.util.Random;


public class MementoDriver {

	public static void main(String[] args) {		

		Originator rng = new RNGSeed();
		CareTaker careTaker = new CareTaker();
		
		rng.setSeed(12345);
		System.out.println( "Originator state :"+ rng.getSeed());
		printNumberList(rng.getSeed());
		careTaker.addMemento(rng.saveMemento());
		
		rng.setSeed(67890);
		System.out.println( "Originator state :"+ rng.getSeed());
		printNumberList(rng.getSeed());
		careTaker.addMemento(rng.saveMemento());
		
		rng.setSeed(13579);
		System.out.println( "Originator state :"+ rng.getSeed());
		printNumberList(rng.getSeed());
		careTaker.addMemento(rng.saveMemento());
		
		careTaker.printList();
		
		rng.restoreFromMemento(careTaker.getMemento(0));
		System.out.println( "Restored state :"+ rng.getSeed());
		printNumberList(rng.getSeed());
		
		rng.restoreFromMemento(careTaker.getMemento(1));
		System.out.println( "Restored state :"+ rng.getSeed());
		printNumberList(rng.getSeed());
		
		rng.restoreFromMemento(careTaker.getMemento(2));
		System.out.println( "Restored state :"+ rng.getSeed());
		printNumberList(rng.getSeed());
		
	}
	
	 public static void printNumberList(long seed) {
		Random random = new Random(seed);
    	System.out.print("Seed: " + seed + "\t{   ");
    	for(int i = 0; i < 10; i++) {
    		System.out.print(random.nextInt(50) + "   ");
    	}
    	System.out.println("}\n");
	 }

}
