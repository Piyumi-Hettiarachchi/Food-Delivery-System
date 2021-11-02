package deliver;

public class DeliveryBoy {
	
	private String empid;
	private String name;
	private String tele;
	private String status;
	
	public DeliveryBoy(String empid, String name, String tele, String status) {
		super();
		this.empid = empid;
		this.name = name;
		this.tele = tele;
		this.status = status;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public String getstatus() {
		return status;
	}

	public void setstatus(String status) {
		this.status = status;
	}
	
	

}
