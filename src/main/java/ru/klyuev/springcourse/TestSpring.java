package ru.klyuev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean",Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());



//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean flag = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(flag);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(40);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());


        //musicPlayer.playMusic();

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
