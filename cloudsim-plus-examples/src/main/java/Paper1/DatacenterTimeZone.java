package Paper1;

import khosravi2017.ReduceEnergyAndCarbonCostThrowDynamicVmPlacement;

import java.util.Map;
import java.util.TreeMap;

public class DatacenterTimeZone {
    // set data centers' time zones
    private static final Map<DatacenterName.dcName, Double> DATACENTERS_TIMEZONES = new TreeMap<DatacenterName.dcName, Double>() {
        {
            put(DatacenterName.dcName.Columbus, -5.0);
            put(DatacenterName.dcName.Richmond, -5.0);
            put(DatacenterName.dcName.SanJose, -8.0);
            put(DatacenterName.dcName.Portland, -8.0);
        }
    };

    public static double getDatacenterTimeZone(final DatacenterName.dcName dcName){
        return DATACENTERS_TIMEZONES.get(dcName);
    }
}
