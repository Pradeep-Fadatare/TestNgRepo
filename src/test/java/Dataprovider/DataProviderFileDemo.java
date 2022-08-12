package Dataprovider;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderFileDemo {
//    @DataProvider(name = "details")
//    public Object[][] dataSet() {
//        return new Object[][]{
//                {"standard_user", "secret_sauce"},
//                {"locked_out_user", "secret_sauce"},
//                {"problem_user", "secret_sauce"},
//                {"performance_glitch_user", "secret_sauce"}
//        };
//    }

//    @DataProvider(name="details1")
//    public Object[][] dataSet1()
//    {
//        Object[][] dataset = new Object[4][2];
//        //first row
//        dataset [0][0]="user1";
//        dataset [0][1]="password1";
//
//        //second row
//        dataset [1][0]="user2";
//        dataset [1][1]="password2";
//
//        //third row
//        dataset [2][0]="user3";
//        dataset [2][1]="password3";
//
//        //fourth row
//        dataset [3][0]="user4";
//        dataset [3][1]="password4";
//
//        return dataset;
//    }

    @DataProvider(name = "details")
    public Object[][] dataSet(Method m) {

        Object[][] testdata = null;
        if (m.getName().equals("test1")) {
            testdata = new Object[][]{
                    {"standard_user", "secret_sauce"},
                    {"locked_out_user", "secret_sauce"},
                    {"problem_user", "secret_sauce"},
                    {"performance_glitch_user", "secret_sauce"}
            };
        } else if (m.getName().equals("test")) {
            testdata = new Object[][]{
                    {"standard_user", "secret_sauce", "passed"},
                    {"locked_out_user", "secret_sauce", "passed"},
                    {"problem_user", "secret_sauce", "passed"},
                    {"performance_glitch_user", "secret_sauce", "passed"}
            };
        }
        return testdata;
    }

}


