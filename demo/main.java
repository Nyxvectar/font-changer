import java.util.HashMap;
import java.util.Map;

public class FontConverter {
    private static final Map<Character, Character> charMap;
    private static final Map<Character, Character> charMap2;
    private static final Map<Character, Character> charMap3;

    static {
        charMap = new HashMap<>();
        charMap.put('q', 'ꞯ'); charMap.put('w', 'ᴡ'); charMap.put('f', 'ꜰ'); charMap.put('p', 'ᴩ');
        charMap.put('b', 'ʙ'); charMap.put('j', 'ᴊ'); charMap.put('l', 'ʟ'); charMap.put('u', 'ᴜ');
        charMap.put('y', 'ʏ'); charMap.put('a', 'ᴀ'); charMap.put('r', 'ʀ'); charMap.put('s', 'ꜱ');
        charMap.put('t', 'ᴛ'); charMap.put('g', 'ɢ'); charMap.put('m', 'ᴍ'); charMap.put('n', 'ɴ');
        charMap.put('e', 'ᴇ'); charMap.put('i', 'ɪ'); charMap.put('o', 'ᴏ'); charMap.put('x', 'x');
        charMap.put('c', 'ᴄ'); charMap.put('d', 'ᴅ'); charMap.put('v', 'ᴠ'); charMap.put('z', 'ᴢ');
        charMap.put('k', 'ᴋ'); charMap.put('h', 'ʜ');

        charMap.put('Q', 'ꞯ'); charMap.put('W', 'ᴡ'); charMap.put('F', 'ꜰ'); charMap.put('P', 'ᴩ');
        charMap.put('B', 'ʙ'); charMap.put('J', 'ᴊ'); charMap.put('L', 'ʟ'); charMap.put('U', 'ᴜ');
        charMap.put('Y', 'ʏ'); charMap.put('A', 'ᴀ'); charMap.put('R', 'ʀ'); charMap.put('S', 'ꜱ');
        charMap.put('T', 'ᴛ'); charMap.put('G', 'ɢ'); charMap.put('M', 'ᴍ'); charMap.put('N', 'ɴ');
        charMap.put('E', 'ᴇ'); charMap.put('I', 'ɪ'); charMap.put('O', 'ᴏ'); charMap.put('X', 'X');
        charMap.put('C', 'ᴄ'); charMap.put('D', 'ᴅ'); charMap.put('V', 'ᴠ'); charMap.put('Z', 'ᴢ');
        charMap.put('K', 'ᴋ'); charMap.put('H', 'ʜ');
    }

    public static void main(String[] args) {
        println("Hello")
    }
}