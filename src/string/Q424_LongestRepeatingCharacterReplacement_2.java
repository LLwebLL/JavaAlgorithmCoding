package string;


// 方法二： 其实本质一样与方法一（双指针），复杂程度也一致
public class Q424_LongestRepeatingCharacterReplacement_2 {
	public static int characterReplacement(String s, int k) {
		int left =0, max_length=0,mostFreLetter_count= 0;
		int[] fre_counter  = new int [26];
		for (int right =0; right<s.length();right++) {
			 fre_counter[s.charAt(right)-'A']++;
			 mostFreLetter_count = Math.max(mostFreLetter_count, fre_counter[s.charAt(right)-'A']);
			 if (right-left+1-mostFreLetter_count>k){
				 fre_counter[s.charAt(left)-'A']--;
				 left++;}
			  max_length = Math.max(max_length, right-left+1);}
		return max_length;}
	
	// 测试一下是否可行：
	public static void main(String[] args) {
  
		String test_string = "ABZZBBBYABAAY";
		int test_numberReplace = 1;
		int result = characterReplacement(test_string,test_numberReplace);
		System.out.println(result);}
	}
		
