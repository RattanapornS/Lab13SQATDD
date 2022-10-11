package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import main.TVPlan;
import main.TVPlan.TVPackage;

class TVPlanLedt {
TVPlan tvest;
    
    @ParameterizedTest
    @MethodSource("PackageTest")
    void test_LEDT_Basic(boolean b1,boolean b2,boolean b3) {
        tvest = new TVPlan(b1,b2,b3);
        TVPackage p1=null;
        double sum =tvest.pricePerMonth(TVPackage.BASIC);
        System.out.println("BasicPackage: "+sum);
        System.out.println("Rattanaporn Suandokmai SID: 633020559-4");
        
    }
    
	static Stream<Arguments> PackageTest() {
		return Stream.of(
				Arguments.of(true, true, true), 
				Arguments.of(true, true, false),
				Arguments.of(true, false, true), 
				Arguments.of(true, false, false), 
				Arguments.of(false, true, true),
				Arguments.of(false, false, true), 
				Arguments.of(false, true, false),
				Arguments.of(false, false, false));
	}
	
	@ParameterizedTest
    @MethodSource("PackageTest")
    void test_EEDT_STARDARD(boolean b1,boolean b2,boolean b3) {
        tvest = new TVPlan(b1,b2,b3);
        TVPackage p1=null;
        double sum =tvest.pricePerMonth(TVPackage.BASIC);
        System.out.println("StandardPackage: "+sum);
        System.out.println("Rattanaporn Suandokmai SID: 633020559-4");
        
    }
	static Stream<Arguments> standardTest() {
		return Stream.of(
				Arguments.of(true, true, true), 
				Arguments.of(true, true, false),
				Arguments.of(true, false, true), 
				Arguments.of(true, false, false), 
				Arguments.of(false, true, true),
				Arguments.of(false, false, true), 
				Arguments.of(false, true, false),
				Arguments.of(false, false, false));
	}
    
    @ParameterizedTest
    @MethodSource("PackageTest")
    void test_LEDT_PREMIUM(boolean b1,boolean b2,boolean b3) {
       
        tvest = new TVPlan(b1,b2,b3);
        double sum =tvest.pricePerMonth(TVPackage.PREMIUM);
        System.out.println("PremiumPackage: "+sum);
        System.out.println("Rattanaporn Suandokmai SID: 633020559-4");
    }
    
	static Stream<Arguments> premiumTest() {
		return Stream.of(
				Arguments.of(true, true, true), 
				Arguments.of(true, true, false),
				Arguments.of(true, false, true), 
				Arguments.of(true, false, false), 
				Arguments.of(false, true, true),
				Arguments.of(false, false, true),
				Arguments.of(false, true, false),
				Arguments.of(false, false, false));
	}

}