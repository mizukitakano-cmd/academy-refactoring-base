// 問1.以下の不適切なメソッド名を修正してください。
public class AssignmentTask {

  /*
   * パターン1:何のメッセージを取得したいか分からない。
   */
  public void intoroduce(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン2:冗長な名前
   */
  public void sayHello(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン3:動詞を使用しているが何の処理をしたいのか具体性が分からない。
   */
  public void printUserName(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン4:returnを使用しているのでgetが抜けてる
   */
  public String getUserName(User user) {
    return user.getName();
  }

  /*
   * パターン5:アンダーバーは使わない
   */
  public void printUesrInfo(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン6:予約語をつかってる
   */
  public User createNewUser(String name) {
    return new User(name);
  }

  /*
   * パターン7:動詞じゃなくて形容詞×
   */
  public boolean isActive(User user) {
    return user.isActive();
  }

}