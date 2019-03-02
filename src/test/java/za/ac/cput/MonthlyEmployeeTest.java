package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class MonthlyEmployeeTest {
    private MonthlyEmployee emp;

    @BeforeMethod
    public  void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (SalaryInterface)ctx.getBean("emp");
    }

    @AfterMethod
    public void tearDown() throws Exception
    {

    }

    @Test
    public void salary() throws Exception
    {
        int result = emp.salary(600,20);
        Assert.assertEquals("calculated salary",500, result);
    }
}