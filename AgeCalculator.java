
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    private int currentYear = 2025;
    
    public void legalAge(int yearofBirth){
        int age;
        age= currentYear - yearofBirth;
        if (age>=16){
            System.out.println(age + " You are eligible to drive a car in Canada");   
        }
        else    System.out.println(16 - age + " more years before you can drive!");
    }
    
    /*
     * public int yearofBirth(){
     *  age = currentYear - this.yearofBirth;
     *  legalAge = 18;
     *  if (age >= 16){
     *      System.out.println(age + "You are eligible to drive a car in Canada")
     *  else
     *      Sysytem.out.println("You must wait:" + legalAge - yearofBirth + "more years in order to start driving!"
     *  } 
     *}
     */
    }

