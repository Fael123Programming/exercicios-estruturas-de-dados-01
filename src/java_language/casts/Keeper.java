package java_language.casts;

import java.util.*;

public class Keeper {
    private final List<Object> objects;

    public Keeper(){
        this.objects = new ArrayList<>();
    }

    public void add(Object obj) {
        this.objects.add(obj);
    }

    public Object get(int position) { return this.objects.get(position); }
}
