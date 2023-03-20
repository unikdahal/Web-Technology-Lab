//Define two packages as – General and Marketing. In General package define a
//class ,employee‟ with data members as empid(protected), ename(private) and a
//public method as earnings() which calculate total earnings as
//        earnings basic + DA (80% of basic) + HRA (15% of basic)
//        In Marketing package define a class ,sales‟ which is extending from ,employee‟
//class and has a method tallowance() which calculates Travelling Allowance as
//        5% of total earning. Write the programs to find out total earning of a sales person for the
//        given basic salary amount and print along with the emp id.

package Marketing;
import General.*;

class Sales extends Employee{
    public int tallowance(int basic){
        int total_earnings = earnings(basic);
        return (int)(0.05*total_earnings);
    }

    public static void main(String[] args) {
        Sales s = new Sales();
        s.empid = 1;
        int basic = 10000;
        int total_earnings = s.earnings(basic);
        int tallowance = s.tallowance(basic);
        System.out.println("Employee ID: " + s.empid);
        System.out.println("Total Earnings: " + total_earnings);
        System.out.println("Travelling Allowance: " + tallowance);
    }
}

