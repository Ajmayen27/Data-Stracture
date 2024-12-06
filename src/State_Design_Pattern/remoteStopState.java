package State_Design_Pattern;

public class remoteStopState implements state{
    @Override
    public void doAction() {
        System.out.println("TV OFF");
    }
}
