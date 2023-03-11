public class User {
    private int UserId;
    private String Name;
    private int Age;
    private String Email;
    private String Gender;

    // static attribute increment when new user is added
    private static int id = 0;

    // constructors
    User(String name){
        this(name, 0, "", "");
    }
    User(String name, int age){
        this(name, age, "", "");
    }
    User(String name, int age, String email) {
        this(name, age, email, "");
    }
    User(String name, int age, String email, String gender){
        this.Name = name;
        this.Age = age;
        this.Email = email;
        this.Gender = gender;
        id += 1;
        this.UserId = id;
    }

    // to get number of clients I have on the system
    public static int UsersNumber(){
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

    public int getUserId() {
        return UserId;
    }
}
