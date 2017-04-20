/**
 *
 */
public class Factory implements Comparable<Factory> {
    private String name;
    private String city;
    private String addres;
    private String country;

    public Factory(String name, String city, String addres, String country) {
        this.name = name;
        this.city = city;
        this.addres = addres;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factory factory = (Factory) o;

        if (!name.equals(factory.name)) return false;
        if (!city.equals(factory.city)) return false;
        if (!addres.equals(factory.addres)) return false;
        return country.equals(factory.country);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + addres.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", addres='" + addres + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int compareTo(Factory o) {
        return country.compareTo(o.getCountry());
    }
}
