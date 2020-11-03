package Fils;

import Body.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generator {
    private static List<Insertion> insertion(){
        List<String> videos = new ArrayList<>();
        List<String> imgs =new ArrayList<>();
        imgs.add("Peper.jpg");
        List<String> links = new ArrayList<>();
        links.add("http://www.allpepersrussia.ru/");
        List<Insertion> ins =new ArrayList<>();
        ins.add(new Insertion(links,imgs,videos));
        return ins;
    }
    private static List<PostComents> coments(){
        List<PostComents> coms =new ArrayList<>();
        coms.add(new PostComents("upyr.jpg",
                "Upyachka Upyatovna",
                "vk.com/Upyacha111",
                "Афтар, убейся аб стену", 666,123,0));
        return coms;
    }
    private static List<Recomends> geterateRecomends(){
        List<Recomends> recomends =new ArrayList<>();
        Recomends recomends1 = new Recomends("SpicyPeper.jpg",
                "Жгучий перец",
                "vk.com/spicy_peper",
                "Все о жгучих перцах",
                "vk.com/spicy_peper/subscribe");
        Recomends recomends2 = new Recomends("RussiaPeper.jpg",
                "Перцы России",
                "vk.com/peper_russia",
                "Всероссийский клуб любителей перцев",
                "vk.com/peper_russia/subscribe");
        recomends.add(recomends1);
        recomends.add(recomends2);
        return recomends;
    }
    public static VKFeed generate(){

        Post post1 = new Post("Жгучий перец",
                "vk.com/spicy_peper",
                "Если вы не знаете, что такое жгучий перец, то заходите к нам в группу!",
                insertion(),2,1,1,coments());
        Post post2 =new Post("Перцы России", "vk.com/peper_russia","Если вы не знаете, что такое жгучий перец, то заходите к нам в группу!",
                insertion(),2,1,1,coments());
        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        return new VKFeed(posts,geterateRecomends());
    }
}
