package bitcamp.project.test;

import bitcamp.project.test.service.LessonService;
import bitcamp.project.test.service.PhotoService;

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
    
  }
}
