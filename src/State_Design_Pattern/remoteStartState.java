package State_Design_Pattern;

import javax.swing.*;


public class remoteStartState implements state {

    @Override
    public void doAction() {
        System.out.println("TV ON");
    }
}
