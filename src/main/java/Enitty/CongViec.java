package Enitty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class CongViec implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1195313660572920623L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaCongViec")
	private int maCongViec;
	@Column(name = "TenCongViec", columnDefinition = "nvarchar(30)",nullable = false)
	private String tenCongViec;
	@Column(name = "NgayNhanCongViec" , columnDefinition = "date")
	private LocalDate ngayNhanCongViec;
	@Column(name = "HanChot", columnDefinition = "date")
	private LocalDate hanChot;
	@Column(name = "TrangThai", columnDefinition = "nvarchar(30)")
	private String trangThai;
	
	@ManyToOne
	@JoinColumn(name = "MaDuAn")
	private DuAn duAn;
	
	@ManyToMany
	@JoinTable(name="NhanVienCOngViec", joinColumns = @JoinColumn(name="MaCongViec", referencedColumnName = "MaCongViec"),
				inverseJoinColumns = @JoinColumn(name="MaNhanVien", referencedColumnName = "MaNhanVien"))
	private Set<NhanVienLapTrinh>dsnvlt;

	public int getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(int maCongViec) {
		this.maCongViec = maCongViec;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public LocalDate getNgayNhanCongViec() {
		return ngayNhanCongViec;
	}

	public void setNgayNhanCongViec(LocalDate ngayNhanCongViec) {
		this.ngayNhanCongViec = ngayNhanCongViec;
	}

	public LocalDate getHanChot() {
		return hanChot;
	}

	public void setHanChot(LocalDate hanChot) {
		this.hanChot = hanChot;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
	public CongViec() {
		// TODO Auto-generated constructor stub
	}

	public CongViec(String tenCongViec, LocalDate ngayNhanCongViec, LocalDate hanChot, String trangThai) {
		super();
		this.tenCongViec = tenCongViec;
		this.ngayNhanCongViec = ngayNhanCongViec;
		this.hanChot = hanChot;
		this.trangThai = trangThai;
	}
	
}
