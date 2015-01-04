package org.longxin.web.controller;

import org.longxin.domains.Product;
import org.longxin.domains.Users;
import org.longxin.service.ProductService;
import org.longxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	UserService userService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listUsers(Model model)
	{
		model.addAttribute("users", userService.getAllUsers());
		return "/users/listusers";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String addUsers(Model model)
	{
		model.addAttribute(new Users());
		return "/users/adduser";
	}
}