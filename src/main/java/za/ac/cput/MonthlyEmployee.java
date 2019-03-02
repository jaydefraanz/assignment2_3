package za.ac.cput;

public class MonthlyEmployee implements SalaryInterface
{
    @Override
    public int salary(int dailyRate,int workDays)
    {
        return dailyRate * workDays;
    }
}
