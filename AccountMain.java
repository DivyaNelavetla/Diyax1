package bank.ui;

import bank.entity.Account;

public class AccountMain {
	public static void main(String[] args) {
		Account a[] = new Account[4];
		a[0] = new Account(01, "A", 100.0);
		a[1] = new Account(02, "B", 200);
		a[2] = new Account(03, "C", 300);
		a[3] = new Account(04, "D", 400);
		a[0].addBalance(50);

		a[1].transferamt(a[2], 100);

		for (int i = 0; i < 4; i++) {

			System.out.println("Id=" + a[i].getId() + "  Name=" + a[i].getName() + "  Balance=" + a[i].getBalance());
		}

	}
}