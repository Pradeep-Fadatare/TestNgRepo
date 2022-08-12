package Dataprovider;

import org.testng.annotations.Test;

public class DataProviderDemoTest {

    @Test(dataProvider = "details", dataProviderClass = DataProviderFileDemo.class)
    public void test1(String username, String password) {

        System.out.println(username + "-----" + password);
    }


    @Test(dataProvider = "details", dataProviderClass = DataProviderFileDemo.class)
    public void test(String username, String password, String test) {

        System.out.println(username + "-----" + password + "    " + test);

    }

}
