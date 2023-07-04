package com.example.packyourbag.Data;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.packyourbag.Constants.MyConstants;
import com.example.packyourbag.Database.RoomDB;
import com.example.packyourbag.Model.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData extends Application {

    RoomDB database;
    String category;
    Context context;

    public static final String LAST_VERSION = "LAST_VERSION";
    public static final int NEW_VERSION = 1;

    public AppData(RoomDB database) {
        this.database = database;
    }


    public AppData(RoomDB database, Context context) {
        this.database = database;
        this.context = context;
    }



    public List<Items> getBasicData(){
        category = "Basic Need";
        List<Items> basicItem = new ArrayList<>();
        basicItem.clear();
        basicItem.add(new Items("Visa",category,false));
        basicItem.add(new Items("PassPort",category,false));
        basicItem.add(new Items("Tickets",category,false));
        basicItem.add(new Items("Wallet",category,false));
        basicItem.add(new Items("Driving License",category,false));
        basicItem.add(new Items("House Key",category,false));
        basicItem.add(new Items("Book",category,false));
        basicItem.add(new Items("Travel Pillow",category,false));
        basicItem.add(new Items("Eye Patch",category,false));
        basicItem.add(new Items("Umbrella",category,false));
        basicItem.add(new Items("Note Book",category,false));
        return basicItem;
    }

    public List<Items> getPersonalcareData(){

        String[] data = {"Tooth-brush","Tooth-paste","Floss","Mouthwash","Shaving Cream","Razor Blade",
                "Soap","Fiber","Shampoo","Hair Conditioner","Brush","Comb","Hair Dryer","Curling iorn",
                "Hair Moulder","Hair Clip","Moisturizer","Lip Cream","Contact Lens","Perfume","Deodorant",
                "Makeup materials","Mekeup remover","Pad","Wet wipes","Ear stick","Cotton","Nail Polish",
                "Nail polish remover","Tweezers","Nail Files","Sun cream"};
        return prepareItemsList(MyConstants.PERSONAL_CARE_CAMEL_CASE,data);

    }

    public List<Items> getClothingData(){

        String[] data = {"T-Shirts","Shirts","Jacket","Skirt","Trousers","Shorts",
                "Rain coat","Hat","Scarf","Slipper","Casual Shoes"};
        return prepareItemsList(MyConstants.CLOTHING_CAMEL_CASE,data);

    }

    public List<Items> getBabyNeedsData(){

        String[] data = {"Baby-Pijamas","Baby-towel","baby-hat","Blanket","Baby Bottles"};
        return prepareItemsList(MyConstants.BABY_NEEDS_CAMEL_CASE,data);

    }
    public List<Items> getHealthData(){

        String[] data = {"Tooth-brush","Tooth-paste","Floss","Mouthwash","Shaving Cream","Razor Blade",
                "Soap","Fiber","Shampoo","Hair Conditioner","Brush","Comb","Hair Dryer","Curling Iorn",
                "Hair Moulder","Hair Clip","Moisturizer","Lip Cream","Contact Lens","Perfume","deodrorat",
                "makeup mat","mm","we","p","e","cotton","nail","re","Twe","Sci","file","sun cream"};
        return prepareItemsList(MyConstants.HEALTH_CAMEL_CASE,data);

    }
    public List<Items> getTechnologyData(){

        String[] data = {"Tooth-brush","Tooth-paste","Floss","Mouthwash","Shaving Cream","Razor Blade",
                "Soap","Fiber","Shampoo","Hair Conditioner","Brush","Comb","Hair Dryer","Curling Iorn",
                "Hair Moulder","Hair Clip","Moisturizer","Lip Cream","Contact Lens","Perfume","deodrorat",
                "makeup mat","mm","we","p","e","cotton","nail","re","Twe","Sci","file","sun cream"};
        return prepareItemsList(MyConstants.TECHNOLOGY_CAMEL_CASE,data);

    }
    public List<Items> getFoodData(){

        String[] data = {"Tooth-brush","Tooth-paste","Floss","Mouthwash","Shaving Cream","Razor Blade",
                "Soap","Fiber","Shampoo","Hair Conditioner","Brush","Comb","Hair Dryer","Curling Iorn",
                "Hair Moulder","Hair Clip","Moisturizer","Lip Cream","Contact Lens","Perfume","deodrorat",
                "makeup mat","mm","we","p","e","cotton","nail","re","Twe","Sci","file","sun cream"};
        return prepareItemsList(MyConstants.FOOD_CAMEL_CASE,data);

    }
    public List<Items> getBeachSuppliesData(){

        String[] data = {"Tooth-brush","Tooth-paste","Floss","Mouthwash","Shaving Cream","Razor Blade",
                "Soap","Fiber","Shampoo","Hair Conditioner","Brush","Comb","Hair Dryer","Curling Iorn",
                "Hair Moulder","Hair Clip","Moisturizer","Lip Cream","Contact Lens","Perfume","deodrorat",
                "makeup mat","mm","we","p","e","cotton","nail","re","Twe","Sci","file","sun cream"};
        return prepareItemsList(MyConstants.BEACH_SUPPLIES_CAMEL_CASE,data);

    }
    public List<Items> getCarSuppliesData(){

        String[] data = {"Tooth-brush","Tooth-paste","Floss","Mouthwash","Shaving Cream","Razor Blade",
                "Soap","Fiber","Shampoo","Hair Conditioner","Brush","Comb","Hair Dryer","Curling Iorn",
                "Hair Moulder","Hair Clip","Moisturizer","Lip Cream","Contact Lens","Perfume","deodrorat",
                "makeup mat","mm","we","p","e","cotton","nail","re","Twe","Sci","file","sun cream"};
        return prepareItemsList(MyConstants.CAR_SUPPLIES_CAMEL_CASE,data);

    }
    public List<Items> getNeedsData(){

        String[] data = {"Tooth-brush","Tooth-paste","Floss","Mouthwash","Shaving Cream","Razor Blade",
                "Soap","Fiber","Shampoo","Hair Conditioner","Brush","Comb","Hair Dryer","Curling Iorn",
                "Hair Moulder","Hair Clip","Moisturizer","Lip Cream","Contact Lens","Perfume","deodrorat",
                "makeup mat","mm","we","p","e","cotton","nail","re","Twe","Sci","file","sun cream"};
        return prepareItemsList(MyConstants.NEEDS_CAMEL_CASE,data);

    }

    public List<Items> prepareItemsList(String category,String []data){
        List<String> list = Arrays.asList(data);
        List<Items> dataList = new ArrayList<>();
        dataList.clear();

        for (int i=0; i<list.size(); i++){
            dataList.add(new Items(list.get(i),category,false));
        }
        return dataList;
    }

    public List<List<Items>> getAllData(){
        List<List<Items>> listofAllIteams = new ArrayList<>();
        listofAllIteams.clear();
        listofAllIteams.add(getBasicData());
        listofAllIteams.add(getClothingData());
        listofAllIteams.add(getPersonalcareData());
        listofAllIteams.add(getBabyNeedsData());
        listofAllIteams.add(getHealthData());
        listofAllIteams.add(getTechnologyData());
        listofAllIteams.add(getFoodData());
        listofAllIteams.add(getBeachSuppliesData());
        listofAllIteams.add(getCarSuppliesData());
        listofAllIteams.add(getNeedsData());
        return listofAllIteams;
    }

    public void persistAllData(){
        List<List<Items>> listofAllIteams = getAllData();
        for (List<Items> list: listofAllIteams){
            for(Items items:list){
                database.mainDao().saveItem(items);
            }
        }
        System.out.println("Data added");
    }

    public  void persistDataByCategory(String category,Boolean onlyDelete){
        try {
            List<Items> list = deleteAndGetListByCategory(category,onlyDelete);
            if (!onlyDelete){

                for (Items items:list){
                    database.mainDao().saveItem(items);
                }
                Toast.makeText(context,category+" Reset Successfully.",Toast.LENGTH_SHORT).show();

            }else {
                Toast.makeText(context,category+" Reset Successfully.",Toast.LENGTH_SHORT).show();
            }

        } catch (Exception ex){
            ex.printStackTrace();
            Toast.makeText(context,"Something Went Wrong",Toast.LENGTH_SHORT).show();
        }
    }


    private List<Items> deleteAndGetListByCategory(String category,Boolean onlyDelete){
        if (onlyDelete){
            database.mainDao().deleteAllByCategoryAndAddedBy(category,MyConstants.SYSTEM_SMALL);
        }else {
            database.mainDao().deleteAllByCategory(category);

        }
        switch (category){
            case MyConstants.BASIC_NEEDS_CAMEL_CASE:
                return getBasicData();

            case MyConstants.CLOTHING_CAMEL_CASE:
                return getClothingData();

            case MyConstants.PERSONAL_CARE_CAMEL_CASE:
                return getPersonalcareData();

            case MyConstants.BABY_NEEDS_CAMEL_CASE:
                return getBabyNeedsData();

            case MyConstants.HEALTH_CAMEL_CASE:
                return getHealthData();

            case MyConstants.TECHNOLOGY_CAMEL_CASE:
                return getTechnologyData();

            case MyConstants.FOOD_CAMEL_CASE:
                return getFoodData();

            case MyConstants.BEACH_SUPPLIES_CAMEL_CASE:
                return getBeachSuppliesData();

            case MyConstants.CAR_SUPPLIES_CAMEL_CASE:
                return getCarSuppliesData();

            case MyConstants.NEEDS_CAMEL_CASE:
                return getNeedsData();

            default:
                return new ArrayList<>();
        }
    }
}






















