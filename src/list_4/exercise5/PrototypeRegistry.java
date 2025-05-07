package list_4.exercise5;

import list_4.exercise4.*;
import java.util.HashMap;
import java.util.Map;

class PrototypeRegistry {
    private Map<String, Shape> prototypes = new HashMap<>();

    public void add(String name, Shape shape) {
        prototypes.put(name, shape);
    }

    public Shape clone(String name) {
        Shape prototype = prototypes.get(name);
        return prototype != null ? prototype.clone() : null;
    }
}