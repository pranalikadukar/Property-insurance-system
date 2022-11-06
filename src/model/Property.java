package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property")

public class Property {
	
	@Id  @GeneratedValue
	private int id;
	private String pname;
	private String cname;
	private String contact;
	private String email;
	private String addr;
	private String area; 
	private String fwidth, swidth,  rate, crate, page, Regi, detail;
	
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property( String pname, String cname, String contact, String email, String addr, String area,
			String fwidth, String swidth, String rate, String crate, String page, String regi, String detail) {
		super();
		
		this.pname = pname;
		this.cname = cname;
		this.contact = contact;
		this.email = email;
		this.addr = addr;
		this.area = area;
		this.fwidth = fwidth;
		this.swidth = swidth;
		this.rate = rate;
		this.crate = crate;
		this.page = page;
		this.Regi = regi;
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFwidth() {
		return fwidth;
	}
	public void setFwidth(String fwidth) {
		this.fwidth = fwidth;
	}
	public String getSwidth() {
		return swidth;
	}
	public void setSwidth(String swidth) {
		this.swidth = swidth;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getCrate() {
		return crate;
	}
	public void setCrate(String crate) {
		this.crate = crate;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getRegi() {
		return Regi;
	}
	public void setRegi(String regi) {
		Regi = regi;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
