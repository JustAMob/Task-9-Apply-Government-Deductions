import java.util.Scanner;

public class time {
  static double log() {
    Scanner sc = new Scanner(System.in);
    double totaltime = 0;
    double totallatededuc = 0;
    
    for (int day = 1; day <= 7; day++) { 

    System.out.printf("Enter Login time(Hr:Mn) for Day %d: ", day);
      String timeStringin = sc.nextLine();
      
      int latededuc = late.totallate(timeStringin);
      
      totallatededuc += latededuc;

      double logintime = timeConverter(timeStringin);


    System.out.printf("Enter Logout time(Hr:Mn) for Day %d: ", day);
      String timeStringout = sc.nextLine();

      double logouttime = timeConverter(timeStringout);

      double time = logouttime - logintime;
      int breaktime = breakTime(time);

      double daytime = time - breaktime;
      System.out.println("Hours worked that day: " + daytime);
      totaltime += daytime - breaktime;
    }
    
    System.out.println("Totat hours worked: "+ totaltime);
    sc.close();
    return totaltime - totallatededuc;
  }
  static double timeConverter(String timeString) {
    String[] timeParts = timeString.split(":"); 

    int hours = Integer.parseInt(timeParts[0]);
    int minutes = Integer.parseInt(timeParts[1]);
                        
    int totalMinutes = hours * 60 + minutes;
                                          
    double totalTimeInHours = (double) totalMinutes / 60;

    return totalTimeInHours;
  }
  static int breakTime(double time){
    int breaktime = 1;
    if (time <= 4.99 ){
      breaktime = 0;
    }
    return breaktime;
  }  
  

}