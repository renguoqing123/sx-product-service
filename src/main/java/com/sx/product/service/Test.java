package com.sx.product.service;

import java.io.IOException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
	public static void main(String[] args) throws IOException {
		log.info("======================debug");
    	log.error("======================error");
    	log.trace("======================trace");
    	log.warn("======================warn");
    	log.debug("======================debug");
	}
}
