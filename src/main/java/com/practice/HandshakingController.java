package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakingController {

	@GetMapping("/hello")
	public String handShake() {

		return "This is Jenkins CICD pipeline project. I'm available at DockerHub, running inside ec2 container and kubernetes [EKS] pod's container";
	}

}
