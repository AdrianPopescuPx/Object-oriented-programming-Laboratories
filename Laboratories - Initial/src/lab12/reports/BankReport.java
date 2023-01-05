package lab12.reports;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lab12.entities.*;

public class BankReport {
    // Customer = Employee of the Business
    // Business = a client of the Bank
    // Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        return bank.getClients().size();
    }

    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank
        int sum = 0;
        for(Business c : bank.getClients()) {
            Iterator<Employee> iterator = c.getEmployees().iterator();
            while(iterator.hasNext()) {
                sum += iterator.next().getAccounts().size();
            }
        }
        return sum;
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Display the set of customers in alphabetical order
        SortedSet<Employee> finalSet = new TreeSet<>();
        for(Business c : bank.getClients()) {
            Set<Employee> unmodifiableEmployees = Set.copyOf(c.getEmployees());
            Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
            SortedSet<Employee> sortedEmployees = new TreeSet<>(nameComparator);
            sortedEmployees.addAll(unmodifiableEmployees);
            finalSet.addAll(sortedEmployees);
        }
        return finalSet;
    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances
        Double sum = 0.0;
        for(Business c : bank.getClients()) {
            Iterator<Employee> iterator = c.getEmployees().iterator();
            while(iterator.hasNext()) {
                for(Account s : iterator.next().getAccounts()) {
                    sum += s.getBalance();
                }
            }
        }
        return sum;
    }

    public static SortedSet<Employee> getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance
        return null;
    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts

        return null;
    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities

        return null;
    }

    public static Project getProjectWorkedOnByMostCustomers(Bank bank) {
        // Get all the projects from the employees and find the most repeated one in the list

        return null;
    }

    public static Gender getGenderWhoWorkedOnMostProjects(Bank bank) {
        // Get all the pairs <gender, project> or <gender, List<project>>, then reduce the array to only one pair
        // of each gender and retrieve the one with most counted projects (you are expected to count duplicates as well).

        return null;
    }
}
