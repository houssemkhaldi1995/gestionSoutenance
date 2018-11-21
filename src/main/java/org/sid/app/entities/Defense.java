package org.sid.app.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@SuppressWarnings("serial")
public class Defense implements Serializable {

	@Id
	@GeneratedValue
	private Long defenseId;
	private Date date;
	private String classroom;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Teacher> juries;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Student student;

	public Defense() {
		super();
	}

	public Collection<Teacher> getJuries() {
		return juries;
	}

	public void setJuries(Collection<Teacher> juries) {
		this.juries = juries;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getDefenseId() {
		return defenseId;
	}

	public void setDefenseId(Long defenseId) {
		this.defenseId = defenseId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

}
