package State_Design_Pattern;

public class RemoteControl {
    public static void main(String[] args) {

        TvContext tvContext = new TvContext();
        remoteStartState startState = new remoteStartState();
        remoteStopState stopState = new remoteStopState();

        tvContext.setContext_state(startState);
        tvContext.doAction();

        tvContext.setContext_state(stopState);
        tvContext.doAction();

    }



}
