import java.util.Date;

public class DB {
    public static Employee getEmployee(String name){
        double math=Math.random();

        return math>0.5d?Employee.NULL:new Employee() {
            @Override
            public void pay() {
                System.out.println("pay the employee!");
            }

            @Override
            public boolean isTimeToPay(Date payDate) {
                return true;
            }
        };
    }
}
