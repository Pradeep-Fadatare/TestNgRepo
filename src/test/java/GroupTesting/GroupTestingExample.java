package GroupTesting;

import BasicTestNg.BeforeAfterSuite;
import org.testng.annotations.*;


public class GroupTestingExample extends BeforeAfterSuite {

    @BeforeClass
    public void beforeclass(){
        System.out.println("before class ");
    }

    @BeforeGroups(value = "regresssion")
    public void beforegroups(){
        System.out.println("run this method before regression ");
    }

    @AfterGroups(value = "regresssion")
    public void aftergroups(){
        System.out.println("run this method after regression ");
    }

    @Test(priority = 6,groups = "regression")
    public void method1(){
        System.out.println("TestCase 1");
    }

    @Test(priority = 2,groups = "regression")
    public void method6(){
        System.out.println("TestCase 6");
    }

    @Test(priority = 4,groups = {"regression","bvt"})
    public void method5(){
        System.out.println("TestCase 5");
    }

    @Test(priority = 1,groups = "bvt")
    public void method4(){
        System.out.println("TestCase 4");
    }

    @Test(priority = 3,groups = {"regression","smoke"})
    public void method3(){
        System.out.println("TestCase 3");
    }

    @Test(priority = 5,groups = {"smoke","bvt"})
    public void method2(){
        System.out.println("TestCase 2");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("After class");
    }
}
