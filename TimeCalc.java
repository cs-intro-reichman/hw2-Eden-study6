public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt(args[0].split(":")[0]);
        int minutes = Integer.parseInt(args[0].split(":")[1]); 
        int number = Integer.parseInt(args[1]); 
        int totalMinutes = hours * 60 + minutes + number;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        System.out.printf("%02d:%02d", newHours, newMinutes);



       }
}
