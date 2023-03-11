import java.util.List;

public class Client {
    private int ClientId;
    private String Name;
    private int Age;
    private String Email;
    private String Gender;

    // this list of BankAccounts that user have if it's saving bank acc. or normal one
    List<BankAccount> BankAccounts;

    // static attribute increment when new client is added
    private static int id = 0;

    // constructors
    Client(String name){
        this(name, 0, "", "");
    }
    Client(String name, int age){
        this(name, age, "", "");
    }
    Client(String name, int age, String email) {
        this(name, age, email, "");
    }
    Client(String name, int age, String email, String gender){
        this.Name = name;
        this.Age = age;
        this.Email = email;
        this.Gender = gender;
        id += 1;
        this.ClientId = id;
    }

    // function to get index of specific bank acc. according to the data that user will enter it from the bank accounts list
    private int getIndexBankAccountInList(){
        return 0;
    }

    // this function put money in the back acc. to the specific bank acc.
    public void deposit(double inCome, int bankAccIndex){

    }

    // this function that withdraw money from the specific bank acc.
    public int withdraw(int amount, int bankAccIndex){
        return 0;
    }

    // to add this account to list of accounts of this user
    public void addBankAccountToUser(BankAccount account){
        BankAccounts.add(account);
    }


    // to get number of clients I have on the system
    public static int ClientsNumber(){
        return id;
    }

    // getters and setters of all data
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getClientId() {
        return ClientId;
    }
}
