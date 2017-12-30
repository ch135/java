package com.itcase.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest1 {
	// 正则表达式的格式
	public void mode() {
		/*
		 * 1.字符类 []代表每个字符
		 */
		check("ab9", "[abc][abc][0-9]");
		check("abA", "[a-zA-Z][a-z[A-Z]][a-z&&[^a-o]]");

		/*
		 * 2.预定义字符类
		 */
		check("1o ", "\\d\\w\\s");

		/*
		 *3.posix字符类（\p[XXX]）
		 */
		check("abc", "\\p{Lower}*");
		check("   ", "\\p{Space}*");

		/*
		 * 4java.lang.Character类 \p{javaLowerCase} 等效于
		 * java.lang.Character.isLowerCase() \p{javaMirrored} 等效于
		 * java.lang.Character.isMirrored() \p{javaWhitespace} 等效于
		 * java.lang.Character.isWhitespace() \p{javaUpperCase} 等效于
		 * java.lang.Character.isUpperCase()
		 */
		check("cfsefcwef", "\\p{javaLowerCase}*");
		/*
		 * 5.边界匹配器 
		 * ^ 行的开头
		 * & 行的结尾
		 * \b 单词结尾 
		 * \B 非单词结尾 
		 * \G 上一个匹配的结尾
		 * \z 输入的结尾
		 */
		check("hhhf", "\\bhhhf\\b");
		check("bwcubuo", "^+[a-z]\\w+\\b");
		/*
		 * 逻辑运算符
		 * XY X 后跟 Y 
		 * X|Y X 或 Y 
		 * 
		 * \z 输入的结尾
		 */
		check("hhhf", "\\bhhhf\\b");
		check("bwcubuo", "^+[a-z]\\w+\\b");
		check("abc","(\\w){1,3}");//()存放类型{}存放个数范围
		/*
		 * 逻辑运算符
		 * XY 	X 后跟 Y 
		 * X|Y	X 或 Y 
		 * (X) 	X，作为 
		 */
		//年份判断
		check("1995","^(19|20)\\d{2}$");
		//月份判断
		check("12","^([1-9]|1[0-2])$");
	}
	// 判断是是否匹配
	public void check(String str, String str1) {
		Pattern p = Pattern.compile(str1);
		Matcher m = p.matcher(str);
		System.out.println(str + " 匹配 " + str1 + ": " + m.matches());
	}
	//正则表达式字符匹配适用于字符串
	public static void main(String[] args) {
		RegexTest1 de = new RegexTest1();
		de.mode();
	}
}