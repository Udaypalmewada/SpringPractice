package reantrentlock;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box {
	ReentrantLock l=null;
	
	private List<String> goods;
	private static Box instance;
	private Box()
	{
		goods=new ArrayList<String>();
		l=new ReentrantLock();
	}
	public static Box getInstance()
	{
		if(instance==null)
		{
			instance=new Box();
		}
		return instance;
	}
	
	public void add(String productname)
	{
		
		String inProduct;
		String inproductName;
		int inproductQuality=0;
		int pos=0;
		boolean alreadyExists=false;
		l.lock();
		for(int i=0;i<goods.size();i++)
		{
			inProduct=goods.get(i);
			inproductName=inProduct.split(":")[0];
			if(productname.equals(inproductName))
			{
	inproductQuality=Integer.parseInt(inProduct.split(":")[1]);
	alreadyExists=true;
	pos=i;
			}
			
		}
		if(!alreadyExists) {
			goods.add(productname+":"+"1");
		}
		else {
			goods.remove(pos);
			goods.add(productname+":"+(inproductQuality+1));
		}
		l.unlock();
	}
	public void remove(String prodctName,int requestedQuantity) {
		String inProduct;
		String inproductName;
		int inProductQuantity=0;
		int pos=0;
		boolean alreadyExists=false;
		l.lock();
		for(int i=0;i<goods.size();i++)
		{
			inProduct=goods.get(i);
			inproductName=inProduct.split(":")[0];
			if(prodctName.equals(inproductName))
			{
				inProductQuantity=Integer.parseInt(inProduct.split(":")[1]);
			
				alreadyExists=true;
				pos=i;
			}
			
		}
		if(!alreadyExists) {
			System.out.println("requested product not available");
			
		}
		else if(requestedQuantity==inProductQuantity) {
			goods.remove(pos);
		}
		else if(requestedQuantity>inProductQuantity) {
			System.out.println("requested quantity is not available");
}
		
		else
		{
			goods.remove(pos);
			goods.add(prodctName+":"+(inProductQuantity-requestedQuantity));
			}
		l.unlock();
		
		
	}
	@Override
	public String toString() {
		return "Box [goods=" + goods + "]";
	}

}