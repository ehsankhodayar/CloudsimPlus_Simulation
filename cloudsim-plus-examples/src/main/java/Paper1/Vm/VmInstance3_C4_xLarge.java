package Paper1.Vm;

import org.cloudbus.cloudsim.vms.Vm;

public class VmInstance3_C4_xLarge extends VmInstanceAbstract {

    /**
     * This vm has 4 PEs.
     * @return Number of vm PEs.
     */
    @Override
    protected int getCpu() {
        return 4;
    }

    /**
     * This vm has 7.5 GB RAM.
     * @return Memory capacity.
     */
    @Override
    protected double getMemory() {
        return convertGigaToMega(7.5);
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
     * This vm has 10 Gbps bandwidth
     * @return Bandwidth capacity.
     */
    @Override
    protected double getBw() {
        return convertGigaToMega(10);
    }

    @Override
    public Vm getVm() {
        return newVm();
    }
}
