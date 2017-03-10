/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsw.iass;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;  
import java.util.Iterator;
import com.hp.hpl.jena.ontology.*; 
import com.hp.hpl.jena.rdf.model.RDFNode;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author zsw
 */
public class RequestDeal {
   static String SOURCE = "http://www.semanticweb.org/zsw/ontologies/2017/1/untitled-ontology-4";
   static String NS = SOURCE + "#";
    
    public static void main(String args[]) throws IOException{
        
         OntModel requestModel=ModelFactory.createOntologyModel(); //创建本体模型,该模型为一个默认设置的本体模型。（OWL-full,内存存储，RDFS推理）
        try {
            requestModel.read("file:G:/iaas_rdf_xml_syntax_provider.owl");    //，添加本体文件  填充模型
        } catch (Exception e) {
            System.out.println("file not found");
        }
                       

    //为制定类添加个体
     OntClass celeronClass=requestModel.getOntClass(NS+"Ubuntu");
     Individual aaIndividual=requestModel.createIndividual(NS+"draram1234567890",celeronClass);
 
 //输出个体的数据属性
  OntProperty bbOntProperty=requestModel.getDatatypeProperty(NS+"hasDiskCapacity");
  Individual disk1inIndividual=requestModel.getIndividual(NS+"disk1");
  OntProperty aaOntProperty=requestModel.getObjectProperty(NS+"hasOS");
  System.err.println("个体disk1的对象属性值为"+disk1inIndividual.getPropertyValue(aaOntProperty));
  
        RDFNode valueDFNode=requestModel.createLiteral(NS+5000020);
  disk1inIndividual.setPropertyValue(bbOntProperty, valueDFNode);
  String bString=disk1inIndividual.getPropertyValue(bbOntProperty).toString();
  System.out.println(bString.substring(bString.indexOf("#")+1,bString.length()));
  
  

 
// OntClass c = m.createClass( NS + "SomeClass" );
//Individual ind0 = m.createIndividual( NS + "ind0", c );

  
//   for (Iterator i=requestModel.listClasses(); i.hasNext();){ 
//        OntClass c=(OntClass)i.next(); //返回类型强制转换 
//        if(!c.isAnon()){//如果不是匿名类，则打印类的名字 
            //System.out.print("Class"); 
            
            //获取类的URI并输出，在输出时对URI做了简化(将命名空间前缀省略) 
          //  System.out.println(c.getModel().getGraph().getPrefixMapping().shortForm(c.getURI())); 
       for(Iterator ind=celeronClass.listInstances();ind.hasNext();){
           System.out.print("Class"); 
            
            //获取类的URI并输出，在输出时对URI做了简化(将命名空间前缀省略) 
            System.out.println(celeronClass.getModel().getGraph().getPrefixMapping().shortForm(celeronClass.getURI())); 
                OntResource p=(OntResource) ind.next();
                System.out.println("  相关的个体: " + p.getLocalName()); 
            }   
        }
    
    
    
   }  

   
  
 
