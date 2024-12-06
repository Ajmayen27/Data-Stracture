package State_Design_Pattern;

public class TvContext implements state{

    private state context_state;

    public state getContext_state() {
        return context_state;
    }

    public void setContext_state(state context_state) {
        this.context_state = context_state;
    }


    @Override
    public void doAction() {
        this.context_state.doAction();
    }
}
