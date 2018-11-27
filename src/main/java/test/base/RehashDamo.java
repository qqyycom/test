package test.base;

import java.lang.reflect.Field;
import java.util.HashMap;

public class RehashDamo {
    public static void main(String[] args) {

        // rehash 算法
        int h = Integer.parseInt("01111111", 2) & 15;
        h += (h <<  15) ^ 0xffffcd7d;
        h ^= (h >>> 10);
        h += (h <<   3);
        h ^= (h >>>  6);
        h += (h <<   2) + (h << 14);
        System.out.println(h);

        //
        HashMap<String,Object> map =  new HashMap<>(31);
        map.put("1","2");
        try {
            Class clazz = Class.forName("java.util.HashMap$Entry");

            Field field = map.getClass().getDeclaredField("table");
            field.setAccessible(true);
            Object[] table = (Object[])field.get(map);
            System.out.println(table.length);
        } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
