package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App
{
    public App() {
    }
    public static void main( String[] args )
    {
        Logger logger = LogManager.getLogger(App.class);
        App app = new App();
        logger.info( "Hello World!" );
        logger.info(app.ProjectDesc());
    }

    public String ProjectDesc() {
        String S1 = "This is Maven Projects";
        return S1;
    }
}
