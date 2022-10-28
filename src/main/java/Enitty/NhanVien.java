package Enitty;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1314342104520800104L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaNhanVien")
	protected int ma;
	@Column(name = "HoVaTen",columnDefinition = "nvarchar(30)",nullable = false)
	protected String hoVaTen;
	@Column(name = "NgaySinh", columnDefinition = "date")
	protected LocalDate ngaySinh;
	@Column(name = "SDT",columnDefinition = "varchar(10)")
	protected String sdt;
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String hoVaTen, LocalDate ngaySinh, String sdt) {
		super();
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "NhanVien [ma=" + ma + ", hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt  + "]";
	}
	 
}
