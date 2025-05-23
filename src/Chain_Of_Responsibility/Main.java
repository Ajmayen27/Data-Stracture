package Chain_Of_Responsibility;

public class Main {

    public static void main(String[] args) {
        RequestHandler manager=new Manager();
        RequestHandler seniorManager=new SeniorManager();
        RequestHandler director=new Director();
        manager.setNext(seniorManager);
        seniorManager.setNext(director);
        manager.approve(78);
        manager.approve(90);
    }
}
