package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }

    private static List<String> getUserFriends(String user, List<List<String>> friends) {
        List<String> userFriends = new ArrayList<>();
        userFriends.add(user);

        for (List<String> friend : friends) {
            String friend1 = friend.get(0);
            String friend2 = friend.get(1);

            if (friend1.equals(user)) {
                userFriends.add(friend2);
            } else if (friend2.equals(user)) {
                userFriends.add(friend1);
            }
        }
        return userFriends;
    }

    private static Map<String, Integer> getRecommendedFriends(List<String> userFriends, List<List<String>> friends) {
        Map<String, Integer> recommendedFriends = new HashMap<>();

        for (List<String> friend : friends) {
            String friend1 = friend.get(0);
            String friend2 = friend.get(1);

            if (userFriends.contains(friend1) && !userFriends.contains(friend2)) {
                recommendedFriends.put(friend2, 10);
            } else if (userFriends.contains(friend2) && !userFriends.contains(friend1)) {
                recommendedFriends.put(friend1, 10);
            }
        }
        return recommendedFriends;
    }
}
