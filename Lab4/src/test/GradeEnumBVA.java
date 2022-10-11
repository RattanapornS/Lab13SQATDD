package test;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.GradeEnum;
import main.GradeEnum.GradeType;

class GradeEnumBVA {
	
	@DisplayName("TC01: BVA")
	@ParameterizedTest
	@CsvSource({
		("0,15,20"), 	//TS1
		("1,15,20"), 	//TS2
		("15,15,20"),	//TS3
		("29,15,20"),	//TS4
		("30,15,20"),   //TS5
		("15,0,20"),	//TS6
		("15,1,20"),	//TS7
		("15,29,20"),	//TS8
		("15,30,20"),	//TS9
		("15,15,0"),	//TS10
		("15,15,1"),	//TS11
		("15,15,39"),   //TS12
		("15,15,40")    //TS13
	})
	
	void test(int a , int b , int c) {
		GradeEnum grade = new GradeEnum(a,b,c);
		System.out.println("\n"+"Grade :"+grade.classify());
		System.out.println("Status :"+grade.showResult(grade.classify()));
		System.out.println("------------------------------------");
		
	}
	
	
	
		
}

 