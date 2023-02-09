public class TimeFormat {
    public static void main(String[] args) {
        String s = "04:59:59AM";
        int hour = Integer.parseInt(s.substring(0, 2));  
        String Meridiem = s.substring(8);
        
        if(Meridiem.equals("PM")){
            if(hour!=12){
                hour = hour + 12;
            }

            if(hour<10){
                String str1 = "0"+String.valueOf(hour) +s.substring(2, 8);
                System.out.println(str1); 
            }
            String str = String.valueOf(hour) +s.substring(2, 8);
            // System.out.println(str); 
        }else{
            if(hour == 12){
                hour = 00;
            }
            if(hour<10){
                String str1 = "0"+String.valueOf(hour) +s.substring(2, 8);
                System.out.println(str1); 
            }
            String str = String.valueOf(hour) +s.substring(2, 8);
            // System.out.println(str); 
        }
    }
}
