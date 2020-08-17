package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @java.lang.Override
            public void ramSize(int memorySize) {
                System.out.println("Physical ram on system: " + memorySize + " GB");
            }

            @java.lang.Override
            public void monitorSize(int screenSize) {
                System.out.println("System screen size: " + screenSize+ " in");
            }
        };

        laptop.ramSize(16);
        laptop.monitorSize(15);

        //please implement anonymous function for Phone FunctionalInterface
        Phone phone = str -> System.out.println("Sim network: "+ str);
        phone.cellularNetwork("T-Mobile");

    }
}
