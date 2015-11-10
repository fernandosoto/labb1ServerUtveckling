package controller;

import javax.faces.bean.*;

import ui.UserBean;

@ManagedBean
@SessionScoped
public class PageController {
	public String afterLogin(){
		System.out.println("After Login!");
		return "homePage.jsf";
	}
}
