
public class MementoDriver {

	public static void main(String[] args) {
		
		

		Originator rng = new RNGSeed();
		CareTaker careTaker = new CareTaker();
		
		rng.setSeed(12345);
		System.out.println( "Originator state :"+ rng.getSeed());
		careTaker.addMemento(rng.saveMemento());
		
		rng.setSeed(67890);
		System.out.println( "Originator state :"+ rng.getSeed());
		careTaker.addMemento(rng.saveMemento());
		
		rng.setSeed(13579);
		System.out.println( "Originator state :"+ rng.getSeed());
		careTaker.addMemento(rng.saveMemento());
		
		careTaker.printList();
		
		rng.restoreFromMemento(careTaker.getMemento(0));
		System.out.println( "Originator state :"+ rng.getSeed());
		
		rng.restoreFromMemento(careTaker.getMemento(1));
		System.out.println( "Originator state :"+ rng.getSeed());
		

	}

}
