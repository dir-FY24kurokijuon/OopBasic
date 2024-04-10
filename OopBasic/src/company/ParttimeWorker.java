package company;

//lesson4.3.5
//ParttimeWorkerクラスの定義、Workableインターフェイスを実装
//インターフェイスの仕組みが理解しやすいよう、Employeeとは継承関係にない独立クラスとして定義する

//インターフェイス実装クラスには【implements】で対象のインターフェイスを記述
public class ParttimeWorker implements Workable{
   //フィールド
   protected final String name;
   private final Department department;
   
   //コンストラクター
   public ParttimeWorker(String name, Department department) {
       this.name = name;
       this.department = department;   
}
   //働くメソッドを実装
   //インターフェイスで定義したメソッドをオーバーライド
   //インターフェイスのフィールド【slogan】も使用可能
   @Override
   public void work(){
       System.out.println("アルバイトとして働きます。名前：" + name + slogan);
   }   
}

