package company;

import java.security.PublicKey;

//Engineerクラスの定義
//extends 継承元クラス名　クラスを継承
public class Engineer extends Employee {
   String programmingLanguage;

//super()メソッドで、継承元のクラスのコンストラクターを呼び出す
   public Engineer(String name, Department department, String position, 
           int employeeId, String programmingLanguage) {
       super(name, department, position, employeeId);
       this.programmingLanguage = programmingLanguage;     
   }
   
   public void developSoftware() {
       System.out.println("ソフトウェアを開発します。名前：" + name + 
               "、プログラミング言語:" + programmingLanguage);
   }
   
   //会議に参加するメソッドをオーバーライド
   //Override＝基底（Employee）クラスから継承したメソッドを新しい振る舞いで再定義する
   //コンストラクターは不可、メソッドの（名前、戻り値の型、引数の型）一致、元のメソッドより高いアクセスレベルを持つ必要あり
   
   //@(アノテーション） プログラム開発・実行の際、特定の処理を行うための仕組み
   //@Overrideをつけると、メソッドが基底クラスのメソッドを正しくオーバーライドしてるかチェック
   @Override
   public void joinMeeting() {
       department.meeting();
       System.out.println("→技術的な準備を行い、上記の会議に参加します。名前:" + name);
   
       //lesson4.4.5 基盤クラスのjoinMeeting()メソッドが抽象メソッドに変更されたため、
       //super.joinMeeting();をdepartment.meeting();に変更
   }
   
   
}
