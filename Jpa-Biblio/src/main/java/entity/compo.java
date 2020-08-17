package entity;

import static org.junit.Assert.*;

import javax.persistence.*;


import org.junit.Test;

@Entity
@Table(name = "compo")
public class compo 
{
	
	@Id
	private Integer id;
	
	@Column(name = "ID_LIV", length = 10, nullable = false)
	private Integer id_liv;
	
	@Column(name = "ID_EMP", length = 10, nullable = false)
	private Integer id_emp;
	
	public compo()
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_liv() {
		return id_liv;
	}

	public void setId_liv(Integer id_liv) {
		this.id_liv = id_liv;
	}

	public Integer getId_emp() {
		return id_emp;
	}

	public void setId_emp(Integer id_emp) {
		this.id_emp = id_emp;
	}

	@Override
	public String toString() {
		return " " + id + ": " + id_liv + " // " + id_emp + " ";
	}
	
	

}
