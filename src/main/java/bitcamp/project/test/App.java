package bitcamp.project.test;

import bitcamp.project.test.service.TeamLeaderService;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
      System.out.println("------------");
      TeamLeaderService s = new TeamLeaderService();
      s.list();
      System.out.println("------------");

    }
}
