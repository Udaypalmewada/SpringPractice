package singletone_witn_multithreding;

public class student extends Thread {
	
	public void run() {
		
		     A s = A.getInstance();
		System.out.println("Hashcode object>>::"+s.hashCode());

	}
	
}
