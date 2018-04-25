package 剑指offer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;


//数组中次数超过一半的数字
/*public class Solution {
	public int MoreThanHalfNum_Solution(int [] array) {
		int len =array.length;
		if(len<1) {
			return 0;
		}
		int count =0;
		Arrays.sort(array);
		int num=array[len/2];
		for(int i=0;i<len;i++) {
			if(num==array[i])
				count++;
		}
		if(count<=(len/2)) {
			num=0;
		}
	return num;	
	}
}*/
//最小的K个数
/*public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> a=new ArrayList<Integer>();
    	if(input.length<1&&k>input.length) {return a;}
        Arrays.sort(input);
        for(int s=0;s<k;s++) {
        	a.add(input[s]);
        }
        return a;
    }
}*/
//连续子数组的最大和
/*public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
    	int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            max=Math.max(max+array[i], array[i]);
            res=Math.max(max, res);
        }
        return res;
}*/
//整数0-n中1出现的次数
/*public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
    	int count=0;
    	while(n>0) {
    	String str=String.valueOf(n);
    	char [] chars=str.toCharArray();
    	for(int i=0;i<chars.length;i++) {
    		if(chars[i]=='1') {
    			count++;
    		}
    		n--;
    	}
    	return count;
    	}
}*/
//把数组排成最小的数
/*public class Solution {
    public String PrintMinNumber(int [] numbers) {
    	if(numbers ==null||numbers.length==0)return "";
    	int len=numbers.length;
    	String[] str=new String[len];
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<len;i++) {
    	str[i]=String.valueOf(numbers[i]);	
    	}
    	Arrays.sort(str,new Comparator<String>() {
    		@Override
    		public int compare(String s1,String s2) {
    			String c1=s1+s2;
    			String c2=s2+s1;
    			return c1.compareTo(c2);
    		}
    	});
    	for(int i=0;i<len;i++) {
    		sb.append(str[i]);
    	}
    	return sb.toString();
    	}
}*/
//第一个只出现一次的字符
/*public class Solution {
    public int FirstNotRepeatingChar(String str) {
    	LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
    	for(int i=0;i<str.length();i++) {
    		if(!map.containsKey(str.charAt(i))) {
    			map.put(str.charAt(i), 1);
    		}else {
    			int time = map.get(str.charAt(i));
    			map.put(str.charAt(i), ++time);
    		}    		
    	}
    	int pos=-1;
    	int i=0;
    	for(;i<str.length();i++) {
    		char c = str.charAt(i);
    		if(map.get(c)==1) {
    			return i;
    		}
    	}
    	return pos;
    	}
}*/
//两个链表的第一个公共节点

/*public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	ListNode current1 = pHead1;
    	ListNode current2 = pHead2;
    	HashMap<ListNode,Integer> hashMap = new HashMap<ListNode,Integer>();
    	while(current1 !=null) {
    		hashMap.put(current1, null);
    		current1 = current1.next;
    	}
    	while(current2 != null) {
    		if(hashMap.containsKey(current2))
    			return current2;
    		current2 = current2.next;
    	}
    	
    	return null;
    	
    	
    	
    	
    }
    }*/
//数字在排序数组中出现的次数
/*public class Solution {
    public int GetNumberOfK(int [] array , int k) {
    	int count = 0;
    	for(int i=0;i<array.length;i++) {
    		if(array[i]==k) {
    			count++;
    		}
    	}
    	
       return count;
    }
}*/
//二叉树的深度

/*public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public int TreeDepth(TreeNode root) {
    	if(root==null) {
    		return 0;
    	}
    	int left=TreeDepth(root.left);
    	int right =TreeDepth(root.right);
    	return Math.max(left, right)+1;
    }
}*/
//平衡二叉树
/*
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length < 2) {
            return list;
        }
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
            list.add(array[i]);
            list.add(array[j]);
                return list;
           }else if(array[i]+array[j]>sum){
                j--;
            }else{
                i++;
            }
             
        }
        return list;
    }
}
*/
//左旋转字符串
/*public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0) {
        	return str;
        }
        StringBuffer buffer = new StringBuffer(str);
        StringBuffer buffer1 = new StringBuffer(str);
        StringBuffer buffer2 = new StringBuffer();
        buffer.delete(0, n);
        buffer1.delete(n, str.length());
        buffer2.append(buffer.toString()).append(buffer1.toString());
        return buffer2.toString();
    }
}*/
//反转单词顺序列
/*public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }
        String[] a = str.split(" ");
        StringBuffer o = new StringBuffer();
        int i;
        for (i = a.length; i >0;i--){
            o.append(a[i-1]);
            if(i > 1){
                o.append(" ");
            }
        }
        System.out.println(o.toString());
        return o.toString();
    }
    public static void main(String[] args) {
		String str = "a b c";
		Solution a =new Solution();
		a.ReverseSentence(str);
	}
}
*/
//圆圈中最后剩下的数
/*public class Solution {
    public int LastRemaining_Solution(int n, int m) {
         if (m == 0 || n == 0) {
            return -1;
        }
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int index = -1;
        while (data.size() > 1) {
//          System.out.println(data);
            index = (index + m) % data.size();
//          System.out.println(data.get(index));
            data.remove(index);
            index--;
        }
        return data.get(0);
    }
}
*/
//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
/*public class Solution {
    public int Sum_Solution(int n) {
        int sum =(int) Math.pow(n, 2)+n;
        return sum>>1;
    }
}*/
//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
/*public class Solution {
    public int Add(int num1,int num2) {
        BigInteger bi1 = new BigInteger(String.valueOf(num1));
        BigInteger bi2 = new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();
    }
}*/
//数组中重复的数字
/*public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	StringBuffer sb = new StringBuffer();
    	for(int i =0;i<length;i++) {
    		sb.append(numbers[i]+"");
    	}
    	for(int j=0;j<length;j++) {
    		if(sb.indexOf(numbers[j]+"")!=sb.lastIndexOf(numbers[j]+"")) {
    			duplication[0] = numbers[j];
    			return true;
    		}
    	}
    return false;
    }
}*/
//请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
public class Solution {
	int[] hashtable = new int[256];
	StringBuffer s = new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
      s.append(ch);
      if(hashtable[ch]==0)
    	  hashtable[ch]=1;
      else
    	  hashtable[ch]+=1;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    char[] str =s.toString().toCharArray();
    for(char c:str) {
    	if(hashtable[c]==1)
    		return c;
    }
    return '#';
    }
}