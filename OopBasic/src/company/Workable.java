package company;

//Workableインターフェイスの定義
//インターフェイスで定義したフィールドは【public static final】
//抽象メソッドの定義＝メソッドの（名前、戻り値の型、引数の数と型）だけを定義して実装を書かない

public interface Workable {
   String slogan = "頑張ろう！";
   void work();
}
