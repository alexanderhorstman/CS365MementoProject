	 public class Memento {
		 
		 private static long seed;
	 
	        public Memento(long seed) {
	        	Memento.seed = seed;
	        }
	 
	        public long getSavedSeed() {
	            return seed;
	        }
	        
	        public void setState ( long seed){
	        	this.seed = seed;
	        }
	    }