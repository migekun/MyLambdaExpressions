package info.manavas.javaImprovements;

public class SwitchStatementExample {
    public static void main(String[] args) {
        String month = "JANUARY";
        String quarter;
        switch (month){
            case "JANUARY":
                quarter = "First quarter";
                break;
            case "FEBRUARY":
                quarter = "First quarter";
                break;
            case "MARCH":
                quarter = "First quarter";
                break;
            case "APRIL":
                quarter = "SECOND QUARTER";
                break;
            case "MAY":
                quarter = "SECOND QUARTER";
                break;
            case "JUNY":
                quarter = "SECOND QUARTER";
                break;
            case "JULY":
                quarter = "THIRD QUARTER";
                break;
            case "AUGUST":
                quarter = "THIRD QUARTER";
                break;
            case "SETEMBER":
                quarter = "THIRD QUARTER";
                break;
            case "OCTOBER":
                quarter = "FOURTH QUARTER";
                break;
            case "NOVEMBER":
                quarter = "FOURTH QUARTER";
                break;
            case "DECEMBER":
                quarter = "FOURTH QUARTER";
                break;
            default:
                quarter = "UNKOWN QUARTER";
        }
        System.out.println("quarter = " + quarter);
    }
}
