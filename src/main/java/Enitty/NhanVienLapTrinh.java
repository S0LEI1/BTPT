package Enitty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
@Entity
public class NhanVienLapTrinh extends NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5845252326381582136L;
	@Column(name = "NgonNguLapTrinh", columnDefinition = "nvarchar(50)")
	private Set<String>ngonNguLapTrinh;
	
	
	@ManyToMany(mappedBy = "dsnvlt")
	private Set<CongViec>cv;
	

	public Set<String> getNgonNguLapTrinh() {
		return ngonNguLapTrinh;
	}


	public void setNgonNguLapTrinh(Set<String> ngonNguLapTrinh) {
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}


	public NhanVienLapTrinh(String hoVaTen, LocalDate ngaySinh, String sdt, String phongBan,
			Set<String> ngonNguLapTrinh) {
		super(hoVaTen, ngaySinh, sdt);
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}
	
	public NhanVienLapTrinh() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "NhanVienLapTrinh [ngonNguLapTrinh=" + ngonNguLapTrinh + "]";
	}
	
}
