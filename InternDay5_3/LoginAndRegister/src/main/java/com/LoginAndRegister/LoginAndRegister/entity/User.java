package com.LoginAndRegister.LoginAndRegister.entity;

import java.util.Collection;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	 private String firstName;
	
	
	@Column(nullable = false,unique = true)
	 private String email;
	
	@Column(nullable = false)
	 private String password;
	
	 @ManyToMany(fetch = FetchType.EAGER,cascade =CascadeType.ALL )
	  @JoinTable(
	            name="users_roles",
	            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
	            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
	 private Collection<Role> roles;
	
}
