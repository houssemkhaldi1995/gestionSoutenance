package org.sid.app.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@SuppressWarnings("serial")
public class Speciality implements Serializable {

	@Id
	@GeneratedValue
	private Long specialityId;

	private String name;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Teacher departmentHead;

	public Speciality() {
		super();
	}

	public Long getSpecialityId() {
		return specialityId;
	}

	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(Teacher departmentHead) {
		this.departmentHead = departmentHead;
	}

}
