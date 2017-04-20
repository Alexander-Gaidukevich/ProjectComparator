/**
 *
 */
public class Man {
    private String fio;
    private int age;
    private int phone;
    private String passportDate;

    public Man(String fio, int age, int phone, String passportDate) {
        this.fio = fio;
        this.age = age;
        this.phone = phone;
        this.passportDate = passportDate;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(String passportDate) {
        this.passportDate = passportDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;

        if (age != man.age) return false;
        if (phone != man.phone) return false;
        if (!fio.equals(man.fio)) return false;
        return passportDate.equals(man.passportDate);
    }

    @Override
    public int hashCode() {
        int result = fio.hashCode();
        result = 31 * result + age;
        result = 31 * result + phone;
        result = 31 * result + passportDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Man{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", passportDate='" + passportDate + '\'' +
                '}';
    }
}
