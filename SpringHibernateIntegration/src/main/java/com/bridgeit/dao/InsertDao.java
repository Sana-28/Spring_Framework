package com.bridgeit.dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.model.Candidate;

public class InsertDao {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		CandidateDao dao = (CandidateDao) factory.getBean("d");
		
		Candidate c=new Candidate();
		c.setId(1);
		c.setName("abc");
		c.setAddress("xyz");
	}
}
