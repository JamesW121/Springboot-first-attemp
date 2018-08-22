package com.first.attempt.domain;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class First implements Serializable {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @NotNull(message = "Cannot be Empty")
	 private String name;

	 @NotNull(message = "Cannot be Empty")
	 private Integer value;

	 public Long getId() {
	     return id;
	 }

	 public void setId(Long id) {
	     this.id = id;
	 }

	 public String getName() {
	     return name;
	 }

	 public void setName(String name) {
	     this.name = name;
	 }

	 public Integer getValue() {
	     return value;
	 }

	 public void setValue(Integer value) {
	     this.value = value;
	 }

	 @Override
	 public String toString() {
	     return "User{" +
	             "id=" + id +
	             ", name='" + name + '\'' +
	             ", value=" + value +
	             '}';
	 }

}
