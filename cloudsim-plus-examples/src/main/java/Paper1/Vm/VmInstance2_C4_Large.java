package Paper1.Vm;

import org.cloudbus.cloudsim.vms.Vm;

public class VmInstance2_C4_Large extends VmInstanceAbstract {

    /**
     * This vm has 2 PEs.
     * @return Number of vm PEs.
     */
    @Override
    protected int getCpu() {
        return 2;
    }

    /**
     * This vm has 3.75 GB RAM.
     * @return Memory capacity.
     */
    @Override
    protected double getMemory() {
        return convertGigaToMega(3.75);
    }

    /**
     * This vm has 700 GB RAM.
     * @return Storage capacity.
     */
    @Override
    protected double getStorage() {
        return convertGigaToMega(700);
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
