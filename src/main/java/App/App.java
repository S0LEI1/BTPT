package App;

import java.time.LocalDate;

import Bus.Service;
import Bus.ServiceImp;
import Connect.MyEMFactory;
import Enitty.DuAn;
import jakarta.persistence.EntityManagerFactory;

public class App {
	public static void main(String[] args) {
		Service s = new ServiceImp();
		DuAn d1 = new DuAn("Van Ngoc", LocalDate.of(2022, 10, 28), LocalDate.of(2022, 11, 28));

		s.add(d1);
	}
}
