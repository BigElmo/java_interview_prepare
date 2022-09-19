package org.example.homework1;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String gender;
    private String country;
    private String address;
    private String phone;
    private Integer age;

    private Person(String firstName, String lastName, String middleName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder()
                .append(firstName).append("\n");

        if (middleName != null) {
            stringBuilder.append(middleName).append("\n");
        }

        stringBuilder
                .append(lastName).append("\n")
                .append(gender).append("\n");

        if (age != null) {
            stringBuilder.append(age).append("\n");
        }
        if (country != null) {
            stringBuilder.append(country).append("\n");
        }
        if (address != null) {
            stringBuilder.append(address).append("\n");
        }
        if (phone != null) {
            stringBuilder.append(phone).append("\n");
        }

        return stringBuilder.toString();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String gender;
        private String country;
        private String address;
        private String phone;
        private Integer age;

        public Builder(String firstName, String lastName, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        public Builder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Person build() {
            Person person = new Person(firstName, lastName, middleName, gender);
            person.setAddress(address);
            person.setAge(age);
            person.setPhone(phone);
            person.setCountry(country);

            return person;
        }
    }
}
