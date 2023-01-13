package com.deptInfo.magasin.model;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "enseignant")
public class Enseignant implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "grade_enseignant", nullable = false)
	private String gradeEnseignant;

	@Column(name = "chef_dept")
	private Boolean chefDept;

	@Column(name = "adjoint")
	private Boolean adjoint;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGradeEnseignant() {
		return gradeEnseignant;
	}

	public void setGradeEnseignant(String gradeEnseignant) {
		this.gradeEnseignant = gradeEnseignant;
	}

	public Boolean getChefDept() {
		return chefDept;
	}

	public void setChefDept(Boolean chefDept) {
		this.chefDept = chefDept;
	}

	public Boolean getAdjoint() {
		return adjoint;
	}

	public void setAdjoint(Boolean adjoint) {
		this.adjoint = adjoint;
	}
}
