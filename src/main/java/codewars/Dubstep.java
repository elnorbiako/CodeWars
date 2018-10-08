package codewars;
public class Dubstep {
    public static String SongDecoder (String song)
    {
        String original = song.replaceAll("WUB"," ").trim().replaceAll("\\s+"," ");

        return original;
    }
}
