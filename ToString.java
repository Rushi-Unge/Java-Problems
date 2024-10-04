public class ToString {
    String name;
    int age;
    String rollNumber;
    String house;

    public ToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString(){
        return "Student Details:{name:,"+ name + ", age:"+ age +", rollNumber:"+rollNumber+", house:"+ house+"}";

    }


    public static void main(String[] args) {
            ToString stu=new ToString("Rushi",22,
                    "125","mahal");
        System.out.println(stu);
    }

}
