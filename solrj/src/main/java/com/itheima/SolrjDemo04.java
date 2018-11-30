package com.itheima;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

import java.io.IOException;

public class SolrjDemo04 {
    @Test
    public void addOrUpdateIndex() throws IOException, SolrServerException {
//    1.建立HttpSolrServer服务对象，连接solr服务
        HttpSolrServer solrServer = new HttpSolrServer("http://localhost:8082/solr");
        SolrQuery solrQuery = new SolrQuery("*:*");
        QueryResponse queryResponse = solrServer.query(solrQuery);
        SolrDocumentList results = queryResponse.getResults();
        System.out.println(results.getNumFound());
        results.forEach(solrDocument->{
            System.out.println("----=-------------");
            System.out.println("id域"+solrDocument.get("id"));
            System.out.println("name域"+solrDocument.get("name"));
        });
//    4.提交
        solrServer.commit();
    }
}
