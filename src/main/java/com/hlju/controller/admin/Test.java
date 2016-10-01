package com.hlju.controller.admin;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by JianFeng on 2016/9/28.
 */
public class Test {

    public static void main(String[] args){
        Jedis jedis = new Jedis("127.0.0.1",6379);
    }

    public void t5(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //jedis 排序
        //注意，此处的rpush和lpush是List的操作。是一个双向链表（但从表现来看的）
        jedis.del("a");//先清除数据，再加入数据进行测试
        jedis.rpush("a", "1");
        jedis.lpush("a","6");
        jedis.lpush("a","7");
        jedis.lpush("a","4");
        jedis.lpush("a","9");
        System.out.println(jedis.lrange("a",0,-1));// [9, 3, 6, 1]
        System.out.println(jedis.sort("a")); //[1, 3, 6, 9]  //输入排序后结果
        System.out.println(jedis.lrange("a",0,-1));
    }

    public void t4(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.sadd("user","zhongjianfeng");
        jedis.sadd("user","zhong");
        jedis.sadd("user","jian");
        jedis.sadd("user","feng");
        jedis.sadd("user","who");
        jedis.srem("user","who");
        System.out.println(jedis.smembers("user"));//获取所有加入的value
        System.out.println(jedis.sismember("user", "who"));//判断 who 是否是user集合的元素
        System.out.println(jedis.srandmember("user"));
        System.out.println(jedis.scard("user"));//返回集合的元素个数
    }

    public void t3(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("java framework","zhongjianfeng");
        jedis.del("java framework");
        //删除一个
        System.out.println(jedis.lrange("java framework",0,-1));
        jedis.lpush("java framework","spring");
        jedis.lpush("java framework","mybatis");
        jedis.lpush("java framework","struct");

        //再取出所有数据jedis.lrange是按范围取出，
        // 第一个是key，第二个是起始位置，第三个是结束位置，jedis.llen获取长度 -1表示取得所有
        System.out.println(jedis.lrange("java framework",1,-1));
    }

    public void t2(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        Map<String , String> map = new HashMap<String, String>();
        map.put("name","zhongjianfeng");
        map.put("age","20");
        map.put("qq","873027371");
        //构造一个HashMap
        jedis.hmset("2014",map);
        //给HashMap一个标识
        List<String> persons = jedis.hmget("2014","name","age","qq");
        //jedis.hmget  返回的是一个泛型的list
        System.out.println(persons.toString());


        //删除map中的某个键值
        jedis.hdel("2014","qq");
        System.out.println(jedis.hmget("2014", "qq")); //因为删除了，所以返回的是null
        System.out.println(jedis.hlen("2014")); //返回key为user的键中存放的值的个数2
        System.out.println(jedis.exists("2014"));//是否存在key为user的记录 返回true
        System.out.println(jedis.hkeys("2014"));//返回map对象中的所有key
        System.out.println(jedis.hvals("2014"));//返回map对象中的所有value

        Iterator<String> iter=jedis.hkeys("2014").iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println(key+":"+jedis.hmget("2014",key));
        }
    }

    public void t1(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("name","jianfeng");
        //设置键值对 key value
        System.out.println(jedis.get("name"));

        jedis.append("name"," zhong");
        //键值对的拼接
        System.out.println(jedis.get("name"));

        jedis.del("name");
        //删除键值对
        System.out.println(jedis.get("name"));

        jedis.mset("name","zhongjianfeng","age","20","qq","873027371");
        //设置多个键值对
        jedis.incr("age");
        //进行加1操作
    }

}
