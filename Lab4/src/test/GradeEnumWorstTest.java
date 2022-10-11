package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import main.GradeEnum;

class GradeEnumWorstTest {

	GradeEnum grade;
	
	
	@DisplayName("Robustness test")
	@ParameterizedTest
	@CsvFileSource(files="src/resource/Worst-case-resource.csv",numLinesToSkip =0)
	void RobustnessTest(int a,int b,int c) {
		grade = new GradeEnum(a,b,c);
		System.out.println("Grade: "+grade.classify());
		System.out.println("Status:"+grade.showResult(grade.classify()));
	}
	
	@AfterEach
	void name() {
		System.out.println("Tested by 633020559-4 Rattanaporn S.\n");
	}
}
