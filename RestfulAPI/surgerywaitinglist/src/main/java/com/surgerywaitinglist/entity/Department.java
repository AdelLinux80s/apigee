package com.surgerywaitinglist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="department")
@Entity
public class Department {

	@Id
	@GeneratedValue
	private Long departmentId;
	private String departmentName;
}
