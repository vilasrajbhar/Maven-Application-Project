package com.mycompany.app;
import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    public AppTest() {
    }
    @Test
    public void AppTestImp()
    {
        App tester = new App();
        String S1 = "This is Maven Projects";
        Assert.assertEquals(S1, tester.project_desc());
    }

}
