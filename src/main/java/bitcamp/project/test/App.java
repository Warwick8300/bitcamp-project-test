package bitcamp.project.test;

import bitcamp.project.test.service.LessonService;
import bitcamp.project.test.service.MemberService;
import bitcamp.project.test.service.PhotoService;
import bitcamp.project.test.service.TeamLeaderService;


public class App {        
  public String getGreeting() {
    return "Hello world.";
  }         

  public static void main(String[] args) {


    System.out.println("** Made By Seung Been Oh **");
    LessonService l = new LessonService();
    l.list();
    System.out.println("** Made By Seung Been Oh **");

    PhotoService photoService = new PhotoService();
    photoService.list();

    System.out.println("------------");
    TeamLeaderService s = new TeamLeaderService();
    s.list();
    System.out.println("------------");
 
    MemberService memberService = new MemberService();
    memberService.list();
  }
}
