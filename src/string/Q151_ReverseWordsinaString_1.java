package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q151_ReverseWordsinaString_1 {
// On On
	class Solution {
	    public String reverseWords(String s) {
	        // 除去开头和末尾的空白字符
	        s = s.trim();
	        // 正则匹配连续的空白字符作为分隔符分割
	        List<String> wordList = Arrays.asList(s.split("\\s+"));
	        Collections.reverse(wordList);
	        return String.join(" ", wordList);
	    }
	}

	
	
// On O1(但java不行)

	    public String reverseWords(String s) {
	        StringBuilder sb = trimSpaces(s);

	        // 翻转字符串
	        reverse(sb, 0, sb.length() - 1);

	        // 翻转每个单词
	        reverseEachWord(sb);

	        return sb.toString();
	    }

	    public StringBuilder trimSpaces(String s) {
	        int left = 0, right = s.length() - 1;
	        // 去掉字符串开头的空白字符
	        while (left <= right && s.charAt(left) == ' ') {
	            ++left;
	        }

	        // 去掉字符串末尾的空白字符
	        while (left <= right && s.charAt(right) == ' ') {
	            --right;
	        }

	        // 将字符串间多余的空白字符去除
	        StringBuilder sb = new StringBuilder();
	        while (left <= right) {
	            char c = s.charAt(left);

	            if (c != ' ') {
	                sb.append(c);
	            } else if (sb.charAt(sb.length() - 1) != ' ') {
	                sb.append(c);
	            }

	            ++left;
	        }
	        return sb;
	    }

	    public void reverse(StringBuilder sb, int left, int right) {
	        while (left < right) {
	            char tmp = sb.charAt(left);
	            sb.setCharAt(left++, sb.charAt(right));
	            sb.setCharAt(right--, tmp);
	        }
	    }

	    public void reverseEachWord(StringBuilder sb) {
	        int n = sb.length();
	        int start = 0, end = 0;

	        while (start < n) {
	            // 循环至单词的末尾
	            while (end < n && sb.charAt(end) != ' ') {
	                ++end;
	            }
	            // 翻转单词
	            reverse(sb, start, end - 1);
	            // 更新start，去找下一个单词
	            start = end + 1;
	            ++end;
	        }
	    }
	
	    public class Solution151 {
	    	  
	    	  public String reverseWords(String s) {
	    	    if (s == null) return null;
	    	    
	    	    char[] a = s.toCharArray();
	    	    int n = a.length;
	    	    
	    	    // step 1. reverse the whole string
	    	    reverse(a, 0, n - 1);
	    	    // step 2. reverse each word
	    	    reverseWords(a, n);
	    	    // step 3. clean up spaces
	    	    return cleanSpaces(a, n);
	    	  }
	    	  
	    	  void reverseWords(char[] a, int n) {
	    	    int i = 0, j = 0;
	    	      
	    	    while (i < n) {
	    	      while (i < j || i < n && a[i] == ' ') i++; // skip spaces
	    	      while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
	    	      reverse(a, i, j - 1);                      // reverse the word
	    	    }
	    	  }
	    	  
	    	  // trim leading, trailing and multiple spaces
	    	  String cleanSpaces(char[] a, int n) {
	    	    int i = 0, j = 0;
	    	      
	    	    while (j < n) {
	    	      while (j < n && a[j] == ' ') j++;             // skip spaces
	    	      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
	    	      while (j < n && a[j] == ' ') j++;             // skip spaces
	    	      if (j < n) a[i++] = ' ';                      // keep only one space
	    	    }
	    	  
	    	    return new String(a).substring(0, i);
	    	  }
	    	  
	    	  // reverse a[] from a[i] to a[j]
	    	  private void reverse(char[] a, int i, int j) {
	    	    while (i < j) {
	    	      char t = a[i];
	    	      a[i++] = a[j];
	    	      a[j--] = t;
	    	    }
	    	  }
	    	  
	    	}

}