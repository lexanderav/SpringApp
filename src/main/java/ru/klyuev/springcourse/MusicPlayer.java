package ru.klyuev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    //public MusicPlayer(Music music) {
    //    this.music = music;
    //}

    public MusicPlayer() {}

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music m : musicList) {
            System.out.println("Playing " + m.getSong());
        }
    }

    public void doMyDestroy() {
        System.out.println("Bean destroy");
    }

    //public void setMusic(Music music) {
    //    this.music = music;
    //}

    //public void playMusic() {
    //    System.out.println("Playing: " +music.getSong());
    //}
}
