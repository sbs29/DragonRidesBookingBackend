package com.drakkar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.drakkar.util.Wipeable;

@Controller
@RequestMapping("/cache")
public class CacheController {

	@Autowired
	private List<Wipeable> wipeables;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "clear")
	public String clear() {
		wipeables.forEach(Wipeable::wipeOut);
		return "ok";
	}

}
