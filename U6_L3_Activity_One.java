public class U6_L3_Activity_One
{
  public static String findShortest(String[] words)
  {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;

    for(int i = 0; i < words.length; i++) {
      int t = words[i].length();
      if(t < min)
      {
        min = t;
        minIndex = i;
      }
    }
    return words[minIndex];
  }  
}