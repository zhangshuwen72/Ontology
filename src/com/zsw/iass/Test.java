/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsw.iass;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;  
import com.hp.hpl.jena.ontology.*; 
import java.util.List;

/**
 *
 * @author zsw
 */
public class Test {
    public static final int MINCORE=1;
    public static final int MAXCORE=4;
    public static final int MINDISK=100;
    public static final int MAXDISK=1000;
    public static final int MINRAM=1;
    public static final int MAXRAM=4;
    static String SOURCE = "http://www.semanticweb.org/zsw/ontologies/2017/1/untitled-ontology-4";
   static String NS = SOURCE + "#";

    
    public static void main(String[] args) {
       
    //加载服务请求模型，输入文件填充模型    
        OntModel requestModel=ModelFactory.createOntologyModel();
            try{
                requestModel.read("file:G:/iaas_rdf_xml_syntax_request.owl");
            }catch(Exception e){
                 System.out.println("file not found");
            }

    
    //加载服务提供模型
      OntModel providerModel=ModelFactory.createOntologyModel();
         try{
             providerModel.read("file:G:/iaas_rdf_xml_syntax_provider.owl");
            }catch(Exception e){
                System.out.println("file not found");
            }
  
    
    //获取属性值 
    //请求服务的硬盘容量数据获取
        OntProperty requesthasDiskOntProperty=requestModel.getDatatypeProperty(NS+"hasDiskCapacity");
        Individual requestDiskIndividual=requestModel.getIndividual(NS+"disk1");
        DataPropertyDeal DataPropertyDeal=new DataPropertyDeal();
        float a=DataPropertyDeal.DataDeal(requestModel, requestDiskIndividual, requesthasDiskOntProperty);
        System.out.println("请求服务的硬盘容量为："+a);
   
   //服务提供者的硬盘容量获取
        OntProperty providerhasDiskoOntProperty=providerModel.getDatatypeProperty(NS+"hasDiskCapacity");
        Individual providerdiskIndividual=providerModel.getIndividual(NS+"providerdisk");
        float b= DataPropertyDeal.DataDeal(providerModel, providerdiskIndividual, providerhasDiskoOntProperty);
        System.out.println("提供的服务硬盘容量为:"+b);  
   
        SimCal cal=new SimCal();
        System.err.println("硬盘容量相似性为"+cal.DataSimCal(a,b));
     
    
        OntClass requestDiskClass=requestDiskIndividual.getOntClass();
        OntClass providerDiskClass=providerdiskIndividual.getOntClass();

          ClassRationDeal crd=new ClassRationDeal();
          int i=crd.getIndividualSuperClassSize(requestModel, requestDiskIndividual);
        System.out.println("实例"+requestDiskIndividual.getLocalName()+"共有"+i+"个父类，"+"分别为"+crd.getIndividualSuperClass(requestModel, requestDiskIndividual));
        int j=crd.getIndividualSuperClassSize(providerModel, providerdiskIndividual);
        System.out.println("实例"+providerdiskIndividual.getLocalName()+"共有"+j+"个父类，"+"分别为"+crd.getIndividualSuperClass(providerModel, providerdiskIndividual));


        List requestList=crd.getIndividualSuperClass(requestModel, requestDiskIndividual);
        List providerList=crd.getIndividualSuperClass(providerModel, providerdiskIndividual);

       //比较两个实例的共有父类集合的个数,即比较list1、list2的共有元素
       int originallist1Size=requestList.size(); //list进行retainAll方法后自身会改变，要先记录下未改变之前的list1的大小     
       requestList.retainAll(providerList);
       int unionClass=requestList.size();  
        System.err.println("硬盘容量相似性为"+cal.ConceptSimCal((float) 0.5, originallist1Size, providerList.size(), unionClass));
      

    }
    

    
}

