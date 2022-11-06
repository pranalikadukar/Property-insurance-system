package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="contact")
public class Contact {
@Id  @GeneratedValue
private int id ;
private String cname ;
private String pname ;
private String subject ;
private String message ;
private String status;

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
public Contact( String cname, String pname, String subject, String message, String status) {
	super();
	this.cname = cname;
	this.pname = pname;
	this.subject = subject;
	this.message = message;
	this.status = status;
}




}
