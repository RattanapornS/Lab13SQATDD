package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import main.TVPlan;
import main.TVPlan.TVPackage;

class TVPlanEedt {
	TVPlan tvest;

	@ParameterizedTest
	@MethodSource("AdditionPackge")
	void test_EEDT_BASIC(boolean family, boolean inter, boolean disc) {
        tvest = new TVPlan(family,inter,disc);
        double sum =tvest.pricePerMonth(TVPackage.BASIC);
        System.out.println("BasicPackage: "+sum);
        System.out.println("Rattanaporn Suandokmai SID: 633020559-4");
	}
	@ParameterizedTest
	@MethodSource("AdditionPackge")
	void test_EEDT_STARDARD(boolean family, boolean inter, boolean disc) {
        tvest = new TVPlan(family,inter,disc);
        double sum =tvest.pricePerMonth(TVPackage.STANDARD);
        System.out.println("StardardPackage: "+sum);
        System.out.println("Rattanaporn Suandokmai SID: 633020559-4");
	}
	@ParameterizedTest
	@MethodSource("AdditionPackge")
	void test_EEDT_PREMIUM(boolean family, boolean inter, boolean disc) {
        tvest = new TVPlan(family,inter,disc);
        double sum =tvest.pricePerMonth(TVPackage.PREMIUM);
        System.out.println("PremiumPackage: "+sum);
        System.out.println("Rattanaporn Suandokmai SID: 633020559-4");
	}
	

	static Stream<Arguments> AdditionPackge() {
		return Stream.of(
				Arguments.of(false, false, false), 
				Arguments.of(true, false, false),
				Arguments.of(false, true, false), 
				Arguments.of(false, false, true), 
				Arguments.of(true, true, false),
				Arguments.of(true, false, true), 
				Arguments.of(false, true, true),
				Arguments.of(true, true, true));
	}
	
}
