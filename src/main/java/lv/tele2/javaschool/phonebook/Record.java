package lv.tele2.javaschool.phonebook;

/**
 * Created by artudjat on 07/03/2017.
 */
public class Record {
    private static int nextId = 1;
    private int id;
    private String name;
    private String phone;
    private String email;

    public Record(){
        this.id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}' + "----------- " + nextId;
    }
}
