package reantrentlock;


public class Test {

	public static void main(String[] args) {
		Provider producer=new Provider();
		Consumer consumer=new Consumer();
		Thread t1=new Thread(consumer);
		Thread t2=new Thread(producer);
		//System.out.println(box);
		t1.start();
		t2.start();
	}

}