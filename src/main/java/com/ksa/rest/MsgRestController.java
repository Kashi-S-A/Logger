package com.ksa.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	private Logger logger = LoggerFactory.getLogger(MsgRestController.class);

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		logger.trace("***************welcome() to trace ***************************");

		logger.debug("***************welcome() to debug ***************************");

		logger.info("***************welcome() to info ***************************");

		String msg = "Welcome to my App...........!";

		logger.warn("***************welcome() to warn ***************************");

		logger.error("***************welcome() to error ***************************");

		return msg;
	}
}
