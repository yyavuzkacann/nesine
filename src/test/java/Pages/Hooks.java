package Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setDriver(){
        DriverManager.setUp();
    }

    @After
    public void tearDown(){
        DriverManager.tearDown();
    }
}
