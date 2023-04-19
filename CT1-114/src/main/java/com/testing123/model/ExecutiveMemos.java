package com.testing123.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "executive_memos")
public class ExecutiveMemos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "memo")
	private String memo;
	
	@Column(name = "date_created")
	private LocalDateTime dateCreated;
	
	@Column(name = "day_of_week")
	private DayOfWeek dayOfWeek;
	
	public ExecutiveMemos() {
		
	}
	
	public ExecutiveMemos(String memo, LocalDateTime dateCreated, DayOfWeek dayOfWeek) {
		this.memo = memo;
		this.dateCreated = dateCreated;
		this.dayOfWeek = dayOfWeek;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
}