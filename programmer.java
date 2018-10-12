public class programmer extends karyawan{

	// method Overriding
	public void gajikaryawan(int uang){
		if (uang <= 90){
			System.out.println("anda mendapatkan gaji sebesar = "+uang);
	}else{
		System.out.println("maaf gaji anda melebihi ketentuan");
	}

}
}