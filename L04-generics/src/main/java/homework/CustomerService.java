package homework;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    private final TreeMap<Customer, String> customMap = new TreeMap<>(Comparator.comparing(Customer::getScores));

    private Map.Entry<Customer, String> getEntry(Map.Entry<Customer, String> entry) {
        if (entry == null) {
            return null;
        } else {
            return new Map.Entry<>() {
                @Override
                public Customer getKey() {
                    Customer innerCustomer = entry.getKey();
                    return new Customer(innerCustomer.getId(), innerCustomer.getName(), innerCustomer.getScores());
                }

                @Override
                public String getValue() {
                    return entry.getValue();
                }

                @Override
                public String setValue(String value) {
                    return "";
                }
            };
        }
    }

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> smallestEntry = customMap.firstEntry();
        return getEntry(smallestEntry);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> nextEntry = customMap.higherEntry(customer);
        return getEntry(nextEntry);
    }

    public void add(Customer customer, String data) {
        customMap.put(customer, data);
    }
}
