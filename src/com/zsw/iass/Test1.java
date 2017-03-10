/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsw.iass;

import static com.hp.hpl.jena.assembler.Assembler.ontModel;
import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zsw
 */
public class Test1 {
    String OsType;
    String DiskType;
    String DiskCapacity;
    String CpuType;
    String CpuHz;
    String RamType;
    String RamCapacity;
    static String SOURCE = "http://www.semanticweb.org/zsw/ontologies/2017/1/untitled-ontology-4";
    static String NS = SOURCE + "#";
 
   
    
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        
      
        map.put("DiskType","samsung_pl400");
        map.put("DiskCapacity","300GB");
        map.put("RamType","DDR3");
        map.put("RamCapacity","3GB");
        map.put("CpuType","Athlon1700");
        map.put("CpuCapacity","3GHz");
        map.put("OsType","Ubuntu");
        map.put("OSVersion", "Unbuntu16.0");
        FrameTest ft=new FrameTest();
        System.err.println(map);
        System.err.println(map.get("DiskType"));
        
        
        //加载本体模型
     OntModel model= ModelFactory.createOntologyModel();
        try {
            model.read("file:G:/iaas_rdf_xml_syntax_provider.owl");
        } catch (Exception e) {
            System.err.println("找不到文件");
        }
        
        
        /*
        将服务请求加入到本体中，即将map中的信息添加到本体中
        */
        
       // 硬盘
        OntClass diskClass= model.getOntClass(NS+"DISK");                   //硬盘类型
        Individual d1=diskClass.createIndividual(NS+map.get("DiskType"));       //添加对应类型的个体
       
         Property dp1=model.getProperty(NS+"hasCapacity");          //添加数据属性
         RDFNode rdfnode =model.createLiteral(NS+"300GB");
         d1.setPropertyValue(dp1, rdfnode);
       //测试
        System.out.println("个体"+d1+"属于"+d1.getOntClass().getLocalName());
        System.err.println("有数据属性"+dp1);
        System.out.println("属性值为"+d1.getPropertyValue(dp1));
       
      
        
        //ram
        OntClass ramType=model.getOntClass(NS+"RAM");  //后面getontClass的值需要从用户出获取
        Individual ramIndividual=ramType.createIndividual(NS+"DDR3");  //ram类型
        Property ramCapProperty=model.getDatatypeProperty(NS+"hasRamCapacity");
        RDFNode rdfnoderam =model.createLiteral(NS+"3");
        ramIndividual.setPropertyValue(ramCapProperty, rdfnoderam); //ram大小
        
        //cpu
        OntClass cpuType=model.getOntClass(NS+"IntelCPU");
        Individual cpuIndividual=cpuType.createIndividual(NS+"Athlon1700");
        Property cpuProperty=model.getDatatypeProperty(NS+"hasCpuFre");
        RDFNode rdfnodeCpu=model.createLiteral(NS+"4");
        cpuIndividual.setPropertyValue(cpuProperty, rdfnodeCpu);
        
        //操作系统
        OntClass osType=model.getOntClass(NS+map.get("OsType"));
        Individual osIndividual=osType.createIndividual(NS+map.get("OSVersion"));
        
        
        System.out.println(osIndividual.getRDFType());
        System.out.println(osIndividual.getOntClass().getLocalName());
               

        
         for(Iterator ind=osType.listInstances();ind.hasNext();){
           System.out.print("Class"); 
            
            //获取类的URI并输出，在输出时对URI做了简化(将命名空间前缀省略) 
            System.out.println(osType.getModel().getGraph().getPrefixMapping().shortForm(osType.getURI())); 
                OntResource p=(OntResource) ind.next();
                System.out.println("  相关的个体: " + p.getLocalName()); 
            }   
         
         
          for(Iterator ipp = diskClass.listDeclaredProperties(); ipp.hasNext();){ 
                   OntProperty p = (OntProperty)ipp.next(); 
                   System.out.println("  相关属性是: " + p.getLocalName()); 
                   }// property ends 
            }
    
    
        }
    
  
