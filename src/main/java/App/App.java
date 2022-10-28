package App;

import Connect.MyEMFactory;
import jakarta.persistence.EntityManagerFactory;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory ef = MyEMFactory.getInstance().getEntityManagerFactory();
	}
}
