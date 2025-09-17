package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakingController {

	@GetMapping("/whoami")
	public String handShake() {

		return "This is Jenkins CICD pipeline demo project.";
	}
	
	@GetMapping("/tech")
	public String getTechnologies() {

		return "Technologies used are Java SE 11, Spring [Boot, Cloud], Maven, Git, Docker, Ansible, Kubernetes, EKS [Amazon Elastic Kubernetes Service].";
	}
	
	@GetMapping("/cloud")
	public String getCloudPlatformName() {

		return "Amazon Web Services (AWS) - EC2, IAM, EKS";
	}

}
