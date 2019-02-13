import java.util.Scanner;
import java.util.Calendar;
import java.lang.String;

public class PrintProcessor
{
    public void EnterBirthYear()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the year you were born ");
        System.out.println("This is dean");
        String year = scan.nextLine();
        System.out.println(CalcAge(Integer.parseInt(year)));

        scan.next();
    }
    public int CalcAge(int year)
    {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;

        return age;
    }
}
