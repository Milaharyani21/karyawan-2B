public class karyawan {

	String nama;
	String alamat;
	private int gaji;
	public int getGaji(){
		return this.gaji;
	}
	public void setGaji(int uang){
		this.gaji=uang;
	}
	public void namakaryawan(String nama){
		System.out.println("Nama="+nama);
	}

	public void alamatkaryawan(String alamat){
		System.out.println("alamat=" +alamat);	
	}

	public void gajikaryawan(int gaji){
		System.out.println("Gaji=" +gaji);		
	}
}