package com.simplilearn.test.controller;

import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.simplilearn.test.enums.StateCode;
import com.simplilearn.test.resource.StateResource;

@RestController
@RequestMapping("/states")
public class StateCodeController {

	@GetMapping
    public List<StateResource> getStates() {
        return EnumSet.allOf(StateCode.class).stream()
        		.map(StateResource::new)
        		.collect(Collectors.toList());
    }
	
	@GetMapping("/{stateCode}")
	public StateResource getState(@PathVariable String stateCode) {
		StateResource stateResource = Optional.ofNullable(StateCode.getByName(stateCode))
				.map(StateResource::new)
				.orElse(null);
		if (stateResource == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No State found.");
		}
		return stateResource;
	}
	
}
