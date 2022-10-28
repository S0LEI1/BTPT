package Enitty;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class TaiKhoan implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5649877929404319108L;
	@Id
	@Column(name = "TenDangNhap")
	private String tenDangNhap;
	@Column(name = "MatKhau")
	private String matKhau;
	@Column(name="QuyenHan")
	private String quyenHan;
	@OneToOne
	@JoinColumn(name = "MaNhanVien", unique = true)
	private NhanVien nv;
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public TaiKhoan() {
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan(String tenDangNhap, String matKhau) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}
	@Override
	public String toString() {
		return "TaiKhoan [tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau +  "]";
	}
	
}
