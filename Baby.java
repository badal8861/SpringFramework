package org.jsp.springboot.autowired;

public class Baby {

	private IceCream icecream;
	
	public void setIceCream(IceCream icecream) {
		this.icecream=icecream;
	}
	
	public IceCream getIceCream() {
		return icecream;
	}
}