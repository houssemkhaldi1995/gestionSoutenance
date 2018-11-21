package org.sid.app.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class Topic implements Serializable {

	@Id
	@GeneratedValue
	private Long topicId;

	private String title;
	private String domain;
	private int duration;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Company company;

	public Topic() {
		super();
	}

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Company getEntreprise() {
		return company;
	}

	public void setEntreprise(Company company) {
		this.company = company;
	}

}
