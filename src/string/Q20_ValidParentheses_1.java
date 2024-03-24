
package string;
/*
 * Given a string s containing just the characters 
 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
 */

// 方法一： 
import java.util.Stack;

public class Q20_ValidParentheses_1 {
	public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>(); // create an empty stack
	        for (char c : s.toCharArray()) { 
// toCharArray() 是 Java 中 String 类的一个方法，它的作用是将字符串转换为字符数组。当你调用这个方法时，
	        	// 它会返回一个新的字符数组，这个数组的内容与原始字符串中的字符相同。
// 举个例子，如果你有一个字符串 String s = "hello";，当你调用 s.toCharArray() 时，你会得到一个字符数组 {'h', 'e', 'l', 'l', 'o'}。
	            if (c == '(') 
	                stack.push(')'); 
	            else if (c == '{') 
	                stack.push('}'); 
	            else if (c == '[') 
	                stack.push(']'); 
	            else if (stack.isEmpty() || stack.pop() != c)  // c指的是当前遍历到的元素，也就是是否含有当前元素，不含有的话说明对应的括号不在
	                return false;}
	        return stack.isEmpty();}} //所以如果本身s没有任何括号也是true的按照题目意思
	    

//Stack（栈）介绍
//栈（Stack）是一种数据结构，它遵循LIFO（Last-In-First-Out，后进先出）原则。想象一下一摞盘子，你只能放在最上面一个盘子或取走最上面的盘子，这就很像栈的工作原理。其主要操作包括：

//Push：将一个元素放入栈的顶部。
//Pop：从栈顶取走一个元素。
//Peek/Top：查看栈顶的元素，但不删除它。
//isEmpty：检查栈是否为空。









