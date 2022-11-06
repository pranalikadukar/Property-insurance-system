package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quotation")

public class Quotation {
	@Id  @GeneratedValue
	private int id;
	private String cname;
	private String title;
	private String pamount;
	private String sum;
	private String pinterval;
	private String detail;
	
	public Quotation( String cname, String title, String pamount, String sum, String interval, String detail) {
		super();
		this.cname = cname;
		this.title = title;
		this.pamount = pamount;
		this.sum = sum;
		this.pinterval = interval;
		this.detail = detail;
	}
	public Quotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPamount() {
		return pamount;
	}
	public void setPamount(String pamount) {
		this.pamount = pamount;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	
	public String getPinterval() {
		return pinterval;
	}
	public void setPinterval(String pinterval) {
		this.pinterval = pinterval;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
