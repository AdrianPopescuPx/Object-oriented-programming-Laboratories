package lab11.task1;

import java.util.*;

public class MultiMapValue<K, V> {
    private ArrayList<LabHashMap<K, V>> list = new ArrayList<>();

    public void setList(ArrayList<LabHashMap<K, V>> list) {
        this.list = list;
    }

    public ArrayList<LabHashMap<K, V>> getList() {
        return list;
    }
    public void add(K key, V value) {
        LabHashMap current = getKey(key);
        if(current != null) {
            current.addValue(value);
        }
        else {
            current = new LabHashMap();
            current.setKey(key);
            current.addValue(value);
        }
        list.add(current);
    }

    public void addAll(K key, ArrayList<V> values) {
        LabHashMap current = getKey(key);
        if(current == null) {
            current = new LabHashMap();
            current.setKey(key);
            current.setValues(values);
            list.add(current);
        }   else {
                current.getValues().addAll(values);
                list.add(current);
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        for (LabHashMap<K, V> item : map.getList()) {
            if(this.containsKey(item.getKey())) {
                addAll(item.getKey(), item.getValues());
            } else {
                add(item.getKey(), (V) item.getValues());
            }
        }
    }

    public LabHashMap getKey(K key) {
        for(LabHashMap c : list) {
            if(c.getKey().equals(key)) {
                return c;
            }
        }
        return null;
    }
    public V getFirst(K key) {
        LabHashMap<K, V> current = getKey(key);
        if(current.getValues().size() > 0) {
            return current.getValues().get(0);
        }
        return null;
    }

    public ArrayList<V> getValues(K key) {
        LabHashMap<K, V> current = getKey(key);
        return current.getValues();
    }

    public boolean containsKey(K key) {
        LabHashMap<K, V> current = getKey(key);
        if(current != null) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<V> remove(K key) {
        LabHashMap<K, V> current = getKey(key);
        list.remove(current);
        return current.getValues();
    }

    public int size() {
        return list.size();
    }
}
