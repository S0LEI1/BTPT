package Bus;

import java.time.LocalDate;

import Dao.KhachHang_dao;
import Enitty.DuAn;

public class ServiceImp implements Service{
	KhachHang_dao kh_dao;
	@Override
	public boolean add(DuAn an) {
		return kh_dao.add(an);
	}

}
