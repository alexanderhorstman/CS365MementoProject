
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
		this.seed = memento.getSeed();
	}
}


