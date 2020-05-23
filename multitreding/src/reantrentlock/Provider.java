package reantrentlock;
public class Provider implements Runnable{

	@Override
	public void run() {
		Box box=Box.getInstance();
		for(int i=1;i<=5;i++)
		{
			box.add("television");
		}
		System.out.println("producer products"+box);
		
	}

}