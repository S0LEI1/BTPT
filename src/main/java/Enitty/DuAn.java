package Enitty;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class DuAn implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6513425233439515824L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaDuAn")
	private int maDuAn;
	@Column(name = "TenDuAn", columnDefinition = "nvarchar(50)",nullable = false)
	private String tenDuAn;
	@Column(name = "NgayGiao", columnDefinition = "date")
	private LocalDate ngayGiao;
	@Column(name = "NgayHoanThanh", columnDefinition = "date")
	private LocalDate ngayHoanThanh;
	
	@ManyToOne
	@JoinColumn(name = "MaNguoiQuanLy")
	private QuanLyDuAn quanLyDuAn;

	public int getMaDuAn() {
		return maDuAn;
	}

	public void setMaDuAn(int maDuAn) {
		this.maDuAn = maDuAn;
	}

	public String getTenDuAn() {
		return tenDuAn;
	}

	public void setTenDuAn(String tenDuAn) {
		this.tenDuAn = tenDuAn;
	}

	public LocalDate getNgayGiao() {
		return ngayGiao;
	}

	public void setNgayGiao(LocalDate ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

	public LocalDate getNgayHoanThanh() {
		return ngayHoanThanh;
	}

	public void setNgayHoanThanh(LocalDate ngayHoanThanh) {
		this.ngayHoanThanh = ngayHoanThanh;
	}

	public DuAn( String tenDuAn, LocalDate ngayGiao, LocalDate ngayHoanThanh) {
		super();
		this.tenDuAn = tenDuAn;
		this.ngayGiao = ngayGiao;
		this.ngayHoanThanh = ngayHoanThanh;
	}
	
	public DuAn() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DuAn [maDuAn=" + maDuAn + ", tenDuAn=" + tenDuAn + ", ngayGiao=" + ngayGiao + ", ngayHoanThanh="
				+ ngayHoanThanh + "]";
	}
	
}
