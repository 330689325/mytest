package com.itheima;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;

public class SolrjDemo02 {
    @Test
    public void addOrUpdateIndex() throws IOException, SolrServerException {
//    1.建立HttpSolrServer服务对象，连接solr服务
        HttpSolrServer solrServer = new HttpSolrServer("http://localhost:8082/solr");
        solrServer.deleteById("1689");
//    4.提交
        solrServer.commit();
    }
}
