package com.springbootrestApi2.spring_Boot_restApi2.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Setter
@Getter
@ToString
public class BaseEntity implements Serializable {
	
	private Date createData;
	
	private String  createdBy;
	
	private Date updateAt;
	
	private String updateBy;

}
