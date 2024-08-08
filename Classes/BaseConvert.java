package Classes;

public class BaseConvert {
    public double convert(double toConvert, int choice){
        if(choice == 1){
            toConvert = (toConvert * 9 / 5) + 32;
        } else if(choice == 2){
            toConvert = toConvert + 273.15;
        }
        return toConvert;
    }
}
