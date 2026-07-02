// 問2.以下の不適切な変数名を修正してください。
public class VariableNaming {

  public void calculateNumbers() {
    /*
     * パターン1:アンダーバー×
     */
    int firstNumber = 10;
    int secondNumber = 20;

    /*
     * パターン2:変数の意味が分からない
     */
    int price = 5;
    int count = 3;

    /*
     * パターン3:予約語を使用してるため×
     */
    int totalNumber = 100;

    int totalResult = firstNumber + secondNumber;
    int sum = price + count + totalNumber;

    System.out.println(totalResult);
    System.out.println(sum);
  }
}
