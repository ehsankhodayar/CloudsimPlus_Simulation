package Paper1.Vm;

import org.cloudbus.cloudsim.schedulers.cloudlet.CloudletScheduler;
import org.cloudbus.cloudsim.schedulers.cloudlet.CloudletSchedulerSpaceShared;
import org.cloudbus.cloudsim.vms.Vm;
import org.cloudbus.cloudsim.vms.VmSimple;

/**
 * Each data center contains the following
 * vm instances (according to
 * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">amazon web service instance types</a>):
 *
 * a1_medium: 1 -> cpu | 500 GB -> Storage | 2 GB -> Memory | 5 Gbps -> Bandwidth
 * c4_large: 2 -> cpu | 700 GB -> Storage | 3.75 GB -> Memory | 10 Gbps -> Bandwidth
 * c4_xlarge: 4 -> cpu | 750 GB -> Storage | 7.5 GB -> Memory | 10 Gbps -> Bandwidth
 * c4_2xlarge: 8 -> cpu | 750 GB -> Storage | 15 GB -> Memory | 25 Gbps -> Bandwidth
 * c4_4xlarge: 16 -> cpu | 850 GB -> Storage | 30 GB -> Memory | 25 Gbps -> Bandwidth
 * x1_32xlarge: 128 -> cpu | 1000 GB -> Storage | 1952 GB -> Memory | 25 Gbps -> Bandwidth
 */
public abstract class VmInstanceAbstract {
    private static int vmId = 0;
    protected static final int MIPS = 2500;
    protected static final CloudletScheduler CLOUDLET_SCHEDULER = new CloudletSchedulerSpaceShared();

    public int getId(){
        return ++vmId;
    }
    protected double convertGigaToMega(double G){
        return G*1024;
    }
    protected Vm newVm(){
        return new VmSimple(MIPS, getCpu(), CLOUDLET_SCHEDULER)
            .setRam((long) getMemory())
            .setSize((long) getStorage())
            .setBw((long) getBw());
    }

    protected abstract int getCpu();
    protected abstract double getMemory();
    protected abstract double getStorage();
    protected abstract double getBw();
    public abstract Vm getVm();
}
