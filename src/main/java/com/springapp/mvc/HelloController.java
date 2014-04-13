package com.springapp.mvc;

import com.springapp.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private Dao dao;

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @RequestMapping(value = "getCities.json", method = RequestMethod.GET)
    public String getCities(ModelMap model) {
        model.addAttribute(dao.getCities());
        return "jsonView";
    }

    @RequestMapping(value = "getCountries.json", method = RequestMethod.GET)
    public String getCountries(ModelMap model) {
        model.addAttribute(dao.getCountries());
        return "jsonView";
    }

    @RequestMapping(value = "getLanguages.json", method = RequestMethod.GET)
    public String getLanguages(ModelMap model) {
        model.addAttribute(dao.getLanguages());
        return "jsonView";
    }
}