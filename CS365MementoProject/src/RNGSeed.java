
public class RNGSeed implements Originator {
	private long seed;
	
	public void setSeed(long seed) {
		this.seed = seed;
	}
	
	public long getSeed() {
		return seed;
	}
	
	public Memento saveMemento() {
		return new Memento(seed);
	}
	
	public void restoreFromMemento(Memento memento) {
		seed = memento.getSavedState();
	}

	 public static class Memento {
		 
		 private static long seed;
	 
	        public Memento(long seed) {
	        	Memento.seed = seed;
	        }
	 
	        public long getSavedState() {
	            return seed;
	        }
	    }
}
