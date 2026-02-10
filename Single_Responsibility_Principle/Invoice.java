package Single_Responsibility_Principle;

class Invoice {
	public double calculateTotal() {
		return 1000;
	}
}

class InvoicePrinter {
	public void print(Invoice invoice) {
		System.out.println("Printing invoice...");
	}
}

class InvoiceRepository {
	public void save(Invoice invoice) {
		System.out.println("Saving to DB...");
	}
}
