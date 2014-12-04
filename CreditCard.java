public class CreditCard{
  
  public String verify(String num){
    int evenSum = 0;
    int oddSum = 0;
    for (int n=0; n < 15; n+=2){
      int evenNum = Integer.parseInt(num.substring(n+1,n+2));
      int doubleSum = evenNum * 2;
        if (doubleSum > 9) doubleSum = (doubleSum-10)+1;
        evenSum +=doubleSum;
    }
    for (int n=0; n < 16; n+=2){
      int oddNum = Integer.parseInt(num.substring(n,n+1));
      oddSum += oddNum;
    }
    if ((evenSum+oddSum) % 10 == 0){
      return "Yes";
    }
    else
      return "No";
  }
  
  public int findType(String num1){
    if (num1.substring(0,2).equals("51") || num1.substring(0,2).equals("52") || num1.substring(0,2).equals("53") || num1.substring(0,2).equals("54")) return 1;
        else if (num1.substring(0,1).equals("4")) return 2;
        else if (num1.substring(0,2).equals("34") || num1.substring(0,2).equals("37")) return 3;
        else if (num1.substring(0,4).equals("6011")) return 4;
        else if (num1.substring(0,2).equals("36") || num1.substring(0,2).equals("38")) return 5;
        else if (num1.substring(0,3).equals("301") || num1.substring(0,3).equals("302") || num1.substring(0,3).equals("303") || num1.substring(0,3).equals("304") || num1.substring(0,3).equals("305")) return 5;
        else return 0;
  }
  
  
}