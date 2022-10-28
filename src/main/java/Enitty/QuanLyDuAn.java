package Enitty;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
@Entity
public class QuanLyDuAn extends NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8001477131502831287L;
	@Column(name = "SoNamKinhNghiem")
	private int soNamKH;
	public int getSoNamKH() {
		return soNamKH;
	}
	public void setSoNamKH(int soNamKH) {
		this.soNamKH = soNamKH;
	}
	public QuanLyDuAn(String hoVaTen, LocalDate ngaySinh, String sdt, int soNamKH) {
		super(hoVaTen, ngaySinh, sdt);
		this.soNamKH = soNamKH;
	}
	public QuanLyDuAn() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuanLyDuAn [soNamKH=" + soNamKH + "]";
	}
	
}
