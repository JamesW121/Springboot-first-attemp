/**
 * 
 */
package com.first.attempt.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.first.attempt.domain.First;
import com.first.attempt.service.FirstService;



@Controller
public class FirstController {
	
	@Autowired
	FirstService firstService;
	

	 @RequestMapping(method = RequestMethod.GET)
	    public String getUserList(ModelMap map) {
	        map.addAttribute("firstList", firstService.findAll());
	        return "firstList";
	    }
	 
	    @RequestMapping(value = "/a", method = RequestMethod.GET)
	    public String createUserForm(ModelMap map) {
	        map.addAttribute("user", new First());
	        map.addAttribute("action", "a");
	        return "firstForm";
	    }

	    @RequestMapping(value = "/a", method = RequestMethod.POST)
	    public String postUser(ModelMap map,
	                           @ModelAttribute @Valid First user,
	                           BindingResult bindingResult) {

	        if (bindingResult.hasErrors()) {
	            map.addAttribute("action", "a");
	            return "firstForm";
	        }

	        firstService.insertByUser(user);

	        return "redirect:/";
	    }

	    @RequestMapping(value = "/aa/{id}", method = RequestMethod.GET)
	    public String getUser(@PathVariable Long id, ModelMap map) {
	        map.addAttribute("user", firstService.findById(id));
	        map.addAttribute("action", "bb");
	        return "firstForm";
	    }

	    @RequestMapping(value = "/bb", method = RequestMethod.POST)
	    public String putUser(ModelMap map,
	                          @ModelAttribute @Valid First user,
	                          BindingResult bindingResult) throws Exception{

	        if (bindingResult.hasErrors()) {
	            map.addAttribute("action", "bb");
	            return "firstForm";
	        }

	        firstService.update(user);
	        return "redirect:/";
	    }

	    @RequestMapping(value = "/aaa/{id}", method = RequestMethod.GET)
	    public String deleteUser(@PathVariable Long id) {

	        firstService.delete(id);
	        return "redirect:/";
	    }
	 
}
