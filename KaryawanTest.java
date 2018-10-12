public class KaryawanTest{
	public static void main(String[] args) {
		designer a = new designer();
		a.namakaryawan("Hilda Ismayanti");
		a.alamatkaryawan("jl. soekarno hatta no 18");
		a.gajikaryawan(70);
		System.out.println();

		programmer b = new programmer();
		b.namakaryawan("Rani komala");
		b.alamatkaryawan("jl. MT Thamrin hatta no 27");
		b.gajikaryawan(90);
		System.out.println();

		ProjectManager c = new ProjectManager();
		c.namakaryawan("Roni wijaya");
		c.alamatkaryawan("jl. soekarno hatta no 26");
		c.gajikaryawan(100);
	}
}