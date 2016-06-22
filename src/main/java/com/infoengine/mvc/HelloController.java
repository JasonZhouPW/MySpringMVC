package com.infoengine.mvc;

import com.infoengine.service.interfaces.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private TestService testService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		String msg = testService.getInfo(1l);
		model.addAttribute("message", msg);
		return "hello";
	}

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}
}