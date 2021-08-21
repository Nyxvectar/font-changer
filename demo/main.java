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

        charMap2 = new HashMap<>();
        charMap2.put('q', '𝓆'); charMap2.put('w', '𝓌'); charMap2.put('f', '𝒻'); charMap2.put('p', '𝓅');
        charMap2.put('b', '𝒷'); charMap2.put('j', '𝒿'); charMap2.put('l', '𝓁'); charMap2.put('u', '𝓊');
        charMap2.put('y', '𝓎'); charMap2.put('a', '𝒶'); charMap2.put('r', '𝓇'); charMap2.put('s', '𝓈');
        charMap2.put('t', '𝓉'); charMap2.put('g', '𝑔'); charMap2.put('m', '𝓂'); charMap2.put('n', '𝓃');
        charMap2.put('e', '𝑒'); charMap2.put('i', '𝒾'); charMap2.put('o', '𝑜'); charMap2.put('x', '𝓍');
        charMap2.put('c', '𝒸'); charMap2.put('d', '𝒹'); charMap2.put('v', '𝓋'); charMap2.put('z', '𝓏');
        charMap2.put('k', '𝓀'); charMap2.put('h', '𝒽');

        charMap2.put('Q', '𝒬'); charMap2.put('W', '𝒲'); charMap2.put('F', '𝐹'); charMap2.put('P', '𝒫');
        charMap2.put('B', '𝐵'); charMap2.put('J', '𝒥'); charMap2.put('L', '𝐿'); charMap2.put('U', '𝒰');
        charMap2.put('Y', '𝒴'); charMap2.put('A', '𝒜'); charMap2.put('R', '𝑅'); charMap2.put('S', '𝒮');
        charMap2.put('T', '𝒯'); charMap2.put('G', '𝐺'); charMap2.put('M', '𝑀'); charMap2.put('N', '𝒩');
        charMap2.put('E', '𝐸'); charMap2.put('I', '𝐼'); charMap2.put('O', '𝒪'); charMap2.put('X', '𝒳');
        charMap2.put('C', '𝒞'); charMap2.put('D', '𝐷'); charMap2.put('V', '𝒱'); charMap2.put('Z', '𝒵');
        charMap2.put('K', '𝐾'); charMap2.put('H', '𝐻');

        charMap3 = new HashMap<>();
        charMap3.put('q', 'ʠ'); charMap3.put('w', 'ѡ'); charMap3.put('f', 'բ'); charMap3.put('p', 'ք');
        charMap3.put('b', 'Ⴆ'); charMap3.put('j', 'ϳ'); charMap3.put('l', 'Լ'); charMap3.put('u', 'մ');
        charMap3.put('y', 'γ'); charMap3.put('a', 'α'); charMap3.put('r', 'ɼ'); charMap3.put('s', 'ʂ');
        charMap3.put('t', 'τ'); charMap3.put('g', 'ց'); charMap3.put('m', 'ɱ'); charMap3.put('n', 'ռ');
        charMap3.put('e', 'ҽ'); charMap3.put('i', 'ɨ'); charMap3.put('o', 'օ'); charMap3.put('x', '×');
        charMap3.put('c', '¢'); charMap3.put('d', 'ď'); charMap3.put('v', 'ν'); charMap3.put('z', 'ƶ');
        charMap3.put('k', 'κ'); charMap3.put('h', 'ɦ');

        charMap3.put('Q', 'Ⴍ'); charMap3.put('W', 'Ѡ'); charMap3.put('F', 'Ḟ'); charMap3.put('P', 'Ρ');
        charMap3.put('B', 'Β'); charMap3.put('J', 'Ј'); charMap3.put('L', 'Ł'); charMap3.put('U', 'Ц');
        charMap3.put('Y', 'Υ'); charMap3.put('A', 'Α'); charMap3.put('R', 'Ṙ'); charMap3.put('S', 'Ѕ');
        charMap3.put('T', 'Τ'); charMap3.put('G', 'Ġ'); charMap3.put('M', 'Μ'); charMap3.put('N', 'Ν');
        charMap3.put('E', 'Ε'); charMap3.put('I', 'Ι'); charMap3.put('O', 'Ο'); charMap3.put('X', 'Χ');
        charMap3.put('C', 'Č'); charMap3.put('D', 'Đ'); charMap3.put('V', 'Ṽ'); charMap3.put('Z', 'Ζ');
        charMap3.put('K', 'Κ'); charMap3.put('H', 'Η');
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please Provide the Command with Args [string]");
            System.out.println("可选参数: -font1 (默认) 或 -font2 或 -font3 来选择字体");
            return;
        }

        Map<Character, Character> fontMap = charMap;
        String[] inputArgs = args;

        if (inputArgs.length > 0 && (inputArgs[0].equals("-font1") ||
            inputArgs[0].equals("-font2") || inputArgs[0].equals("-font3"))) {

            switch (inputArgs[0]) {
                case "-font2":
                    fontMap = charMap2;
                    break;
                case "-font3":
                    fontMap = charMap3;
                    break;
            }

            inputArgs = new String[inputArgs.length - 1];
            System.arraycopy(args, 1, inputArgs, 0, inputArgs.length);
        }

        if (inputArgs.length == 0) {
            System.out.println("Please provide text to convert after the font argument");
            return;
        }

        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < inputArgs.length; i++) {
            if (i > 0) {
                inputBuilder.append(" ");
            }
            inputBuilder.append(inputArgs[i]);
        }
        String input = inputBuilder.toString();

        String output = convertText(input, fontMap);
        System.out.println(output);
    }

    private static String convertText(String text, Map<Character, Character> fontMap) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result.append(fontMap.getOrDefault(c, c));
        }
        return result.toString();
    }
}