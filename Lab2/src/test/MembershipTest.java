package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import main.Membership;
class MembershipTest {
	Membership membership = new Membership();
	
	@Test
	void test() {
		
	}
	@Test
	@DisplayName("TC01 :checkMembershipStatus")
	void testMembershipStatus() {
		
		assertEquals("Gold",membership.checkMembershipStatus(membership.calculatePoint(30,25,25)));
		assertEquals("Platinum",membership.checkMembershipStatus(membership.calculatePoint(90,30,25)));
		assertEquals("Silver",membership.checkMembershipStatus(membership.calculatePoint(25,5,25)));
		assertEquals("Copper",membership.checkMembershipStatus(membership.calculatePoint(30,5,5)));
		assertEquals("Zinc",membership.checkMembershipStatus(membership.calculatePoint(9,11,3)));
		assertEquals("Invalid",membership.checkMembershipStatus(membership.calculatePoint(-1,-3,-2)))
		;
	}
	@Test
	@DisplayName("TC02 :Error totalPoint")
	void testErrorTotalPoint() {
		assertEquals(-1,membership.calculatePoint(-1,-1,-1));
		
	}
	
}
