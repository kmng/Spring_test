package com.stefantopia.testapp3.test;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import com.stefantopia.testapp3.services.SimpleProductManager;

import com.stefantopia.testapp3.controllers.InventoryController;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{		
        InventoryController controller = new InventoryController();
		controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);	
		assertEquals("hello", modelAndView.getViewName());	
        assertNotNull(modelAndView.getModel());
		Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");        
		assertNotNull(nowValue);
    }
}