package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInfo;

import main.PhoneScreenReceiver;

class PhoneScreenReceiverTest {
	
	PhoneScreenReceiver phonescreenreceiver;
	
	@BeforeEach
	void setUp() {
		phonescreenreceiver = new PhoneScreenReceiver();
	}
	
	@BeforeEach
	void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		int currentRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions =  repetitionInfo.getTotalRepetitions();
		String methodName = testInfo.getTestMethod().get().getName();
		System.out.println(methodName + ": " + currentRepetition + "of" + totalRepetitions);
	}
	
	
	@RepeatedTest(1)
	@DisplayName("TS01 :Login Success")
	void testLoginSuccess() {
		System.out.println("Input = onReceive(1,true), Expected result = True, Actual result = True.");
		phonescreenreceiver.onReceive(1,true);
		System.out.println("isScreenOn : "+ phonescreenreceiver.isScreenOn);
		assertTrue(phonescreenreceiver.isScreenOn);
	}


	
	@RepeatedTest(2)
	@DisplayName("TS02 :ErrorLogin for 2 time")
	void testErrorLogin2time() {
		phonescreenreceiver.onReceive(2,false);
		assertFalse(phonescreenreceiver.isScreenOn);
		
	}
	

	@RepeatedTest(3)
	@DisplayName("TS03 :ErrorLogin for 3 time")
	void testErrorLogin3time() {
		phonescreenreceiver.onReceive(3,false);
		assertFalse(phonescreenreceiver.isScreenOn);
	}
	


	@AfterEach
	void beforeEach() {
		System.out.println("Tested by 633020559-4");
		System.out.println("------------------------------------------");
	}


}
