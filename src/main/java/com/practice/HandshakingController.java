package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakingController {

	@GetMapping("/hello")
	public String handShake() {

		return "This is CICD pipeline demo project.";
	}
	
	@GetMapping("/tool")
	public String getToolName() {

		return "Jenkins.";
	}
	
	@GetMapping("/tech")
	public String getTechnologies() {

		return "Java SE 11, Spring [Boot, Cloud], DevOps: Git, Maven, Docker, Kubernetes, Ansible.";
	}
	
	@GetMapping("/cloud")
	public String getCloudPlatformName() {

		return "Amazon Web Services (AWS) - EC2, IAM, EKS [Elastic Kubernetes Service].";
	}

}
