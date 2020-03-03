package Paper1.Vm;

import org.cloudbus.cloudsim.vms.Vm;

public class VmInstance5_C4_4xLarge extends VmInstanceAbstract {

    /**
     * This vm has 16 PEs.
     * @return Number of vm PEs.
     */
    @Override
    protected int getCpu() {
        return 16;
    }

    /**
     * This vm has 30 GB RAM.
     * @return Memory capacity.
     */
    @Override
    protected double getMemory() {
        return convertGigaToMega(30);
    }

    /**
     * This vm has 850 GB RAM.
     * @return Storage capacity.
     */
    @Override
    protected double getStorage() {
        return convertGigaToMega(850);
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
