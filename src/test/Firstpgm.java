package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firstpgm {
    @Test(enabled=false)
    public void Demo()
    {
        System.out.println("hai");
    }
    @BeforeTest
    public void prerequiste()
    {
        System.out.println("i will execute first");
    }
    @AfterSuite
    public void Asuite()
    {
        System.out.println("Iam the no 1 from last");
    }
    @Test(groups = {"Smoke"})
    public void Demo1()
    {
        System.out.println("bye");
        Assert.assertTrue(false);
    }

}
