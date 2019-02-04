public class PartTime extends Student {
    private String typeOfStudent = "PartTime";

    PartTime(String a){
        name = a;
    }

    public String getTypeOfStudent(){
        return typeOfStudent;
    }
}
