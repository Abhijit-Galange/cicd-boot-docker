package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakingController {

	@GetMapping("/hello")
	public String handShake() {

		return "This is Jenkins CICD pipeline project. It's being developed using Java 11, Maven, Git, Git Hub, Docker, DockerHub, AWS EC2, EKS";
	}

}
