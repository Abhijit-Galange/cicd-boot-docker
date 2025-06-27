package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakingController {

	@GetMapping("/hello")
	public String handShake() {

		return "Hi!!! This is Jenkins CICD pipeline project.";
	}
	
	@GetMapping("/which")
	public String getTechnologies() {

		return "Technologies used Java SE 11, Spring Boot, Spring Cloud, Maven, Git, Git Hub, Docker, Docker Hub, Ansible, AWS EC2, EKS";
	}
	
	@GetMapping("/cloud")
	public String getCloudPlatformName() {

		return "Amazon Web Services (AWS)";
	}

}
