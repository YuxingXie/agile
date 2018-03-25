import java.util.Date;

public interface Employee {

    void pay();
    boolean isTimeToPay(Date payDate);

    Employee NULL=new Employee(){
            @Override
            public void pay() {
                System.out.println("null don't pay!");
            }

            @Override
            public boolean isTimeToPay(Date payDate) {
                return false;
            }
        };

}
