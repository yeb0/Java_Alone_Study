package spring.ch06.adapterPattern;

public class AdapterServiceA {
    ServiceA sa1 = new ServiceA();
    void runService() {
        sa1.runServiceA();
    }
}
