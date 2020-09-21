package ru.mirea.INBO0219.Ira1ex3;

public class author {
    private String Name;
    private String Email;
    private char Gender;

    public Author(String name, String email, char gender) {
        this.Name = name;
        this.Email = email;
        this.Gender = gender;
    }

    public String GetName(String name) {
        return name;
    }

    public String GetEmail(String email) {
        return email;
    }

    public void SetEmail(String email) {
        this.Email = email;
    }

    public char GetGender() {
        return this.Gender;
    }

    public String toString() {
        return this.Name + this.Email + this.Gender;
    }

    public void out() {
        System.out.println("Имя - " + this.Name + "; Почта - " + this.Email + "; Гендер - " + this.Gender + ";");
    }


}
