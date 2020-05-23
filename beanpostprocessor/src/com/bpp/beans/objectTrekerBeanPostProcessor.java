package com.bpp.beans;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class objectTrekerBeanPostProcessor implements BeanPostProcessor,InitializingBean{
	protected   AtomicInteger instance;

	@Override
	public void afterPropertiesSet() throws Exception {
      		instance=new AtomicInteger();
	}
	@Override
	public Object postProcessAfterInitialization(Object object, String bean) throws BeansException {
         
		//instance.incrementAndGet();
		   return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String bean) throws BeansException {
		 
		return object;
	}
	/*public AtomicInteger getInstance() {
	
		instance.incrementAndGet();
		instance.get();
		
		return instance;
	}
*/
 
	public int getInstaces()
	{
		instance.incrementAndGet();
		
		return instance.get();
	}
}
