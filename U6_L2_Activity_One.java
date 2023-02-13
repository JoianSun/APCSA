public class U6_L2_Activity_One
{
  // Write your containsNeg method here
  public static boolean containsNeg(double[] arr)
  {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
          return true;
      }
    }
    return false;
  }
}
