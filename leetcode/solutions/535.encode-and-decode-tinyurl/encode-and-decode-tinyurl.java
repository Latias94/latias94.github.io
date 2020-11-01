public class Codec {

    Map<String, Integer> map = new HashMap<>();
    int index = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longUrl.length() == 0) return "error";
        if (!map.containsKey(longUrl)) {
            index++;
            map.put(longUrl, index);
            return "http://tinyurl.com/" + index;
        } else {
            return "http://tinyurl.com/" + map.get(longUrl);
        }
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if (shortUrl.length() <= 19) return "error";
        int key = Integer.valueOf(shortUrl.substring(19));
        if (map.containsValue(key)) {
            Set<String> set = map.keySet();
            for (String s : set) {
                if (map.get(s) == key) {
                    return s;
                }
            }
        }
        return "error";
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));