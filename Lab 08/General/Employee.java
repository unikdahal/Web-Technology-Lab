//Define two packages as – General and Marketing. In General package define a
//class ,employee‟ with data members as empid(protected), ename(private) and a
//public method as earnings() which calculate total earnings as
//        earnings basic + DA (80% of basic) + HRA (15% of basic)
//        In Marketing package define a class ,sales‟ which is extending from ,employee‟
//class and has a method tallowance() which calculates Travelling Allowance as
//        5% of total earning. Write the programs to find out total earning of a sales person for the
//        given basic salary amount and print along with the emp id.

package General;
public class Employee{
    protected int empid;
    private String ename;
    public int earnings(int basic){
        int da = (int)(0.8*basic);
        int hra = (int)(0.15*basic);
        return basic+da+hra;
    }
}