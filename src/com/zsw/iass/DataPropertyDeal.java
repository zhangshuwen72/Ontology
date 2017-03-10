/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsw.iass;

import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntProperty;
import static com.zsw.iass.Test.NS;

/**
 *
 * @author zsw
 * 数据属性的相关处理,
 * 本体中数据属性为URI的格式，若要取得具体数值，需要进行提取处理
 */
public class DataPropertyDeal {
    
    
    public float DataDeal( OntModel model,Individual individual,OntProperty datatypeProperty){
//         OntProperty bbOntProperty=model.getDatatypeProperty(NS+datatypeProperty);
//    Individual bbindividual=model.getIndividual(NS+individual);
   String requestDiskcapacility=individual.getPropertyValue(datatypeProperty).toString();//getPropertyvalue得到的是RDFNode格式，先转为字符串，在转为整形数据
   float a= Float.parseFloat(requestDiskcapacility.substring(0,requestDiskcapacility.indexOf("^")));//得到数据属性的值
   return a;
    }
    
    
}
