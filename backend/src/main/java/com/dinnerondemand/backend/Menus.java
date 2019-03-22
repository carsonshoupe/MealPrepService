package com.dinnerondemand.backend;

import com.dinnerondemand.Menu.Menu;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Menus {

    private static List<Menu> menus;
    private static HashMap<String, Menu> menusMap = new HashMap<String, Menu>();

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/Menus.json");
            menus = objectMapper.readValue(file, new TypeReference<List<Menu>>(){});
            for (Menu menu : menus) {
                menusMap.put(menu.getMonth(), menu);
            }
        } catch (IOException e) {
            System.out.println("Failed to load menus");
            e.printStackTrace();
        }
    }

    public static List<Menu> getAllMenus() {return menus;}
    public static Menu getMenu(String month) {return menusMap.get(month);}

}
