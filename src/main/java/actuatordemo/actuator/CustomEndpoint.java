package actuatordemo.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id="endpoints")
public class CustomEndpoint {
    private Map<String , String > map=new HashMap<>();
    @ReadOperation
    public Map<String , String > getEndPoints() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("hello", "Hello");
        return map1;
    }
        @WriteOperation
                public void creatingEndpoint(@Selector String  name,String email){
                map.put("am","Iam");
        }
    }

