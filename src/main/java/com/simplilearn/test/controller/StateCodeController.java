package com.simplilearn.test.controller;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.test.enums.StateCode;
import com.simplilearn.test.resource.StateResource;

@RestController("/states")
public class StateCodeController {

	@GetMapping("/states")
    public List<StateResource> getStates() {
        return EnumSet.allOf(StateCode.class).stream()
        		.map(StateResource::new)
        		.collect(Collectors.toList());
    }
	
}
