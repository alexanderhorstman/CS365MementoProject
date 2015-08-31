import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	  private List<Memento> seed = new ArrayList<Memento>();

	    public void addMemento( Memento memento ) {
	        seed.add( memento );
	    }

	    public Memento getMemento( int index ) {
	        return seed.get( index );
	    }
	    
}
