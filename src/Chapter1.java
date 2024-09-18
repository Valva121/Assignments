
public class Chapter1 {
    public static void main (String[] args){
     /*Q 1.11
     Write a program to display the population for each of the next five years. Assume the
        current population is 312,032,486 and one year has 365 days.

        ■ One birth every 7 seconds
        ■ One death every 13 seconds
        ■ One new immigrant every 45 seconds
        ⚠️ CAUTION ⚠️
        Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated. For
        example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
        the fractional part, one of the values involved in the division must be a number with a
        decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

        Extra 4 me:
            float -> for smaller decimals numbers with less precision (add 'f' at the end so it knows it's a float value)
            double -> for larger decimal numbers with more precision
            long -> for large whole numbers (integers) (add an 'l' at the end so it knows that it's long value)
      */
        //Known Information
        long current_population = 312032486;

        //Step 1 --> how many seconds are in a yr 60 sec-> 1 min, 60 min-> 1 hr, 24 hrs-> 1 day, 365 days-> 1 yr
        long sec_in_yr = 365 * 24 * 60 * 60;
        //Step 2 --> calculate the birth, death and immigrants in a year using the above calculations
        long birth = sec_in_yr/ 7;
        long death = sec_in_yr/ 13;
        long immigrant = sec_in_yr/45;

        //Step 3 --> add births with immigrants and then subtract deaths
        long pop_change = (birth + immigrant) - death;
        //System.out.println(pop_change + current_population);
        //Step 4 --> Repeat for 5 yrs
        long yr_1 = current_population + pop_change;
        long yr_2 = yr_1 + pop_change;
        long yr_3 = yr_2 + pop_change;
        long yr_4 = yr_3 + pop_change;
        long yr_5 = yr_4 + pop_change;

        System.out.println("The Population for the Next Five Years");
        System.out.println("The current population for Year 1 is: " + yr_1);
        System.out.println("The current population for Year 2 is: " + yr_2);
        System.out.println("The current population for Year 3 is: " + yr_3);
        System.out.println("The current population for Year 4 is: " + yr_4);
        System.out.println("The current population for Year 5 is: " + yr_5);

    /* Q 1.13
    (Algebra: solve 2 * 2 linear equations)
    You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
    //These are the FORM in which the equations are in//
    ax + by = e
    cx + dy = f

    //THESE ARE THE FORMULAS//
    x = ed - bf/ad - bc
    y = af - ec/ad - bc

    Write a program that solves the following equation and displays the value for x and y:
    //These are the equations given//
    3.4x + 50.2y = 44.5
    2.1x + .55y = 5.9

     */
    // Step 1--> setup values for each letter
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

    // Step 2--> use cramer's rule to calculate for x and y with the formulas
        double x = (e*d - b*f)/(a*d - b*c);
        double y = (a*f - e*c)/(a*d - b*c);
    // Step 3 --> print out x and y
        System.out.println();
        System.out.println("Solving the following 2 x 2 system of linear equation");
        System.out.println("The value for x is: " + x);
        System.out.println("The value for y is: " + y);
    }

}
