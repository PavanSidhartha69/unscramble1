package com.example.unscramble1;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainViewModel extends ViewModel {
    private String[] allWordsList = new String[] {"animal", "auto", "anecdote", "alphabet", "all", "awesome", "arise", "balloon", "basket", "bench", "best", "birthday", "book", "briefcase", "camera", "camping", "candle", "cat", "cauliflower", "chat", "children", "class", "classic", "classroom", "coffee", "colorful", "cookie", "creative", "cruise", "dance", "daytime", "dinosaur", "doorknob", "dine", "dream", "dusk", "eating", "elephant", "emerald", "eerie", "electric", "finish", "flowers", "follow", "fox", "frame", "free", "frequent", "funnel", "green", "guitar", "grocery", "glass", "great", "giggle", "haircut", "half", "homemade", "happen", "honey", "hurry", "hundred", "ice", "igloo", "invest", "invite", "icon", "introduce", "joke", "jovial", "journal", "jump", "join", "kangaroo", "keyboard", "kitchen", "koala", "kind", "kaleidoscope", "landscape", "late", "laugh", "learning", "lemon", "letter", "lily", "magazine", "marine", "marshmallow", "maze", "meditate", "melody", "minute", "monument", "moon", "motorcycle", "mountain", "music", "north", "nose", "night", "name", "never", "negotiate", "number", "opposite", "octopus", "oak", "order", "open", "polar", "pack", "painting", "person", "picnic", "pillow", "pizza", "podcast", "presentation", "puppy", "puzzle", "recipe", "release", "restaurant", "revolve", "rewind", "room", "run", "secret", "seed", "ship", "shirt", "should", "small", "spaceship", "stargazing", "skill", "street", "style", "sunrise", "taxi", "tidy", "timer", "together", "tooth", "tourist", "travel", "truck", "under", "useful", "unicorn", "unique", "uplift", "uniform", "vase", "violin", "visitor", "vision", "volume", "view", "walrus", "wander", "world", "winter", "well", "whirlwind", "x-ray", "xylophone", "yoga", "yogurt", "yoyo", "you", "year", "yummy", "zebra", "zigzag", "zoology", "zone", "zeal"};
    String FinalDis = "";

    int randit = (int) (Math.random()*(178));
    String Og=allWordsList[randit];
    public MutableLiveData<String> Str= new MutableLiveData<>();
    public void fun(String str){
        Log.i("Na bonda","hii");
    }
    public void shuf(){

        ArrayList<Character> Shuffle = new ArrayList<Character>();
        for (int i=0;i<Og.length();i++){
            Shuffle.add(Og.charAt(i));
        }
        Collections.shuffle(Shuffle);
        Iterator<Character> iter = Shuffle.iterator();
        Log.i("shuffled",String.valueOf(Shuffle));
        while(iter.hasNext()){
            FinalDis+=iter.next();
        }
        Str.setValue(FinalDis);
        return;
    }
    public void check(Context context,String val){
        Log.i(FinalDis,val);
        if(val.equals(Og)){
            Log.i("done","vachindi");
            Toast.makeText(context,"WIN", Toast.LENGTH_SHORT).show();
            FinalDis="";
            randit = (int) (Math.random()*(178));
            Og=allWordsList[randit];
            shuf();
        }
        else if(!val.equals(Og)){
            Toast.makeText(context, "LOSE", Toast.LENGTH_SHORT).show();
        }
    }

}
