package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App
{
    private static Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        App app = new App();
        logger.info( "Hello World!" );
        logger.info(app);
    }

    public String project_desc(){
        return "This is Maven Projects";
    }

}
