package sec01_packageimport.EX0102_PackageImport;

public class PackageImport_1 {
	public static void main(String[] args) {
		// 按眉 积己
		// A a = new A();
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		// 干滚 劝侩
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
