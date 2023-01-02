package com.example.demo.Services;

import com.example.demo.Model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.example.demo.DatabaseConnection.MaConnection.getConnection;

public class CategoriesServices {
    private static List<Category> categories = new ArrayList<>();

    private static Category comedy = new Category();
    private static Category history = new Category();
    private static Category programmingLanguage = new Category();
    private static Category arts = new Category();

    public static Category innitComedy(){
        comedy.setId(1);
        comedy.setActif(true);
        comedy.setName("Comedy");
        return comedy;
    }
    public static Category innitHistory(){
        history.setId(2);
        history.setActif(true);
        history.setName("history");
        return history;
    }
    public static Category innitProgrammingLanguage(){
        programmingLanguage.setId(3);
        programmingLanguage.setActif(true);
        programmingLanguage.setName("history");
        return programmingLanguage;
    }
    public static Category innitArts(){
        arts.setId(4);
        arts.setActif(true);
        arts.setName("history");
        return comedy;
    }
    public static List<Category> getCategories(){
        innitComedy();
        innitHistory();
        innitProgrammingLanguage();
        innitArts();
        categories.add(comedy);
        categories.add(history);
        categories.add(programmingLanguage);
        categories.add(arts);
        return categories;
    }


}
