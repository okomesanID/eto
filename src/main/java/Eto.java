import java.util.Scanner;
 
public class Eto {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
 
    // 配列に干支を代入
    String[] eto = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
    int eto_num;
    
    do {
      System.out.print("あなたの生まれ年を西暦で入力してください。：");
      eto_num = stdIn.nextInt(); // ユーザーに入力を促す
    } while (eto_num < 0); // 入力された内容がマイナスの場合、11行目から繰り返す
 
    int result = (eto_num + 8) % 12; // 入力された年から干支を計算
    System.out.println("あなたの干支は「" + eto[result] + "」です。");
  }
}