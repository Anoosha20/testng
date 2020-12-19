package test;

import org.testng.annotations.*;

public class Thirdpgm {
    @Parameters({"URL","apikey/usrname"})
    @Test
    public void WebLoginHomeLoan(String urlname,String key)
    {
        System.out.println("WebLoginHome");
        System.out.println(urlname);
        System.out.println(key);
    }
    @Test
    public void MobileLoginHomeLoan()
    {
        System.out.println("MobileLoginHome");

    }
    @Test(dataProvider = "getData")
    public void MobileLoginHome(String Username, String Password )
    {
        System.out.println("MobileLoginHome");
        System.out.println(Username);
        System.out.println(Password);

    }
    @Test(groups = {"Smoke"})
    public void MobileLoginLoan()
    {
        System.out.println("MobileLoginHome");

    }
    @BeforeClass
    public void Bclass()
    {
        System.out.println("I will execute Before class");
    }
    @AfterClass
    public void Aclass()
    {
        System.out.println("I will execute After class");
    }
    @BeforeSuite
    public void Bsuite()
    {
        System.out.println("I am the no 1");
    }
    @AfterMethod
    public void Amethod()
    {
        System.out.println("I will execute after every test method");
    }
    @BeforeMethod
    public void bmethod()
    {
        System.out.println("I will execute before every test method");
    }
    @Test
    public void MobileHomeLoan()
    {
        System.out.println("MobileLoginHome");

    }
    @Test(dependsOnMethods = {"MobileLoginHomeLoan"})
    public void LoginApiHomeLoan()
    {
        System.out.println("ApiLoginHome");
    }
    @DataProvider
    public Object[][] getData()
    {
        Object[][] data=new Object[3][2];
        data[0][0]="Firstusername";
        data[0][1]="Firstpassword";
        data[1][0]="Secondusername";
        data[1][1]="Secondpassword";
        data[2][0]="Thirdusername";
        data[2][1]="Thirdpassword";
        return data;


    }
}
