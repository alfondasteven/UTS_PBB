package com.fonda.daftarmenu;

import com.fonda.daftarmenu.Food;
import com.fonda.daftarmenu.R;

import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "Belgian Churros",
            "American Wrap",
            "Swizz Waffle",
            "Korean Dumpilng",
            "Tokyo Ebi Furai",
            "Italian Carbonara",
            "Mexico Mix Fries"
    };
    private static String [] foodHarga = {
            "30000",
            "35000",
            "40000",
            "25000",
            "40000",
            "55000",
            "45000"
    };
    private static String [] foodInfo = {
            "Churros yang digoreng kering dengan taburan bubuk spesiap dipadu dengan cocolan coklat belgian.",
            "Salad yang diberi toping ayam fillet dipadukan dengan saus spesial lalu dibungkus dengan adonan kulit spesisal.",
            "Waffle vanilla yang diberi aneka toping seperti choco stick , ice cream , potongan buah dan saus cokelat.",
            "Pangsit khas korea yang mempunyai isian ayam , udan dan sayur, yang dimasak dengan cara dikukus lalu diberi kuah kas korea.",
            "Gorengan Ebi khas jepang yang menggunakan udang pilihan dan diberi bumbu khas agar tetap memiliki cita rasa jepang.",
            "Pasta Carbonara dengan irisan ham dan taburan parmesan cheese yang melimpah membuat pasta memiliki texture creamy.",
            "Mix Snack yang berisikan friench fries dan udang goreng yang diberi bumbu spesial dan saus spesial khas mexico."
    };
    private static int [] foodImage = {
            R.drawable.churros,
            R.drawable.chickenwrap,
            R.drawable.icewaffle,
            R.drawable.koreandumpling,
            R.drawable.ebifurai,
            R.drawable.carbonara,
            R.drawable.kentang

    };

    public static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position <foodName.length; position++){
            Food food = new Food();
            food.setNameFood(foodName[position]);
            food.setHargaFood(foodHarga[position]);
            food.setInfoFood(foodInfo[position]);
            food.setPhotoFood(foodImage[position]);
            list.add(food);
        }
        return list;
    }
}
