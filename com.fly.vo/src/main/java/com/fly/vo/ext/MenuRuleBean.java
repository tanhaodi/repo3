package com.fly.vo.ext;

public class MenuRuleBean {
	
	private int menuId;
	private int parentMenuId; 
	private String menuName;
	private String menuUrl;
	private int menuSort;
	private String rule;
	
	public int getMenuSort() {
		return menuSort;
	}
	public void setMenuSort(int menuSort) {
		this.menuSort = menuSort;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getParentMenuId() {
		return parentMenuId;
	}
	public void setParentMenuId(int parentMenuId) {
		this.parentMenuId = parentMenuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	
}
