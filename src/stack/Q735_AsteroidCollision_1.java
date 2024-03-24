package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q735_AsteroidCollision_1 {
// Stack On O1
	    public int[] asteroidCollision(int[] asteroids) {
	        Deque<Integer> stack = new ArrayDeque<Integer>();
	        for (int aster : asteroids) {
	            boolean alive = true;
	            while (alive && aster < 0 && !stack.isEmpty() && stack.peek() > 0) {
	                alive = stack.peek() < -aster; // aster 是否存在
	                if (stack.peek() <= -aster) {  // 栈顶行星爆炸
	                    stack.pop();
	                }
	            }
	            if (alive) {
	                stack.push(aster);
	            }
	        }
	        int size = stack.size();
	        int[] ans = new int[size];
	        for (int i = size - 1; i >= 0; i--) {
	            ans[i] = stack.pop();
	        }
	        return ans;
	    }
	}

