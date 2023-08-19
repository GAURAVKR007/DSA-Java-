import java.util.ArrayList;

public class WinnerCircularGame {
     public static int findTheWinner(int n, int k) {
        ArrayList<Integer> friend = new ArrayList<>();

        for(int i=1;i<n+1;i++){
            friend.add(i);
        }

        int head = 0;
        int tail = head + k - 1;

        while(friend.size() != 1){

            head = head % friend.size();
            tail = tail% friend.size();

            friend.remove(tail);

            head = tail;
            tail = tail+k -1;
        }

        return friend.get(0);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(6, 5));
    }
}
