	 public class Memento {
		 
		 private long seed;
	 
	        public Memento(long seed) {
	        	this.seed = seed;
	        }
	 
	        public long getSeed() {
	            return seed;
	        }
	        
	        public void setState (long seed){
	        	this.seed = seed;
	        }
	    }