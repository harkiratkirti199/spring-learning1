package io.pragra.learning;

public class OfficeAddress implements IAddress {
	
	private String officeName;
	
	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "OfficeAddress [officeName=" + officeName + "]";
	}
	
	

}
