/**
 * Author:  Nyxvectar Yan
 * Repo:    fontChanger
 * Created: 07/23/2025
 */

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

/*
此文件简单实现了字体转换
也是鄙人时常用到的特殊字
体的来源。
*/

func main() {
	if len(os.Args) < 2 {
		fmt.Println("Please Provide the Command with Args [string]")
		return
	}
	input := strings.Join(os.Args[1:], " ")
	output := convertText(input)
	fmt.Println(output)
}

func convertText(text string) string {
	var result strings.Builder
	for _, char := range text {
		if replacement, exists := charMap[char]; exists {
			result.WriteRune(replacement)
		} else {
			result.WriteRune(char)
		}
	}
	return result.String()
}
