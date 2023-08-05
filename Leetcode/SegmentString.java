public class SegmentString {

    public static int countSegments(String s) {

        String newString = s.replaceAll("\\s+", " ");
        int count = 0;
        if(newString.length() == 0){
            return 0;
        }

        String[] str = newString.split("\\s+");

        for(String x: str){
            if(x.equals("")){
                continue;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int count = countSegments("    foo    bar");
        System.out.println(count);
    }
}
