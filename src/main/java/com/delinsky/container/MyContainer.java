package com.delinsky.container;

import com.delinsky.IoC.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class MyContainer {

    public Map<String, Object> container = new HashMap();

    public MyContainer() {

        container.put("put", new Put());
        container.put("delete", new Delete());
        container.put("get", new Get());
        container.put("post", new Post());
        container.put("service", new HttpRequestService());

    }
}
