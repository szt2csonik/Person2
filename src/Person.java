public class Person {
    String _name;
    int _age;
    String _gender;
    public Person(String name, int age, String gender){
        name=this._name;
        age=this._age;
        gender=this._gender;

    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
    public void introdice(){
        System.out.println("Hi, I'm "+_name+", a "+_age+" year old "+_gender);
    }

}
