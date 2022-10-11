package com.sseda.mapper;


import static org.junit.Assert.*;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
									"file:src/main/webapp/WEB-INF/spring/appServlet/admin-context.xml"})
public class BoardMapperTest {

   private static final Logger log = LoggerFactory.getLogger("BoardMapperTest.class");
   
   @Autowired
   private BoardMapper bm;
   
   @Test 
   public void test() {
      
      log.info("보드 삭제 = {}" , bm.delete("24"));
      
   }
   
   
   
   
}