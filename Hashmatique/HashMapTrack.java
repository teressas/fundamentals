import java.util.HashMap;
import java.util.Set;

public class HashMapTrack {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Can We Pretend", "Cash Cash");
        trackList.put("What's Next", "Drake");
        trackList.put("Cold Heart", "Elton John");

        String name = trackList.get("Cold Heart");
        System.out.println(name);
        
        // get the keys by using the keySet method
        // Set<String> keys = trackList.keySet();
        for(String key : trackList.keySet()) {  
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
    }
}

