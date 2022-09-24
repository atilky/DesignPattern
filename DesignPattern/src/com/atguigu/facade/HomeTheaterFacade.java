package com.atguigu.facade;

public class HomeTheaterFacade {

    private DVDPlayer dVDPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Screen stereo;

    public HomeTheaterFacade() {
        this.dVDPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Screen.getInstance();
    }

    /**
     * 準備
     */
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dVDPlayer.on();
    }

    /**
     * 播放
     */
    public void play(){
        dVDPlayer.play();
    }

    /**
     * 暫停
     */
    public void pause(){
        dVDPlayer.pause();
    }

    /**
     * 結束
     */
    public void end(){
        dVDPlayer.off();
        stereo.off();
        projector.off();
    }








}
