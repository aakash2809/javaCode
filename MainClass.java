class A{
	int x=5;//instance variable
	public void showXversion() {
		int x=9;//local variable
		System.out.println("instance x= "+this.x + "local x=" +x);
	}
}

//------------------------------------------------------------------------------
class One {
	public void display() {
		System.out.println("One");
	}
}

//inheritance
class Two extends One {
	@Override
	public void display() {
		System.out.println("Two");
	}
	public int add(int x, int y){
		return x+y;
	}
	//Overload
	public double add(int x,int y,int z) {
		return x+y+z;
	}
}
//-------------------------------------------
//encapsulation 
class EncapDemo {
	private String name;//data hiding
	public String getName() {
	return name;
	}
	public void setName(String newName) {
		name = newName;
	}
}

//-----------------------------------------------------------------------------------------
//abstraction
abstract class TwoWheeler {
	public abstract void run();
	}
class Bajaj extends TwoWheeler{
	public void run(){
	System.out.println("\nbike is Running..");
	}
}
//---------------------------------------------------------------------------------------------
class MainClass {
	public static void main(String[] args) {
		A aa=new A();//Object Creation
		aa.showXversion();//method calling
		One a=new One();//Object creation
		a.display();
		Two b=new Two();
		b.display();
		System.out.println(b.add(4,2));
		System.out.println(b.add(4,2,9)); //polymorphism
		EncapDemo encap = new EncapDemo();
		encap.setName("Aakash");
		System.out.print("Name : " + encap.getName() );
		TwoWheeler test = new Bajaj();	
		test.run();
	}
}
