package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Modifier {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomprenom;
    private String matricule;
    private String email;
    private Long tel;
    private Long portable;
    private String adresse;
    private Long idb;
    private String idc;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomprenom() {
		return nomprenom;
	}
	public void setNomprenom(String nomprenom) {
		this.nomprenom = nomprenom;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public Long getPortable() {
		return portable;
	}
	public void setPortable(Long portable) {
		this.portable = portable;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Long getIdb() {
		return idb;
	}
	public void setIdb(Long idb) {
		this.idb = idb;
	}
	public String getIdc() {
		return idc;
	}
	public void setIdc(String idc) {
		this.idc = idc;
	}
	@Override
	public String toString() {
		return "Modifier [id=" + id + ", nomprenom=" + nomprenom + ", matricule=" + matricule + ", email=" + email
				+ ", tel=" + tel + ", portable=" + portable + ", adresse=" + adresse + ", idb=" + idb + ", idc=" + idc
				+ "]";
	}
	

}
