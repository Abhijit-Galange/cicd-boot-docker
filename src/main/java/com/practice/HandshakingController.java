package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakingController {

	@GetMapping("/hello")
	public String handShake() {

		return "Hi!!! This is Jenkins CICD pipeline demo project.";
	}
	
	@GetMapping("/which")
	public String getTechnologies() {

		return "Technologies used are Java SE 11, Spring Boot, Spring Cloud, Maven, Git, Git Hub, Docker, Docker Hub, Ansible, Kubernetes, EKS [Amazon Elastic Kubernetes Service]";
	}
	
	@GetMapping("/cloud")
	public String getCloudPlatformName() {

		return "Amazon Web Services (AWS) - EC2, IAM, EKS";
	}

}
