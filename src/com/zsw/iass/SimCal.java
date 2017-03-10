/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsw.iass;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;


/**
 *
 * @author zsw
 */

/*
    相似性方法封装
*/

public class SimCal {
    
    public static final int MINCORE=1;
    public static final int MAXCORE=4;
    public static final int MINDISK=100;
    public static final int MAXDISK=1000;
    public static final int MINRAM=1;
    public static final int MAXRAM=4;
    static String SOURCE = "http://www.semanticweb.org/zsw/ontologies/2017/1/untitled-ontology-4";
   static String NS = SOURCE + "#";
   public static float sim;
   public float dataSim;
   public float concetpSim;
   
    
   
    //数据类型相似性计算
    public float DataSimCal(float a,float b){
        dataSim=(b-a)/(MAXDISK-MINDISK);
          
      return dataSim;
    }
    
    //概念相似性计算
    public float ConceptSimCal(float p,float a,float b,float c){
          float conceptSim = p*c/a+(1-p)*c/b;
         
          return conceptSim;
    }
    
//    
//    public float ObjectAttrSimCal(){
//        
//    }
    
    
    
}
