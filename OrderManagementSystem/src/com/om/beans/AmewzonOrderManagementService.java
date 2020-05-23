package com.om.beans;

public class AmewzonOrderManagementService {
	private ItranceportManager bluedaart;
	private ItranceportManager dtdc;
	

		public ItranceportManager getBluedaart() {
		return bluedaart;
	}


	public void setBluedaart(ItranceportManager bluedaart) {
		this.bluedaart = bluedaart;
	}


	public ItranceportManager getDtdc() {
		return dtdc;
	}


	public void setDtdc(ItranceportManager dtdc) {
		this.dtdc = dtdc;
	}
	
		@Override
	public String toString() {
		return "AmewzonOrderManagementService [bluedaart=" + bluedaart + ", dtdc=" + dtdc + "]";
	}


		public void plaseOrder(Address address)
	{
		
		if(address.getCity().equals("hyd")||address.getCity().equals("bangalore"))
		{
			String some=bluedaart.transeport("121", address);
			System.out.println(some);
			System.out.println("primany cities bluedart is availabe");
		}
		else if(address.getCity().equals("karnool")||address.getCity().equals("vijayawada")
				)
		{
			String some1=dtdc.transeport("123", address);
			System.out.println(some1);
			System.out.println("secondary cities DTDC is availabe");
		}
		else 
		{
			System.out.println(" courier point is not availabe");
		}
		
		
		 
	}

}
