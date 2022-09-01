package Groups;

import org.testng.annotations.Test;


@Test(groups= {"ClassGroup"})    //This is class level group , all the methods gets included 
public class Groups {
	@Test(groups = {"1"})
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(groups = {"1","2"})
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(groups = {"3"})
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups = {"Windows.test"})    //Meta Groups 
	public void test4() {
		System.out.println("Windows");
	}
	
	@Test(groups = {"Linex.test"})
	public void test5() {
		System.out.println("Linex");
	}
}
