/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_vierge;

/**
 *
 * @author sylvain
 */
public class Main {

    public static void main(String[] args) {
        // faire opération get/set/remove sur un client mysql
        RedisClient client = new RedisClient();
        // MysqlClient client = new MysqlClient();

        client.get("/"); // => null
        client.set("/", "<html></html>"); // true
        client.get("/"); // "<html></html>"
    }

}
