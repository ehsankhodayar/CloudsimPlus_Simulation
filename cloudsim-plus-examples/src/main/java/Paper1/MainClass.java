package Paper1;

public class MainClass {

    //Simulator and Data Center Configuration
    private static final double SCHEDULING_INTERVAL = 300; //5 minutes
    private static final int SIMULATION_TIME = 864000; //10 days

    //Host Configurations
    private final int HOSTS=250;
    private final int HOST_BW=100*1024; //100Gbps
    private static final double UNDER_UTILIZATION_THRESHOLD =0.2;


    public static void main(String[] args){
        new MainClass();
    }

    public  MainClass(){

    }
}
