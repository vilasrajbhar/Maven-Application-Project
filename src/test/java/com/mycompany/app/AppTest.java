package com.mycompany.app;
import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    public static final String NEWVARIABLE_1 = "This is Maven Projects";
    public AppTest() {
    }
    @Test
    public void AppTestImp()
    {
        App tester = new App();
        Assert.assertEquals(NEWVARIABLE_1, tester.projectDesc());
    }

}
