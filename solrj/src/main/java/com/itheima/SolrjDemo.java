package com.itheima;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;

public class SolrjDemo {
    @Test
    public void addOrUpdateIndex() throws IOException, SolrServerException {
//    1.建立HttpSolrServer服务对象，连接solr服务
        HttpSolrServer solrServer = new HttpSolrServer("http://localhost:8082/solr");
//    2.建立文档对象（SolrInputDocument）
        SolrInputDocument document = new SolrInputDocument();
        document.addField("id",1689);
        document.addField("name","you never know until you try!");
        document.addField("contect","a.jpg");
//    3.执行添加
        solrServer.add(document);
//    4.提交
        solrServer.commit();
    }
}
