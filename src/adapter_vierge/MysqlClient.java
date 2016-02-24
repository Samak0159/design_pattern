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
public class MysqlClient {

   public QueryResult query(String sql) {
       return new QueryResult();
   }

   private class QueryResult {
       public QueryResult() {

       }
   }
}