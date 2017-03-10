/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsw.iass;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author zsw
 * 
 * 类之间关系的统计，例如统计某个个体的父类个数
 */
public class ClassRationDeal {
    
    
    /*获取个体的父类个数，
        1.首先获取个体的直接父类
        2.再获取个体父类的父类
    */
    public int getIndividualSuperClassSize(OntModel model,Individual individual){
        List<String> list =new ArrayList();
        String directSuperString=individual.getOntClass().toString();
        list.add(directSuperString);
        OntClass directSperClass=individual.getOntClass();
        for (Iterator rt = directSperClass.listSuperClasses(); rt.hasNext();) {
            String str=rt.next().toString();
               list.add(str);
             }
        return list.size();
    }
    
    
     //获取个体的父类集合，本体中类的格式是URI，需要对其格式进行字符串处理
     public List<String> getIndividualSuperClass(OntModel model,Individual individual){
        List<String> list =new ArrayList();
        String directSuperString=individual.getOntClass().getLocalName();
        list.add(directSuperString);
        OntClass directSperClass=individual.getOntClass();
        for (Iterator rt = directSperClass.listSuperClasses(); rt.hasNext();) {
            String str=rt.next().toString();
            String str1=str.substring(str.indexOf("#")+1,str.length());
            list.add(str1);
             }
        return list;
    }
    
    
}
