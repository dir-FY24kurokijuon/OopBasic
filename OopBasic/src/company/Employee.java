package company;

//lesson4.3.7 追記・implements Workable
//lesson4.4.3 追記・abstract（抽象クラスに変更）
public abstract class Employee implements Workable {
    //フィールド
    //lesson4.4.3 追記・２行目private→protectedに変更//派生クラスで使用するのでアクセスレベルを変更
    protected final String name;
    protected final Department department;
    private final String position;
    private final int employeedId;
    
    //コンストラクター
    public Employee(String name, Department department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeedId = employeeId;
    }
    
    //報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }
    
    //報告メソッド（オーバーロード）
    public void report() {
        report(1);
    }
    
    //会議に参加するメソッド
    //abstractを追記し、実装をもたない抽象メソッドに変更→派生クラスでの実装が強制される
    public abstract void joinMeeting();
    
    //lesson4.4.3 追記・(抽象メソッドに変更）
    //(元）public void joinMeeting() {
        //department.meeting();
       // System.out.println("→上記の会議に参加します。部署：" + department.getName() + "名前：" + name);     
   // }
    
    //lesson4.3.7　追記
    //働くメソッド【work()】を実装
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前：" + name + slogan);
        
    }
}
