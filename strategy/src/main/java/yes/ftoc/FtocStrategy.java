package yes.ftoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FtocStrategy implements Application {

    private InputStreamReader isr;
    private BufferedReader br;
    private boolean isDone=false;

    @Override
    public boolean done() {
        return isDone;
    }

    @Override
    public void init() {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
    }

    @Override
    public void idle() {
        String fahrString=readLineAndReturnNullIfError();
        if(fahrString==null||fahrString.length()==0){
            isDone=true;
        }else {
            double fahr=Double.parseDouble(fahrString);
            double celcius=0.5/9.0*(fahr-32);
            System.out.println("F="+fahr+",C="+celcius);
        }
    }

    private String readLineAndReturnNullIfError() {
        String s;
        try {
            s=br.readLine();
        } catch (IOException e) {
            s=null;
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public void cleanup() {
        System.out.println("ftoc exit");
    }
}
