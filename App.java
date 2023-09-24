public class App 
{
	private int uid;
	private String name;
	private String password;
	
	public App(int arg1,String arg2,String arg3)
	{
		uid=arg1;
		name=arg2;
		password=arg3;
	}
	public App(App arg)
	{
		this.uid=arg.uid;
		this.name=arg.name;
		this.password=arg.password;
	}
	public void show()
	{
		System.out.println("UID:"+ uid);
		System.out.println("username:"+ name);
		System.out.println("password:"+ password);
	}
	public static void main(String[] args)
	{
		App obj=new App(707,"akash","cetpa");
		obj.show();
	}
}
