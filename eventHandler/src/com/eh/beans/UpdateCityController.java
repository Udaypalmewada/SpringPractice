package com.eh.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class UpdateCityController implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	private ReloadEvent rev;

	public void updatecity(int cityno, String tableName) {

		rev = new ReloadEvent(this);

		rev.setTableName("City");
		publisher.publishEvent(rev);
		System.out.println("reloadtable....");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		System.out.println("setApplicationPublisher");
	}

}
