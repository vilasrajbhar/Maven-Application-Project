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
        String stext = "This is Maven Projects";
        Assert.assertEquals(stext, tester.project_desc());
    }

}
