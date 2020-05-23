package reantrentlock;

public class Consumer implements Runnable{

	@Override
	public void run() {
		Box box=Box.getInstance();
		for(int i=0;i<=2;i++)
		{
			box.remove("television", 2);
		}
		System.out.println("consumer:"+box);
		
	}

}