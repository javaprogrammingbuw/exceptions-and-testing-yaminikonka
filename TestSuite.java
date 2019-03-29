import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {

  /*Initialize*/
  // Test owner
  @Test public static void InitTest1() {
    // define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    //test
    assertEquals(owner.name,account.getOwner().name, 0.001);
  }

 
  @Test public static void InitTest2() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    //test
    assertEquals(1000.00,account.getBalance(),0.001);
  }

  @Test public static void InitTest3() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00,500.00);
    //changes
    account.deposit(200.00,account.getSecurityNumber());
    //test
    assertEquals(1200.00,account.getBalance(),0.001);
  }

  @Test public static void InitTest4() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00,500.00);
    //changes
      account.withdraw(700.00,account.getSecurityNumber());
    //test
    assertEquals(300.00,account.getBalance(),0.001);
  }
  @Test public static void InitTest5() {
    //define
    Person owner = new Person("John Doe");
    Person anotherowner=new Person("Mounika");
    BankAccount account = new BankAccount(owner, 1000.00,500.00);
    BankAccount remote=new BankAccount(anotherowner,1500.00);
    //changes
      account.transfer(remote,300.00,account.getSecurityNumber());
    //test
    assertEquals(700.00,account.getBalance(),0.001);
  }

  @Test public static void InitTest6() {
    //define
    Person owner = new Person("John Doe");
    Person anotherowner=new Person("Mounika");
    BankAccount account = new BankAccount(owner, 1000.00,500.00);
    BankAccount remote=new BankAccount(anotherowner,1500.00);
    //changes
      account.transfer(remote,300.00,account.getSecurityNumber());
    //test
    assertEquals(1800.00,remote.getBalance(),0.001);
  }

  @Test public static void InitTest7() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00,2000.00);
    //test
    assertEquals(2000.00,account.getLimit(),0.001);
  }

  @Test public static void InitTest8() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00,2000.00);
    //changes
    account.withdraw(2500.00,account.getSecurityNumber());
    //test
    assertEquals(-1500,account.getBalance(),0.001);
  }

  @Test public static void InitTest9() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    System.out.println(account.getIBAN());
    //test
    assertEquals(22,account.getIBAN().length(),0.001);
  }

  @Test public static void InitTest10() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    boolean result = (account.getSecurityNumber()<1000000) && (account.getSecurityNumber()>10000);
    //test
    assertEquals(true,result,0.001);
  }

  @Test public static void InitTest11() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    //test
    assertEquals(0.00,account.getLimit(),0.001);
  }

  @Test public static void InitTest12() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00,5000.00);
    //test
    assertEquals(5000.00,account.getLimit(),0.001);
  }

  @Test public static void InitTest13() {
    //define
    Person owner = new Person("John Doe");
    Person holder= new Person("Yamini");
    BankAccount account = new BankAccount(owner, 1000.00,2000.00);
    BankAccount studentAccount= new BankAccount(holder,5000.00,1000.00);
    //changes
    account.transfer(studentAccount,600.00,account.getSecurityNumber());
    account.deposit(800.00,account.getSecurityNumber());
    //test
    assertEquals(1200.00,account.getBalance(),0.001);
  }

  @Test public static void InitTest14() {
    //define
    Person owner = new Person("John Doe");
    Person holder= new Person("Yamini");
    BankAccount account = new BankAccount(owner, 1000.00,2000.00);
    BankAccount studentAccount= new BankAccount(holder,5000.00,1000.00);
    //changes
    account.transfer(studentAccount,600.00,account.getSecurityNumber());
    account.deposit(800.00,account.getSecurityNumber());
    //test
    assertEquals(5600.00,studentAccount.getBalance(),0.001);
  }

  @Test public static void InitTest15() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 2000.00);
    //changes
    account.deposit(700.00,account.getSecurityNumber());
    account.withdraw(1200.00,account.getSecurityNumber());
    account.deposit(500.00,account.getSecurityNumber());
    account.deposit(2100.00,account.getSecurityNumber());
    //test
    assertEquals(4100.00,account.getBalance(),0.001);
  }
}
