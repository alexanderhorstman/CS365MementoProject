
public interface Originator {
	
	public void setSeed(long seed);
	
	public long getSeed();
	
	public Memento saveMemento();
	
	public void restoreFromMemento(Memento memento);
}
