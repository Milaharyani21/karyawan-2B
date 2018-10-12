public class designer extends karyawan{

	// method Overriding
	public void gajikaryawan(int uang){
		if (uang <= 70){
			System.out.println("anda mendapatkan gaji sebesar = "+uang);
	}else{
		System.out.println("maaf gaji anda melebihi ketentuan");
	}
}

}