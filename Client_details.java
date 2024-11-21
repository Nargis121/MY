/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.system;

/**
 *
 * @author user
 */
class Client_details {
    String name;
    String password;
    String repassword;
    String address;
    String contact;
    String email;

    

    public Client_details(String name, String password, String repassword, String address, String contact, String email) {
        this.name = name;
        this.password = password;
        this.repassword = repassword;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRepassword() {
        return repassword;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }
}
