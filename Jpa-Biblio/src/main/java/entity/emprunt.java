package entity;

import static org.junit.Assert.*;

import javax.persistence.*;


import org.junit.Test;

@Entity
@Table(name = "emprunt")

public class emprunt 
{
	
	@Id
	private Integer id;
	
	@Column(name = "DATE_DEBUT", length = 255, nullable = false)
	private String date_debut;
	
	@Column(name = "DELAI", length = 10, nullable = false)
	private Integer delai;
	
	@Column(name = "DATE_FIN", length = 255, nullable = false)
	private String date_fin;
	
	@Column(name = "ID_CLIENT", length = 10, nullable = false)
	private Integer id_client;
	
	public emprunt()
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}

	@Override
	public String toString() {
		return " " + id + " : " + date_debut + " // " + delai + " // " + date_fin
				+ " // " + id_client + " ";
	}
	
	

}
