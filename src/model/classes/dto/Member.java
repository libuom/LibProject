package model.classes.dto;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity								//Kathorismos Ontothtas Vivliwn.
@Table (name = "����")				//Onomasia pinaka Melwn
public class Member {
	
	@Column (name = "�����",nullable=false)
    private String studentName;
	@Column (name = "�������",nullable=false)
	private String studentSurname;
	@Id                      				// Dhlwsh tou ID(Arithmo Mitrwou 
	@Column (name = "��")    				//  san prwteuon kleidi
	private String iD;
	@Column (name = "�����",nullable=false)
	private String department;
	@Column (name = "�mail",nullable=false)
	private String email;
	@Column (name = "��������")
	private double latePoints;
	@OneToMany(mappedBy="member")							//Dhlwsh syxetishs Ena pros Polla apo Melos se Vivlio
	private Collection<Book> books = new ArrayList<Book>();	//Lista Vivliwn pou exei daneistei to melos
	@OneToMany(mappedBy="member")
	private Collection<MemberBook> mb = new ArrayList<MemberBook>();
	
	
	public Collection<Book> getBooks() {
		return books;
	}
	public void setBooks(Collection<Book> books) {
		this.books = books;
	}
	public Collection<MemberBook> getMb() {
		return mb;
	}
	public void setMb(Collection<MemberBook> mb) {
		this.mb = mb;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSurname() {
		return studentSurname;
	}
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getLatePoints() {
		return latePoints;
	}
	public void setLatePoints(double latePoints) {
		this.latePoints = latePoints;
	}
	}