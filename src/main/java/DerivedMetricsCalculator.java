import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by venkata.konala on 8/10/17.
 * This class takes the list of derived metrics(with metric properties) from the "derived" section
 * in config.yml and also baseMetricsMap(with metricNames and metricValues in BigDecimal).
 * The calculateDerivedMetrics() method will calculate the derived metrics values and
 * return a map (with derived metricNames and their metricvalues in BigDecimal).
 */
public class DerivedMetricsCalculator {
    List<Map<String, ?>> derivedMetricsList = Lists.newArrayList();
    Map<String, BigDecimal> baseMetricsMap = Maps.newHashMap();

    public void addToBaseMetricsMap(){

    }

    public Map<String, BigDecimal> calculateDerivedMetrics(){
        Map<String, BigDecimal> derivedMetricsMap = Maps.newHashMap();
        for(Map<String, ?> metricMapFromConfig: derivedMetricsList){

        }

        return derivedMetricsMap;
    }

}
