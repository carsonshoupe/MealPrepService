package com.dinnerondemand.backend;

import com.dinnerondemand.Menu.MenuDTO;
import org.springframework.stereotype.Service;

import com.dinnerondemand.Menu.Menu;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenusService {
    private List<Menu> menus = Menus.getAllMenus();

    public List<MenuDTO> getAllMenus() {
        List<MenuDTO> menusDTO = new ArrayList<MenuDTO>();
        for (Menu menu : menus) {
            menusDTO.add(menu.toMenuDTO());
        }
        return menusDTO;
    }

    public MenuDTO getMenu(String month) {
        return Menus.getMenu(month).toMenuDTO();
    }

}
