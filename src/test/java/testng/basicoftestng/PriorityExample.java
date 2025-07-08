package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void caseT() {
        System.out.println("case T");
    }

    @Test(enabled = true)
    public void caseM() {
        System.out.println("case M");
		System.out.println("Good Evening...");
    }

    @Test(priority = 3)
    public void caseA() {
        System.out.println("case A");
    }

    @Test(priority = -4)
    public void caseQ() {
        System.out.println("case Q");
    }

    @Test(priority = 5)
    public void caseZ() {
        System.out.println("case Z");
    }
}
