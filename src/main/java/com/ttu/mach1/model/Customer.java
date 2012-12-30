package com.ttu.mach1.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "customer")
	private Long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "identity_code")
	private String identityCode;
	private String note;
	private Date created;
	private Date updated;
	@Column(name = "created_by")
	private Long createdBy;
	@Column(name = "updated_by")
	private Long updatedBy;
	@Column(name = "birth_date")
	private Date birthDate;
	@Column(name = "cst_type")
	private Integer cstType;
	@Column(name = "cst_state_type")
	private Integer cstStateType;

	// private Set<CustomerAddress> addresses = new HashSet<CustomerAddress>(0);

	// @OneToMany(fetch = FetchType.EAGER, targetEntity = CustomerAddress.class)
	// @JoinTable(name = "cst_address", joinColumns = { @JoinColumn(name =
	// "customer") }, inverseJoinColumns = { @JoinColumn(name = "customer") })
	// public Set<CustomerAddress> getAddresses() {
	// return addresses;
	// }

	// public void setAddresses(Set<CustomerAddress> addresses) {
	// this.addresses = addresses;
	// }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityCode() {
		return identityCode;
	}

	public void setIdentityCode(String identityCode) {
		this.identityCode = identityCode;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getCstType() {
		return cstType;
	}

	public void setCstType(Integer cstType) {
		this.cstType = cstType;
	}

	public Integer getCstStateType() {
		return cstStateType;
	}

	public void setCstStateType(Integer cstStateType) {
		this.cstStateType = cstStateType;
	}

}
