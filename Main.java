import java.util.*;
// Given a number n, find the smallest number that has same set of digits as n and is greater than n. If n is the greatest possible number with its set of digits, then print “not possible”.

// Examples: 
// For simplicity of implementation, we have considered input number as a string. 

// Input:  n = "218765"
// Output: "251678"

// Input:  n = "1234"
// Output: "1243"

// Input: n = "4321"
// Output: "Not Possible"

// Input: n = "534976"
// Output: "536479"
class Main {

    public String lexicographicallygreaterString(String raw){
    int[] num = new int[raw.length()];

    for (int i = 0; i < raw.length(); i++){
        num[i] = raw.charAt(i) - '0';
    }
      System.out.println(Arrays.toString(num));
      int j; int n= num.length;
      for(j= n-1; j>0; j--){
        if(num[j]>num[j-1])
          break;
      }
      if(j==0)
        return "Not Possible";
      {
        int x = num[j-1],min = j;
        
        for(int k=j+1;k<n;k++){
          if(num[k] < num[min])
            min = k;
        }
        swap(num, j-1, min);

        Arrays.sort(num, j, n);
        
      }
    return Arrays.toString(num);
    
  }

  public void swap(int[] num, int i, int j){
    int temp = num[i];
    num[i] =num[j];
    num[j] = temp;
  }
  
  public static void main(String[] args) {
    Main nw = new Main();
   String result =  nw.lexicographicallygreaterString("534976");
    System.out.println(result);
  }
}