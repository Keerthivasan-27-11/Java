package myprojects;
class Constructor1 {
	int a;
	Constructor1(){
		System.out.println("This is the default constructor");
	}
	Constructor1(int a,String str){
		System.out.println("this is parameterized constructor a="+a+ ", string str="+str);
	}
	Constructor1(double d,int i){
		System.out.println("This double value is d="+d+" the int value i="+i);
	}
	public static void main(String[] args) {
		Constructor1 f=new Constructor1();
		Constructor1 k=new Constructor1(1555,"java");
		Constructor1 j=new Constructor1(2012,"javascript");
		Constructor1 i=new Constructor1(10523.054,1845);
	}


}
