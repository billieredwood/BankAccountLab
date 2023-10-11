import org.junit.jupiter.api.Test;
import java.time.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

   @Test
   void canGetFirstName() {
      // given
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      // when
      String result = bankAccount.getFirstName();
      // then
      String expected = "Billie";
      assertThat(result).isEqualTo(expected);
   }

   @Test
   void canSetFirstName() {
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount.setFirstName("Smith");
      String firstName = bankAccount.getFirstName();
      assertThat(firstName).isEqualTo("Smith");
   }


   @Test
   void canGetLastName() {
      // given
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      // when
      String result = bankAccount.getLastName();
      // then
      String expected = "Redwood";
      assertThat(result).isEqualTo(expected);
   }

   @Test
   void canSetLastName() {
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount.setLastName("Smith");
      String lastName = bankAccount.getLastName();
      assertThat(lastName).isEqualTo("Smith");
   }

   @Test
   void canGetDateBirth() {
      // given
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      // when
      LocalDate result = bankAccount.getDateOfBirth();
      // then
      String expected = "2023-10-11";
      assertThat(result).isEqualTo(expected);
   }

   @Test
   void canSetDateOfBirth() {
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount.setDateOfBirth(LocalDate.of(2022, 10, 02));
      LocalDate dateOfBirth = bankAccount.getDateOfBirth();
      assertThat(dateOfBirth).isEqualTo("2022-10-02");

   }

   @Test
   void canGetAccountNumber() {
      // given
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      // when
      int result = bankAccount.getAccountNumber();
      // then
      int expected = 12345678;
      assertThat(result).isEqualTo(expected);
   }

   @Test
   void canSetAccountNumber() {
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount.setAccountNumber(12345667);
      int accountNumber = bankAccount.getAccountNumber();
      assertThat(accountNumber).isEqualTo(12345667);
   }

   @Test
   void canGetBalance() {
      // given
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      // when
      double result = bankAccount.getBalance();
      // then
      double expected = 0.0;
      assertThat(result).isEqualTo(expected);
   }

   @Test
   void canSetBalance() {
      BankAccount bankAccount = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount.setBalance(1.0);
      double balance = bankAccount.getBalance();
      assertThat(balance).isEqualTo(1.0);
   }

   @Test
   void doesDepositWork() {
      BankAccount bankAccount1 = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount1.setBalance(bankAccount1.deposit(10.00));
      double updatedBalance = bankAccount1.getBalance();
      assertThat(updatedBalance).isEqualTo(10.00);
   }
   @Test
   void doesWithdrawWork() {
      BankAccount bankAccount1 = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount1.setBalance(bankAccount1.deposit(172.00));
      bankAccount1.setBalance(bankAccount1.withdraw(10.00));
      double updatedBalance = bankAccount1.getBalance();
      assertThat(updatedBalance).isEqualTo(162.00);
   }
   @Test
   void doesPayInterest() {
      BankAccount bankAccount1 = new BankAccount("Billie", "Redwood", LocalDate.of(2023, 10, 11), 12345678);
      bankAccount1.setBalance(bankAccount1.deposit(150));
      bankAccount1.setBalance(bankAccount1.payInterest());
      double updatedBalance = bankAccount1.getBalance();
      assertThat(updatedBalance).isEqualTo(157.5);
   }

   }



// public String