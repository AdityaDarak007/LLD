class Student {
    private static String name;
    private static int age;
    private static String univesity;
    private double psp;

    public Student(Helper helper) {
        if(helper.getAge() == 0){
            throw new IllegalArgumentException("Invalid Age");
        }
        if(helper.getName() == null){
            throw new IllegalArgumentException("Invalid Name");
        }
        if(helper.getPsp() <= 0){
            throw new IllegalArgumentException("Invalid PSP");
        }
        this.name = helper.getName();
        this.age = helper.getName();
        this.univesity = helper.getUniversity();
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Student.age = age;
    }

    public static String getUnivesity() {
        return univesity;
    }

    public static void setUnivesity(String univesity) {
        Student.univesity = univesity;
    }
}