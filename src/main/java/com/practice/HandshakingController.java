package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakingController {

	@GetMapping("/hello")
	public String handShake() {

		return "This is Jenkins CICD pipeline project. Technologies used Java SE 11, Maven, Git, Git Hub, Docker, Docker Hub, Ansible, AWS EC2, EKS";
	}

}
