package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fourthpgm {
    @AfterTest
    public void LastExecution()
    {
        System.out.println("i will execute last");
    }
    @Parameters({"URL"})
    @Test(groups = {"Smoke"})
    public void WebLoginCarLoan(String webloginFourth)
    {
        System.out.println("WebLogin");
        System.out.println(webloginFourth);
    }
    @Test
    public void MobileLoginCarLoan()
    {
        System.out.println("MobileLogin");

    }
    @Test
    public void LoginApiCarLoan()
    {
        System.out.println("ApiLogin");
    }
}
