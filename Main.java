package arraylistwithclasses;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> musteri = new ArrayList<>();
		musteri.add(new Customer(9876, "Zeynep", "Seratlı"));
		musteri.add(new Customer(9875, "Elif", "Seratlı"));
		musteri.add(new Customer(9874, "Çınar", "Seratlı"));
		musteri.add(new Customer(9873, "Gökçen", "Seratlı"));
		
		for (Customer musteriler : musteri) {
			System.out.println(musteriler.id +" "+ musteriler.firstName +" "+  musteriler.lastNameString);
		}
			
		}
	}


