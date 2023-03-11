public class AdminUser extends User{
    private boolean Admin;

    public AdminUser(String name, int age, String email, String gender){
        super(name, age, email, gender);
        this.Admin = true;
    }

    public void addUser(){
    }

    public void addAdmin(){
    }

    public void addBankWorker(){
    }

    public void displayUsers(){
    }

    public int usersNumber(){
        return User.UsersNumber();
    }

    public int clientsNumber(){
        return Client.ClientsNumber();
    }

    // function to make a specific user an admin
    public void setAdmin(){
        if (!this.isAdmin()){
            Admin = true;
        }else{
            System.out.println("User Is Already Admin");
        }
    }

    // function to make a specific user an admin
    public void removeAdmin(){
        if (this.isAdmin()){
            Admin = false;
        }else{
            System.out.println("User Is Already Not Admin");
        }
    }

    // function that answer that this user is an admin or not
    public boolean isAdmin(){
        try {
            return Admin;
        }
        catch (Exception ignored){
            return false;
        }
    }
}