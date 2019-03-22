package com.dinnerondemand.backend;

import com.dinnerondemand.Menu.Menu;
import com.dinnerondemand.Menu.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenusController {

    @Autowired
    private MenusService menusService;

    @RequestMapping(value="/menus", method=RequestMethod.GET)
    public List<MenuDTO> getAllMenus() {
        return menusService.getAllMenus();
    }

    @RequestMapping(value="/menus/{month}", method=RequestMethod.GET)
    public MenuDTO getMenu(@PathVariable String month) {
        return menusService.getMenu(month);
    }
}
