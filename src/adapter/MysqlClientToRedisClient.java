/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author sylvain
 */
public class MysqlClientToRedisClient implements Adapter {
    public RedisClient rc;
            
    public MysqlClientToRedisClient(RedisClient rc) {
        this.rc = rc;
    }

    
    @Override
    public Object get(String key) {
        return new Object();
    }

    @Override
    public boolean set(String key, String value) {
        return true;
    }

    @Override
    public boolean remove() {
        return true;
    }
    
}
