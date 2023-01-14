package com.simplilearn.accountms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCheckController {

	@GetMapping("accounts/status/check")
	public String statusCheck() {
		return "account-ms is working..";
	}
}
