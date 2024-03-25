package classes.java8;

public class FunctionalInterfaceExample implements CustomFunctionalInterface{
    public static void main(String[] args) {
//        new FunctionalInterfaceExample().callRunnableInterface();
//        System.out.println(new FunctionalInterfaceExample().doCustomImplementation("This is my custom functional interface"));
        new FunctionalInterfaceExample().callCustomFunctionalInterface();
    }

    public void callCustomFunctionalInterface() {
        CustomFunctionalInterface customFunctionalInterface = (input) -> "Give me some input so that i can run";
        System.out.println(customFunctionalInterface.doCustomImplementation("Hey Start Run"));
    }

    public void callRunnableInterface() {
        Runnable run = () -> System.out.println("Runnable Interface used for creating the Thread");
        new Thread(run).start();
    }

    @Override
    public String doCustomImplementation(String input) {
        return "Given Input is :"+input;
    }
}
