package hr.fer.oop.kolekcije.osmi;

import java.util.*;

public class Polynomial {
    private Map<Integer, Integer> data;

    public Polynomial(int... nums) {
        this.data = new TreeMap<>();
        for (int i = 1; i < nums.length; i += 2)
            if (!data.containsKey(nums[i]))
                data.put(nums[i], nums[i - 1]);
            else
                data.put(nums[i], nums[i - 1] + data.get(nums[i]));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        List<Integer> keys = new ArrayList<>();

        data.forEach((key, val) -> keys.add(key));

        for (int i = keys.size() - 1; i >= 0; i--) {
            int key = keys.get(i);
            int val = data.get(key);

            if (val == 0)
                continue;

            if (val > 0 && i != keys.size() - 1)
                sb.append("+");

            if (val != 1)
                sb.append(val);

            if (key > 1)
                sb.append(String.format("x^%d", key));
            else if (key == 1)
                sb.append("x");
        }

        return sb.toString();
    }

    public Polynomial plus(Polynomial b) {
        Map<Integer, Integer> cpy = new TreeMap<>();

        cpy.putAll(this.data);

        for (Map.Entry<Integer, Integer> d : b.data.entrySet())
            if (cpy.containsKey(d.getKey()))
                cpy.put(d.getKey(), cpy.get(d.getKey()) + d.getValue());
            else
                cpy.put(d.getKey(), d.getValue());

        int[] pol = new int[cpy.size() * 2];
        int size = 0;
        for (Map.Entry<Integer, Integer> d : cpy.entrySet()) {
            pol[size++] = d.getValue();
            pol[size++] = d.getKey();
        }

        return new Polynomial(pol);
    }
}
