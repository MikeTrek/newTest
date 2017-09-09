package sample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class numbChar {

    @Test(dataProvider="dp")
    public void symbol(String name) {
        Assert.assertTrue(name.length()>10);
    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][]{
                {"TestNG"},
                {"DataProvider"},
                {"Annotations"},
                {"Assert"},
                {"AssertTrue!"}
        };
    }
}