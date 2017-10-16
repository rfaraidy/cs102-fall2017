
package topic02.inheritance.usinginheritance;


public class EmployeeTest {
    public static void main(String [] args){
        
        CommissionEmployee cm = 
                new CommissionEmployee
                        ("Mohamed", "Ali", "333-33-3333",
                                5000, 0.21);
        
        BasePlusCommissionEmployee bpcm = 
                new BasePlusCommissionEmployee
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.21, 300);
        
        //System.out.println(cm+"\n");
        //System.out.println(bpcm);
        
        System.out.println("\ncm earning: "+cm.earning());
        System.out.println("\bpcm earning: "+bpcm.earning());
        
        //System.out.println("gross sales: "+ cm.grossSales);
        
        
    }
    
}
