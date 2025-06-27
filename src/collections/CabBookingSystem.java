package collections;

import java.util.*;

public class CabBookingSystem {
	public static void main(String[] args) {

		// List of available drivers (allows order, duplicates if needed)
		List<String> availableDrivers = new ArrayList<>();
		availableDrivers.add("Driver1");
		availableDrivers.add("Driver2");
		availableDrivers.add("Driver3");

		// Set to track active bookings (prevents duplicate customer bookings)
		Set<String> activeCustomers = new HashSet<>();

		// Map to assign customers to drivers
		Map<String, String> customerDriverMap = new HashMap<>();

		// Simulate bookings
		bookCab("Alice", availableDrivers, activeCustomers, customerDriverMap);
		bookCab("Bob", availableDrivers, activeCustomers, customerDriverMap);
		bookCab("Alice", availableDrivers, activeCustomers, customerDriverMap); // duplicate
		bookCab("Rahul", availableDrivers, activeCustomers, customerDriverMap);
		bookCab("Virat", availableDrivers, activeCustomers, customerDriverMap);

		// Print assignments
		System.out.println("\nCurrent Bookings:");
		for (Map.Entry<String, String> entry : customerDriverMap.entrySet()) {
			System.out.println("Customer: " + entry.getKey() + " Driver: " + entry.getValue());
		}
	}

	public static void bookCab(String customerName,
			List<String> drivers,
			Set<String> activeCustomers,
			Map<String, String> bookings) {
		if (activeCustomers.contains(customerName)) {
			System.out.println(customerName + " already booked a cab!");
		} else if (!drivers.isEmpty()) {
			String assignedDriver = drivers.remove(0); // FIFO
			activeCustomers.add(customerName);
			bookings.put(customerName, assignedDriver);
			System.out.println(customerName + " assigned to " + assignedDriver);
		} else {
			System.out.println("No drivers available for " + customerName);
		}
	}
}
