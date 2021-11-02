package deliver;

public class ReadyOrder {
	 private String orderno;
	 private String des;
	 private String tp;
	 private String address;
	 private String receiptno;
	 private String status;

	public ReadyOrder(String orderno, String des, String tp, String address, String receiptno, String status) {
		super();
		this.orderno = orderno;
		this.des = des;
		this.tp = tp;
		this.address = address;
		this.receiptno = receiptno;
		this.status=status;
	}


	public String getOrderno() {
		return orderno;
	}

	public String getDes() {
		return des;
	}


	public String getTp() {
		return tp;
	}


	public String getAddress() {
		return address;
	}


	public String getReceiptno() {
		return receiptno;
	}

	
	public String getstatus() {
		return status;
	}

}
