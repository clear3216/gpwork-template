package adapter;

import java.math.BigDecimal;

public class InterfaceAdapter extends Interface2 implements Interface1 {

    public void exec(String num) {
        exec(new BigDecimal(num));
    }
}
