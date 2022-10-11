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

class GradeEnumRob {
	GradeEnum grade;
	
	@DisplayName("Robustness test")
	@ParameterizedTest
	@CsvSource({
		
		("0,15,20"), 	
		("1,15,20"), 	
		("15,15,20"),	
		("29,15,20"),	
		("30,15,20"),   
		("15,0,20"),	
		("15,1,20"),	
		("15,29,20"),	
		("15,30,20"),	
		("15,15,0"),	
		("15,15,1"),	
		("15,15,39"),   
		("15,15,40"),
		("-1,15,20"),
		("15,-1,20"),
		("15,15,-1"),
		("31,15,20"),
		("15,31,20"),
		("15,15,41"),
		
	})
	void robustnessTest(int a,int b,int c) {
		grade = new GradeEnum(a,b,c);
		System.out.println("Grade: "+grade.classify());
		System.out.println("Status:"+grade.showResult(grade.classify()));
	}
	
	@AfterEach
	void name() {
		System.out.println("Tested by 633020559-4 Rattanaporn S.\n");
	}
}
