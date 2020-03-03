package Paper1.Vm;

import org.cloudbus.cloudsim.vms.Vm;

public class VmInstance4_C4_2xLarge extends VmInstanceAbstract {

    /**
     * This vm has 8 PEs.
     * @return Number of vm PEs.
     */
    @Override
    protected int getCpu() {
        return 8;
    }

    /**
     * This vm has 15 GB RAM.
     * @return Memory capacity.
     */
    @Override
    protected double getMemory() {
        return convertGigaToMega(15);
    }

    /**
     * This vm has 750 GB RAM.
     * @return Storage capacity.
     */
    @Override
    protected double getStorage() {
        return convertGigaToMega(750);
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
