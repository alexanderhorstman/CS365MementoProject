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
	    
	    public void printList(){
	    	System.out.print("[");
	    	for(Memento x :seed){
	    		System.out.print(" " + x.getSeed() + " ");
	    	}
	    	System.out.println("]");
	    }
	    
}
