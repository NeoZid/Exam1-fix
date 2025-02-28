
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SalaryNetCalculator
{
    
    
    /*
     * public int netpayCalc(){
        int workedHours;
        int hourlyWage;
        double taxes;
        // netpay = (workHours.hourlyWage).taxes;
        // System.out.println("Your netpay is:" + netpay);

     */
    
    public void netPayCalc(int workedHours, double hourlyWage){
        double taxes = 0.3;
        double netPay;
        double totalPay = workedHours*hourlyWage;
        netPay = totalPay-(totalPay*taxes);
            System.out.println("Your netpay is:" + netPay);    
    }
    }
    
   
        

