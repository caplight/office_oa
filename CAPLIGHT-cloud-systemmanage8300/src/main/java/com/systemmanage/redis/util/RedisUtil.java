package com.systemmanage.redis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author CAPLIGHT
 * @create 2020-06-16 9:51 PM
 */
public class RedisUtil {
    private static JedisPool pool = null;

    /**
     * 获取jedis连接池
     */
    public static JedisPool getPool(){
        if(pool == null){
            //创建jedis连接池配置
            JedisPoolConfig config = new JedisPoolConfig();
            //最大连接数
            config.setMaxTotal(100);
            //最大空闲连接-
            config.setMaxIdle(5);
            //创建redis连接池
            pool = new JedisPool(config, "101.201.66.127",
                    6379, 5000, "123");
        }
        return pool;
    }
    /**
     * 获取给定 key 的值
     * @param key
     * @return
     */
    public static String get(String key){
        Jedis jedis = getPool().getResource();
        String result = jedis.get(key);
        jedis.close();
        return result;
    }

    /**
     * 设置给定 key 的值
     * @param key
     * @param value
     * @return
     */
    public static String set(String key,String value){
        Jedis jedis = getPool().getResource();
        String result = jedis.set(key,value);
        jedis.close();
        return result;
    }
}
