package idk;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-18 17:30
 */
public class Father {
    private  int age;
    private  String name;
    public  void fuk(){
        System.out.println("father!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   /* public String toString6() {
        return com.google.common.base.Objects.toStringHelper(this)
                .add("age", age)
                .add("name", name)
                .toString();
    }*/

//    @Override
//    public String toString7() {
//        return com.google.common.base.MoreObjects.toStringHelper(this)
//                .add("age", age)
//                .add("name", name)
//                .toString();
//    }


}
