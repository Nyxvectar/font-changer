package main

import (
	"fmt"
	"os"
	"strings"
)

var charMap = map[rune]rune{
	'q': 'ꞯ', 'w': 'ᴡ', 'f': 'ꜰ', 'p': 'ᴩ', 'b': 'ʙ', 'j': 'ᴊ', 'l': 'ʟ', 'u': 'ᴜ', 'y': 'ʏ',
	'a': 'ᴀ', 'r': 'ʀ', 's': 'ꜱ', 't': 'ᴛ', 'g': 'ɢ', 'm': 'ᴍ', 'n': 'ɴ', 'e': 'ᴇ', 'i': 'ɪ', 'o': 'ᴏ',
	'x': 'x', 'c': 'ᴄ', 'd': 'ᴅ', 'v': 'ᴠ', 'z': 'ᴢ', 'k': 'ᴋ', 'h': 'ʜ',
	'Q': 'ꞯ', 'W': 'ᴡ', 'F': 'ꜰ', 'P': 'ᴩ', 'B': 'ʙ', 'J': 'ᴊ', 'L': 'ʟ', 'U': 'ᴜ', 'Y': 'ʏ',
	'A': 'ᴀ', 'R': 'ʀ', 'S': 'ꜱ', 'T': 'ᴛ', 'G': 'ɢ', 'M': 'ᴍ', 'N': 'ɴ', 'E': 'ᴇ', 'I': 'ɪ', 'O': 'ᴏ',
	'X': 'X', 'C': 'ᴄ', 'D': 'ᴅ', 'V': 'ᴠ', 'Z': 'ᴢ', 'K': 'ᴋ', 'H': 'ʜ',
}

var charMap2 = map[rune]rune{
	'q': '𝓆', 'w': '𝓌', 'f': '𝒻', 'p': '𝓅', 'b': '𝒷', 'j': '𝒿', 'l': '𝓁', 'u': '𝓊', 'y': '𝓎',
	'a': '𝒶', 'r': '𝓇', 's': '𝓈', 't': '𝓉', 'g': '𝑔', 'm': '𝓂', 'n': '𝓃', 'e': '𝑒', 'i': '𝒾', 'o': '𝑜',
	'x': '𝓍', 'c': '𝒸', 'd': '𝒹', 'v': '𝓋', 'z': '𝓏', 'k': '𝓀', 'h': '𝒽',
	'Q': '𝒬', 'W': '𝒲', 'F': '𝐹', 'P': '𝒫', 'B': '𝐵', 'J': '𝒥', 'L': '𝐿', 'U': '𝒰', 'Y': '𝒴',
	'A': '𝒜', 'R': '𝑅', 'S': '𝒮', 'T': '𝒯', 'G': '𝐺', 'M': '𝑀', 'N': '𝒩', 'E': '𝐸', 'I': '𝐼', 'O': '𝒪',
	'X': '𝒳', 'C': '𝒞', 'D': '𝐷', 'V': '𝒱', 'Z': '𝒵', 'K': '𝐾', 'H': '𝐻',
}

var charMap3 = map[rune]rune{
	'q': 'ʠ', 'w': 'ѡ', 'f': 'բ', 'p': 'ք', 'b': 'Ⴆ', 'j': 'ϳ', 'l': 'Լ', 'u': 'մ', 'y': 'γ',
	'a': 'α', 'r': 'ɼ', 's': 'ʂ', 't': 'τ', 'g': 'ց', 'm': 'ɱ', 'n': 'ռ', 'e': 'ҽ', 'i': 'ɨ', 'o': 'օ',
	'x': '×', 'c': '¢', 'd': 'ď', 'v': 'ν', 'z': 'ƶ', 'k': 'κ', 'h': 'ɦ',
	'Q': 'Ⴍ', 'W': 'Ѡ', 'F': 'Ḟ', 'P': 'Ρ', 'B': 'Β', 'J': 'Ј', 'L': 'Ł', 'U': 'Ц', 'Y': 'Υ',
	'A': 'Α', 'R': 'Ṙ', 'S': 'Ѕ', 'T': 'Τ', 'G': 'Ġ', 'M': 'Μ', 'N': 'Ν', 'E': 'Ε', 'I': 'Ι', 'O': 'Ο',
	'X': 'Χ', 'C': 'Č', 'D': 'Đ', 'V': 'Ṽ', 'Z': 'Ζ', 'K': 'Κ', 'H': 'Η',
}

/*
此文件简单实现了字体转换
也是鄙人时常用到的特殊字
体的来源。
*/

func main() {
	if len(os.Args) < 2 {
		fmt.Println("Please Provide the Command with Args [string]")
		fmt.Println("可选参数: -font1 (默认) 或 -font2 或 -font3 来选择字体")
		return
	}

	fontMap := charMap
	inputArgs := os.Args[1:]

	if len(inputArgs) > 0 && (inputArgs[0] == "-font1" || inputArgs[0] == "-font2" || inputArgs[0] == "-font3") {
		switch inputArgs[0] {
		case "-font2":
			fontMap = charMap2
		case "-font3":
			fontMap = charMap3
		}
		inputArgs = inputArgs[1:]
	}

	if len(inputArgs) == 0 {
		fmt.Println("Please provide text to convert after the font argument")
		return
	}

	input := strings.Join(inputArgs, " ")
	output := convertText(input, fontMap)
	fmt.Println(output)
}

func convertText(text string, fontMap map[rune]rune) string {
	var result strings.Builder
	for _, char := range text {
		if replacement, exists := fontMap[char]; exists {
			result.WriteRune(replacement)
		} else {
			result.WriteRune(char)
		}
	}
	return result.String()
}
