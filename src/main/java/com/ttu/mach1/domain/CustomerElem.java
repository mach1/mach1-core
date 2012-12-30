package com.ttu.mach1.domain;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "customer")
public class CustomerElem {

	@JsonProperty
	private String firstName;
	@JsonProperty
	private String lastName;
	@JsonIgnore
	private String jsonCallback;

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

	public String getJsonCallback() {
		return jsonCallback;
	}

	public void setJsonCallback(String jsonCallback) {
		this.jsonCallback = jsonCallback;
	}

}
