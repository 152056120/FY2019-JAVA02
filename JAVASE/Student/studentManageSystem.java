import java.util.Scanner;




 public class studentManageSystem{
	public static void main(String[] args){
		welcome();
		
		Manager[] managers = new Manager[4];//局部变量
		initData(managers);//数据初始化
		operation(managers);
		
	}

	public static void initData(Manager[] managers){
		Manager manager = new Manager("admin","admin");
		managers[0] = manager;
	}
	
	public static void operation(Manager[] managers){
		Scanner s=new Scanner(System.in); 
		
		//s.nextLine();
		System.out.println("请选择");
		int operation = s.nextInt();
		if(operation == 1){
			//登陆
			login(managers);
		}else if(operation == 2){
			//退出
			System.exit(0);
		}else{
			System.out.println("您输入的有误，请从新输入。");
			operation(managers);//递归调用
		}
	}
	
	public static void login(Manager[] managers){
		System.out.println("欢迎登陆");
		
		Scanner s=new Scanner(System.in); 
		System.out.println("请输入用户名：");
		String username = s.nextLine();


 		
		System.out.println("请输入密码：");
		String password = s.nextLine();
		
		
		
		//判断密码是否正确
		for(int i = 0;i < managers.length;i++){
			Manager manager = managers[i];
			if(manager == null){
				continue;
			}
			
			if(username.equals(manager.username) && password.equals(manager.password)){
				System.out.println("欢迎您" + username);
				break;
			}
		}
	}
	
	public static void welcome(){
		System.out.println("==========欢迎登陆==========");
		System.out.println("1、登陆   2、退出");
		System.out.println("----------------------------");
	}
}
class Manager{
	public String username;
	public String password;
	
	public Manager(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password; 
	}
}
class Student{
	public int id;
	public String name;
	public String sex;
	public int age;
	public String address;
	public String _class;
	public String phone;
	public String email;
	
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
}