package com.simplilearn.test.resource;

import com.simplilearn.test.enums.StateCode;

public class StateResource {
	
	private String abbreviation;
    private String name;
    
    public StateResource(StateCode stateCode) {
        this.abbreviation = stateCode.getAbbreviation();
        this.name = stateCode.getName();
    }
    
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
