package ch03;

public class VIPCustomer extends Customer{
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() call");
	}
	
	public String getAgentID() {
		return agentID;
	}
}
