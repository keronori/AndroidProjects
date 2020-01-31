package ryofu.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RyofuKaruma {
    private Random rand;
    private Map<Integer, String> map;
    RyofuKaruma(){
        rand = new Random();
        map = new HashMap<Integer, String>(); // be careful
        initialize();
    }

    private void initialize(){
        map.put(0, "俺が呂布カルマだ!");
        map.put(1, "終わった後に喋んな!");
        map.put(2, "俺メッチャDanger\n超Danger\n分かってっか?");
        map.put(3, "言葉のウェイトに\n差がありすぎる");
        map.put(4, "ペニパンも咥えるよ");
        map.put(5, "審査員死んじゃえばいいのに");
        map.put(6, "俺は嫁と子供を抱いてる。\n何が正しいか知ってる");
        map.put(7, "呂布カルマ様のお通りだ");
        map.put(8, "便所でやってろ");
        map.put(9, "やれされてる奴の気持ち\nにもなってみろよ");
        map.put(10, "https://www.youtube.com/watch?v=onTKv0A44PA");
    }

    public String getWord(){
        return map.get(rand.nextInt(map.size()));
    }
}
