package com.deptInfo.magasin.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "materiel")
public class Materiel implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "num_inventaire")
	private String nInverntaire;
	@Column(name="type_m")
	private String typeMateriel;
	@Column(name="date_acquisition")
	private java.sql.Date dateAcquisition;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Enseignant enseignant;

	/*@ManyToOne
	@JoinColumn(name = "id_demande")
	private Demande demande;*/
	@Column(name="date_affectation")
	private java.sql.Date dateAffectation;

	public Materiel() {
	}

	public Materiel(Long id, String nInverntaire, String typeMateriel, java.sql.Date dateAcquisition, Enseignant enseignant, java.sql.Date dateAffectation) {
		this.id = id;
		this.nInverntaire = nInverntaire;
		this.typeMateriel = typeMateriel;
		this.dateAcquisition = dateAcquisition;
		this.enseignant = enseignant;
		this.dateAffectation = dateAffectation;
	}

	public Long getIdMateriel() {
		return id;
	}

	public void setIdMateriel(Long idMateriel) {
		this.id = id;
	}

	public String getnInverntaire() {
		return nInverntaire;
	}

	public void setnInverntaire(String nInverntaire) {
		this.nInverntaire = nInverntaire;
	}

	public String getTypeMateriel() {
		return typeMateriel;
	}

	public void setTypeMateriel(String typeMateriel) {
		this.typeMateriel = typeMateriel;
	}

	public java.sql.Date getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(java.sql.Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public java.sql.Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
}
