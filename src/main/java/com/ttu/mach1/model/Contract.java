package com.ttu.mach1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contract {
	@Id
	@GeneratedValue
	@Column(name = "contract")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "contract_status_type")
	private ContractStatusType contractStatusType;

	private Long customer;

	@ManyToOne
	@JoinColumn(name = "contract_type")
	private ContractType contractType;

	private String name;
	private String description;

	@Column(name = "valid_to")
	private Date validTo;
	@Column(name = "valid_from")
	private Date validFrom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContractStatusType getContractStatusType() {
		return contractStatusType;
	}

	public void setContractStatusType(ContractStatusType contractStatusType) {
		this.contractStatusType = contractStatusType;
	}

	public Long getCustomer() {
		return customer;
	}

	public void setCustomer(Long customer) {
		this.customer = customer;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

}
