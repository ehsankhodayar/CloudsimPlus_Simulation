package Paper1.Vm;

import org.cloudbus.cloudsim.vms.Vm;

public class VmInstance6_X1_32xLarge extends VmInstanceAbstract {

    /**
     * This vm has 16 PEs.
     * @return Number of vm PEs.
     */
    @Override
    protected int getCpu() {
        return 18;
    }

    /**
     * This vm has 1952 GB RAM.
     * @return Memory capacity.
     */
    @Override
    protected double getMemory() {
        return convertGigaToMega(1952);
    }

    /**
     * This vm has 1000 GB RAM.
     * @return Storage capacity.
     */
    @Override
    protected double getStorage() {
        return convertGigaToMega(1000);
    }

    /**
     * This vm has 25 Gbps bandwidth
     * @return Bandwidth capacity.
     */
    @Override
    protected double getBw() {
        return convertGigaToMega(25);
    }

    @Override
    public Vm getVm() {
        return newVm();
    }
}
