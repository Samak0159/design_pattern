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
public interface Adapter {
    public Object get(String key);
    public boolean set(String key, String value);
    public boolean remove();
}
