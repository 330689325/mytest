package com.itheima;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.junit.Test;

import java.io.IOException;

public class SolrjDemo03 {
    @Test
    public void addOrUpdateIndex() throws IOException, SolrServerException {
//    1.建立HttpSolrServer服务对象，连接solr服务
        HttpSolrServer solrServer = new HttpSolrServer("http://localhost:8082/solr");
        solrServer.deleteByQuery("name:never");
//    4.提交
        solrServer.commit();
    }
}
