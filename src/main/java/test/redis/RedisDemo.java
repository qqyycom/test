package test.redis;

import redis.clients.jedis.Jedis;

public class RedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("key","value");
        String v = jedis.get("key");
        System.out.println(v);
    }
}
