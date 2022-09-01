package TestNGListeners;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 // @Listeners(TestNGListeners.Listeners.class) //package.classname.class    
//xml is added so no need else add the annotation
public class TestNGListenersTest {
	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
		//Assert.assertTrue(false); To make test fail
	}

	@Test
	public void test3() {
		System.out.println("Test 3");
	}
}
