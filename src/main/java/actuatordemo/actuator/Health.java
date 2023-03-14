package actuatordemo.actuator;

import org.springframework.boot.actuate.health.HealthIndicator;

public class Health implements HealthIndicator {


    @Override
    public org.springframework.boot.actuate.health.Health health() {
        if (isDataExists()){
            return org.springframework.boot.actuate.health.Health.up().withDetail("hello","Hello").build();
        }
        return org.springframework.boot.actuate.health.Health.down().withDetail("hello","Hello").build();
    }
    public boolean isDataExists(){
        return true;
    }
}
