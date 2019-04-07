package adapter;

import java.math.BigDecimal;

public class InterfaceAdapter2 implements Interface1 {

    private Interface2 i2;

    public InterfaceAdapter2(){i2 = new Interface2();}

    public void exec(String num) {
        i2.exec(new BigDecimal(num));
    }
}
