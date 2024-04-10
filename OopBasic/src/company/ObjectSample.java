package company;

public class ObjectSample {

    public static void main(String[] args) {
         
        //インスタンスの作成（lesson4.4.6変更）
        var salesDepartment = new Department("営業部", "xx", 1000000);
        Employee sales = new Sales("鈴木",salesDepartment,"課長", 100);
       
        //変数名を【salesDepartment】と【employee】に変更
        //【sales】はvarではなく明示的にEmployeeクラスで定義し、Salesオブジェクトを代入（抽象クラスを使用したポリモーフィズム）
        //同時に佐藤さんも抽象クラスを使用したポリモーフィズムになっている
        
        //インスタンスの作成(変更前）
        //var department = new Department("営業部", "XX", 1000000);
        //var employee = new Employee("鈴木", department, "課長", 100);
        
        
        //インスタンスメソッドの呼び出し（lesson4.4.6変更）
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        //インスタンスメソッドの呼び出し（変更前）
        //employee.report();
        //employee.report(2);
        //employee.joinMeeting();
        
        
        //１行空ける
        System.out.println("");
        
        //インスタンスの作成 
        //lesson4.2.4で２行目を「new Employee」から「「new Engineer」に変更＋"Java"を追加
        //Engineerクラスのインスタンス作成、引数はEngineerクラスのコンストラクターに合わせる
        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");
        
        //インスタンスメソッドの呼び出し
        //report()で基底クラスのメソッド呼び出し、joinMeeting()でオーバーライドの結果が出力
        //developSoftware()は、派生クラスでていぎしたメソッドが呼び出せることを確認
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware(); //lesson4.2.4で追記
        
        //lesson4.2.5（ポリモーフィズム）で追記、PM佐藤さんを追加
        //ポリモーフィズムの確認
        //varではなく明示的にEmployeeクラスを指定、Engineerオブジェクトを代入
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        //インスタンスメソッドの呼び出し
        //基底クラスでも定義しているメソッドは同じ名前で呼び出せる
        projectManager.report();
        projectManager.joinMeeting();
        
        //派生クラスで定義したメソッドは、オブジェクトが派生クラスかどうかをチェックし呼び出す
        //if(){　でチェック、【instanceof】でprojectManagerがEngineerクラスかを判定
        if(projectManager instanceof Engineer) {
            //判定が【ture】であれば、developSoftwareメソッドを呼び出す＝キャスト（型の変更操作）
            ((Engineer) projectManager).developSoftware();
        }
        
        
        //lesson4.3.8　追記
        
        System.out.println("");
        
        //アルバイトインスタンスの作成
        //lesson4.4.6 部署の変数名を【salesDepartment】に変更
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        //実装したメソッドの呼び出し
        //worlableインターフェイスにキャストすることで、統一操作が行える
        //lesson4.4.6 １行目の変数名を【sales】に変更
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
        
        
    }
    

}
