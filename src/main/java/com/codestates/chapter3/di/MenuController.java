package com.codestates.chapter3.di;

import java.util.List;

public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    public List<Menu> getMenuList() {
        return menuService.getMenuList();
    }
}
