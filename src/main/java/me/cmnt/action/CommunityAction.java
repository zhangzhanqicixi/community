package me.cmnt.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import me.cmnt.service.BaseServiceI;

@ParentPackage("basePackage")
@Action(value = "community")
@Namespace("/")
public class CommunityAction {
	
	@Autowired
	private BaseServiceI communityService;
	
}