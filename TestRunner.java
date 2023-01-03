package testCase;

import org.testng.TestNG;

public class TestRunner {
static TestNG testNG;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
testNG = new TestNG();
testNG.setTestClasses(new Class[] {Login_tc.class,job_tc.class,Candidate_tc.class,Schedule_tc.class,Setting_tc.class});
testNG.run();
	}

}
