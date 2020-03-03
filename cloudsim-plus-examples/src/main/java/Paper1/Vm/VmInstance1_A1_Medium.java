package Paper1.Vm;

import org.cloudbus.cloudsim.vms.Vm;
import org.cloudbus.cloudsim.vms.VmSimple;

public class VmInstance1_A1_Medium extends VmInstanceAbstract {

    /**
     * This vm has 1 PEs.
     * @return Number of vm PEs.
     */
    @Override
    protected int getCpu() {
        return 1;
    }

    /**
     * This vm has 2 GB RAM.
     * @return Memory capacity.
     */
    @Override
    protected double getMemory() {
        return convertGigaToMega(2);
    }

    /**
     * This vm has 500 GB RAM.
     * @return Storage capacity.
     */
    @Override
    protected double getStorage() {
        return convertGigaToMega(500);
    }

    /**
     * This vm has 5 Gbps bandwidth
     * @return Bandwidth capacity.
     */
    @Override
    protected double getBw() {
        return convertGigaToMega(5);
    }

    @Override
    public Vm getVm() {
        return newVm();
    }
}
