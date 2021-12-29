package IOT;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IOT_devices {

    private static ObjectMapper objectmapper = new ObjectMapper();

    private static ObjectMapper getDefaultObjectMapper()
    {
        ObjectMapper defaultObjectMapper = new ObjectMapper();
    }
}
