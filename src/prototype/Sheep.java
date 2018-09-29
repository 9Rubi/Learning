package prototype;

import java.util.Date;

public class Sheep implements Cloneable{
    private String name;
    private Date birthday;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep s = (Sheep) super.clone();
        s.birthday= (Date) s.birthday.clone();
        s.name=s.name;
        return s;
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
