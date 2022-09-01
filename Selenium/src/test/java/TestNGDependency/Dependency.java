package TestNGDependency;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {
	@Test(dependsOnMethods =  {"test2"})
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(dependsOnGroups = {"G3"})
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(groups = {"G3"})
	public void test3() {
		System.out.println("Test 3");
		assertTrue(false);
	}
	
	
	@Ignore    //To Ignore a test Do same for class 
	@Test(dependsOnGroups =  {"G.*"})     //Regular Expression 
	public void test4() {
		System.out.println("Test 4");
	}
}
