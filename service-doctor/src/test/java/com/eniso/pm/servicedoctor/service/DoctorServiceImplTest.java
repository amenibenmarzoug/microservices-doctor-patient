package com.eniso.pm.servicedoctor.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DoctorServiceImplTest {
	DoctorServiceImpl  d= new DoctorServiceImpl();
	@Test
	void test() {
		assertEquals("Hello World!", d.sayHello());
	}

}
