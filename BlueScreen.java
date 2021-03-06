import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueScreen here.
 * 
 * Zach Siegel & Micah Hansonbrook
 * @version 0.3
 */
public class BlueScreen extends World{
LinuxRacer player = new LinuxRacer();
AndroidRacer opponent = new AndroidRacer();
private StartLine startingLine = new StartLine();
private boolean loadedRacers = false;
private PlayerOneVictory p1Win = new PlayerOneVictory();
private PlayerTwoVictory p2Win = new PlayerTwoVictory();
    /**
     * Constructor for objects of class BlueScreen.
     */
    public BlueScreen(){    
        // Create a new world with 600x400 cells with a cell size of
        //1x1 pixels.
        super(1000, 700, 1);
        setupTrack();
        
}
public void act(){
    if (loadedRacers == false){
        loadedRacers = true;
        setupRacers(startingLine);
    }
    if (Greenfoot.isKeyDown("space")==true){
       Greenfoot.setWorld(new BlueScreen());
       while (Greenfoot.isKeyDown("space")==true){
           
        }
    }
    if(player.finished == true){
        addObject(p1Win, 600, -700);
        Greenfoot.stop();
    }
    if(opponent.finished == true){
        addObject(p2Win, 600, -700);
        Greenfoot.stop();
    }
    if(player.returnToStart == true){
        player.returnToStart = false;
        player.setLocation(startingLine.getX(), startingLine.getY());
        player.setRotation(startingLine.getRotation() - 90);
    }
    if(opponent.returnToStart == true){
        opponent.returnToStart = false;
        opponent.setLocation(startingLine.getX(), startingLine.getY());
        opponent.setRotation(startingLine.getRotation() - 90);
    }
}
public void setupTrack(){
        int trackNumber = Greenfoot.getRandomNumber(5);
        switch(trackNumber){
            case 1: track1();
            break;
            case 2: track2();
            break;
            case 3: track3();
            break;
            case 4: track4();
            break; 
            case 5: track5();
            break;
            default: track1(); 
            break;

        }
        
    }

    public void track1(){
        StartLine startline = new StartLine();
        startingLine = startline;
        addObject(startline,109,98);
        startline.setLocation(713,461);
        startline.setRotation(90);
        startline.setLocation(106,94);
        TrackComponent trackcomponent = new TrackComponent();
        addObject(trackcomponent,698,272);
        trackcomponent.setRotation(90);
        trackcomponent.setLocation(256,95);
        TrackComponent trackcomponent2 = new TrackComponent();
        addObject(trackcomponent2,659,167);
        trackcomponent2.setRotation(84);
        trackcomponent2.setRotation(95);
        trackcomponent2.setRotation(100);
        trackcomponent2.setLocation(499,122);
        trackcomponent2.setLocation(395,107);
        TrackComponent trackcomponent3 = new TrackComponent();
        addObject(trackcomponent3,650,245);
        trackcomponent3.setRotation(110);
        trackcomponent3.setLocation(660,260);
        trackcomponent3.setRotation(120);
        trackcomponent3.setLocation(543,173);
        trackcomponent3.setLocation(514,151);
        TrackComponent trackcomponent4 = new TrackComponent();
        addObject(trackcomponent4,640,328);
        trackcomponent4.setLocation(602,300);
        trackcomponent4.setRotation(145);
        trackcomponent4.setLocation(602,232);
        TrackComponent trackcomponent5 = new TrackComponent();
        addObject(trackcomponent5,642,342);
        TrackComponent trackcomponent6 = new TrackComponent();
        addObject(trackcomponent6,642,342);
        trackcomponent6.setLocation(779,369);
        removeObject(trackcomponent6);
        trackcomponent5.setLocation(635,333);
        TrackComponent trackcomponent7 = new TrackComponent();
        addObject(trackcomponent7,636,483);
        trackcomponent7.setRotation(150);
        trackcomponent7.setRotation(45);
        trackcomponent7.setLocation(599,425);
        trackcomponent7.setRotation(30);
        trackcomponent7.setLocation(607,443);
        TrackComponent trackcomponent8 = new TrackComponent();
        addObject(trackcomponent8,458,513);
        trackcomponent8.setRotation(90);
        trackcomponent8.setLocation(504,499);
        trackcomponent8.setRotation(65);
        trackcomponent8.setLocation(529,515);
        trackcomponent8.setRotation(55);
        trackcomponent8.setRotation(75);
        trackcomponent8.setLocation(535,498);
        TrackComponent trackcomponent9 = new TrackComponent();
        addObject(trackcomponent9,424,500);
        trackcomponent9.setRotation(50);
        trackcomponent9.setRotation(80);
        trackcomponent9.setLocation(419,523);
        trackcomponent9.setRotation(100);
        trackcomponent9.setLocation(421,503);
        TrackComponent trackcomponent10 = new TrackComponent();
        addObject(trackcomponent10,291,461);
        trackcomponent10.setRotation(15);
        trackcomponent10.setRotation(-15);
        trackcomponent10.setLocation(340,461);
        trackcomponent10.setRotation(-30);
        trackcomponent10.setLocation(353,446);
        trackcomponent10.setRotation(-45);
        trackcomponent10.setLocation(329,454);
        TrackComponent trackcomponent11 = new TrackComponent();
        addObject(trackcomponent11,222,361);
        trackcomponent11.setLocation(228,327);
        trackcomponent11.setRotation(-45);
        trackcomponent11.setLocation(226,351);
        Finishline finishline = new Finishline();
        addObject(finishline,452,306);
        finishline.setRotation(-45);
        finishline.setLocation(153,234);
        finishline.setLocation(143,264);
    }

    public void track2(){
        StartLine startline = new StartLine();
        startingLine = startline;
        addObject(startline,727,312);
        startline.setRotation(90);
        startline.setLocation(123,579);
        TrackComponent trackcomponent = new TrackComponent();
        addObject(trackcomponent,789,519);
        TrackComponent trackcomponent2 = new TrackComponent();
        addObject(trackcomponent2,790,349);
        TrackComponent trackcomponent3 = new TrackComponent();
        addObject(trackcomponent3,806,163);
        trackcomponent.setRotation(45);
        trackcomponent.setLocation(676,503);
        trackcomponent.setRotation(90);
        trackcomponent.setLocation(264,581);
        trackcomponent2.setRotation(30);
        trackcomponent2.setLocation(642,510);
        trackcomponent2.setRotation(50);
        trackcomponent2.setLocation(415,538);
        trackcomponent2.setRotation(60);
        trackcomponent2.setLocation(374,551);
        trackcomponent2.setLocation(373,552);
        trackcomponent3.setLocation(488,395);
        trackcomponent3.setRotation(15);
        trackcomponent3.setLocation(487,403);
        trackcomponent3.setRotation(20);
        trackcomponent3.setLocation(437,474);
        TrackComponent trackcomponent4 = new TrackComponent();
        addObject(trackcomponent4,467,359);
        TrackComponent trackcomponent5 = new TrackComponent();
        addObject(trackcomponent5,413,209);
        trackcomponent5.setRotation(-90);
        trackcomponent5.setLocation(422,242);
        trackcomponent5.setRotation(-75);
        trackcomponent5.setLocation(414,254);
        trackcomponent5.setRotation(-50);
        trackcomponent5.setLocation(431,282);
        TrackComponent trackcomponent6 = new TrackComponent();
        addObject(trackcomponent6,294,264);
        trackcomponent6.setRotation(25);
        trackcomponent6.setLocation(260,316);
        TrackComponent trackcomponent7 = new TrackComponent();
        addObject(trackcomponent7,334,194);
        trackcomponent7.setRotation(90);
        trackcomponent7.setLocation(336,245);
        trackcomponent6.setLocation(245,395);
        removeObject(trackcomponent6);
        TrackComponent trackcomponent8 = new TrackComponent();
        addObject(trackcomponent8,264,381);
        trackcomponent8.setRotation(-25);
        trackcomponent8.getRotation();
        trackcomponent8.setRotation(25);
        trackcomponent8.setLocation(284,278);
        TrackComponent trackcomponent9 = new TrackComponent();
        addObject(trackcomponent9,118,383);
        trackcomponent9.setRotation(90);
        trackcomponent9.setLocation(193,366);
        trackcomponent9.setLocation(150,358);
        TrackComponent trackcomponent10 = new TrackComponent();
        addObject(trackcomponent10,300,394);
        trackcomponent10.setRotation(45);
        trackcomponent10.setLocation(249,340);
        trackcomponent9.setLocation(152,357);
        TrackComponent trackcomponent11 = new TrackComponent();
        addObject(trackcomponent11,79,256);
        TrackComponent trackcomponent12 = new TrackComponent();
        addObject(trackcomponent12,75,396);
        trackcomponent12.setRotation(-45);
        trackcomponent12.setLocation(110,345);
        TrackComponent trackcomponent13 = new TrackComponent();
        addObject(trackcomponent13,115,109);
        trackcomponent13.setRotation(45);
        trackcomponent13.setLocation(114,172);
        TrackComponent trackcomponent14 = new TrackComponent();
        addObject(trackcomponent14,262,110);
        trackcomponent14.setRotation(90);
        trackcomponent14.setLocation(220,119);
        trackcomponent13.setLocation(112,166);
        trackcomponent14.setLocation(199,120);
        TrackComponent trackcomponent15 = new TrackComponent();
        addObject(trackcomponent15,381,109);
        trackcomponent15.setRotation(90);
        trackcomponent15.setLocation(339,120);
        TrackComponent trackcomponent16 = new TrackComponent();
        addObject(trackcomponent16,510,116);
        trackcomponent16.setRotation(45);
        trackcomponent16.setRotation(135);
        trackcomponent16.setLocation(512,115);
        trackcomponent16.setLocation(458,140);
        removeObject(trackcomponent16);
        TrackComponent trackcomponent17 = new TrackComponent();
        addObject(trackcomponent17,517,130);
        trackcomponent17.setRotation(-15);
        trackcomponent17.setRotation(-30);
        trackcomponent17.setLocation(501,129);
        trackcomponent17.setLocation(495,128);
        trackcomponent17.setRotation(-50);
        trackcomponent17.setLocation(462,148);
        trackcomponent17.setLocation(457,138);
        trackcomponent17.setRotation(-60);
        trackcomponent17.setLocation(451,148);
        TrackComponent trackcomponent18 = new TrackComponent();
        addObject(trackcomponent18,605,249);
        trackcomponent18.setRotation(-60);
        trackcomponent18.setLocation(580,224);
        Finishline finishline = new Finishline();
        addObject(finishline,725,350);
        finishline.setRotation(-60);
        finishline.setLocation(706,300);
        trackcomponent7.setLocation(335,261);
        trackcomponent5.setLocation(422,294);
        trackcomponent8.setLocation(297,290);
        trackcomponent10.setLocation(261,347);
        trackcomponent9.setLocation(179,383);
        trackcomponent12.setLocation(103,356);
        trackcomponent7.setLocation(336,267);
        trackcomponent8.setLocation(296,292);
        trackcomponent4.setLocation(455,359);
    }

    public void track3(){
     StartLine startline = new StartLine();
     startingLine = startline;
        addObject(startline,927,632);
        TrackComponent trackcomponent = new TrackComponent();
        addObject(trackcomponent,934,487);
        TrackComponent trackcomponent2 = new TrackComponent();
        addObject(trackcomponent2,940,344);
        trackcomponent2.setLocation(934,342);
        TrackComponent trackcomponent3 = new TrackComponent();
        addObject(trackcomponent3,941,202);
        trackcomponent3.setLocation(934,204);
        TrackComponent trackcomponent4 = new TrackComponent();
        addObject(trackcomponent4,940,69);
        trackcomponent4.setRotation(-45);
        trackcomponent4.setLocation(903,120);
        TrackComponent trackcomponent5 = new TrackComponent();
        addObject(trackcomponent5,715,180);
        trackcomponent5.setRotation(90);
        trackcomponent5.setLocation(814,85);
        TrackComponent trackcomponent6 = new TrackComponent();
        addObject(trackcomponent6,668,155);
        trackcomponent6.setRotation(45);
        trackcomponent6.setLocation(730,120);
        TrackComponent trackcomponent7 = new TrackComponent();
        addObject(trackcomponent7,701,215);
        TrackComponent trackcomponent8 = new TrackComponent();
        addObject(trackcomponent8,701,362);
        trackcomponent8.setRotation(-45);
        trackcomponent8.setLocation(738,301);
        TrackComponent trackcomponent9 = new TrackComponent();
        addObject(trackcomponent9,786,396);
        TrackComponent trackcomponent10 = new TrackComponent();
        addObject(trackcomponent10,672,538);
        trackcomponent10.setRotation(45);
        trackcomponent10.setLocation(755,485);
        trackcomponent10.setLocation(750,484);
        TrackComponent trackcomponent11 = new TrackComponent();
        addObject(trackcomponent11,602,538);
        trackcomponent11.setRotation(90);
        trackcomponent11.setLocation(668,519);
        trackcomponent8.setLocation(740,302);
        trackcomponent9.setLocation(775,391);
        trackcomponent10.setLocation(742,476);
        trackcomponent10.setLocation(739,474);
        trackcomponent11.setLocation(654,508);
        TrackComponent trackcomponent12 = new TrackComponent();
        addObject(trackcomponent12,558,492);
        trackcomponent12.setRotation(-45);
        TrackComponent trackcomponent13 = new TrackComponent();
        addObject(trackcomponent13,538,394);
        TrackComponent trackcomponent14 = new TrackComponent();
        addObject(trackcomponent14,545,252);
        trackcomponent14.setLocation(538,250);
        trackcomponent13.setLocation(532,386);
        TrackComponent trackcomponent15 = new TrackComponent();
        addObject(trackcomponent15,539,130);
        trackcomponent15.setRotation(45);
        trackcomponent15.setRotation(-45);
        trackcomponent15.setLocation(497,167);
        TrackComponent trackcomponent16 = new TrackComponent();
        addObject(trackcomponent16,333,300);
        trackcomponent16.setRotation(90);
        trackcomponent16.setLocation(409,132);
        TrackComponent trackcomponent17 = new TrackComponent();
        addObject(trackcomponent17,324,256);
        trackcomponent17.setRotation(45);
        trackcomponent17.setLocation(326,170);
        TrackComponent trackcomponent18 = new TrackComponent();
        addObject(trackcomponent18,297,264);
        trackcomponent18.setLocation(290,257);
        TrackComponent trackcomponent19 = new TrackComponent();
        addObject(trackcomponent19,298,403);
        trackcomponent19.setRotation(-45);
        trackcomponent19.setLocation(385,480);
        TrackComponent trackcomponent20 = new TrackComponent();
        addObject(trackcomponent20,296,388);
        trackcomponent19.setLocation(329,474);
        TrackComponent trackcomponent21 = new TrackComponent();
        addObject(trackcomponent21,375,567);
        TrackComponent trackcomponent22 = new TrackComponent();
        addObject(trackcomponent22,265,607);
        trackcomponent22.setRotation(90);
        trackcomponent22.setLocation(252,646);
        TrackComponent trackcomponent23 = new TrackComponent();
        addObject(trackcomponent23,501,606);
        trackcomponent23.setRotation(-45);
        trackcomponent23.setRotation(45);
        trackcomponent23.setLocation(349,647);
        TrackComponent trackcomponent24 = new TrackComponent();
        addObject(trackcomponent24,163,510);
        trackcomponent24.setRotation(-45);
        trackcomponent24.setLocation(166,617);
        TrackComponent trackcomponent25 = new TrackComponent();
        addObject(trackcomponent25,141,532);
        trackcomponent25.setLocation(131,533);
        TrackComponent trackcomponent26 = new TrackComponent();
        addObject(trackcomponent26,138,391);
        trackcomponent26.setLocation(131,388);
        TrackComponent trackcomponent27 = new TrackComponent();
        addObject(trackcomponent27,138,245);
        trackcomponent27.setLocation(131,243);
        Finishline finishline = new Finishline();
        addObject(finishline,138,102);
        finishline.setLocation(131,100);
    }

    public void track4(){
     
        StartLine startline = new StartLine();
        startingLine = startline;
        addObject(startline,78,630);
        TrackComponent trackcomponent = new TrackComponent();
        addObject(trackcomponent,85,489);
        TrackComponent trackcomponent2 = new TrackComponent();
        addObject(trackcomponent2,92,349);
        trackcomponent2.setLocation(85,344);
        TrackComponent trackcomponent3 = new TrackComponent();
        addObject(trackcomponent3,92,206);
        TrackComponent trackcomponent4 = new TrackComponent();
        addObject(trackcomponent4,92,206);
        trackcomponent4.setLocation(409,157);
        removeObject(trackcomponent4);
        trackcomponent3.setLocation(85,205);
        TrackComponent trackcomponent5 = new TrackComponent();
        addObject(trackcomponent5,93,66);
        trackcomponent5.setRotation(45);
        trackcomponent5.setLocation(118,120);
        trackcomponent5.setLocation(120,118);
        TrackComponent trackcomponent6 = new TrackComponent();
        addObject(trackcomponent6,465,112);
        trackcomponent6.setRotation(90);
        trackcomponent6.setLocation(206,80);
        TrackComponent trackcomponent7 = new TrackComponent();
        addObject(trackcomponent7,533,192);
        trackcomponent7.setRotation(90);
        trackcomponent7.setLocation(355,80);
        TrackComponent trackcomponent8 = new TrackComponent();
        addObject(trackcomponent8,474,324);
        trackcomponent8.setRotation(90);
        trackcomponent8.setLocation(498,80);
        TrackComponent trackcomponent9 = new TrackComponent();
        addObject(trackcomponent9,749,136);
        trackcomponent9.setRotation(90);
        trackcomponent9.setLocation(640,79);
        trackcomponent9.setLocation(647,79);
        trackcomponent6.setLocation(208,84);
        trackcomponent7.setLocation(351,84);
        trackcomponent8.setLocation(497,84);
        trackcomponent9.setLocation(647,84);
        TrackComponent trackcomponent10 = new TrackComponent();
        addObject(trackcomponent10,802,89);
        trackcomponent10.setRotation(90);
        trackcomponent10.setLocation(789,84);
        TrackComponent trackcomponent11 = new TrackComponent();
        addObject(trackcomponent11,826,346);
        trackcomponent11.getRotation();
        trackcomponent11.setRotation(-45);
        trackcomponent11.setLocation(876,122);
        TrackComponent trackcomponent12 = new TrackComponent();
        addObject(trackcomponent12,918,215);
        TrackComponent trackcomponent13 = new TrackComponent();
        addObject(trackcomponent13,925,362);
        trackcomponent13.setLocation(918,361);
        TrackComponent trackcomponent14 = new TrackComponent();
        addObject(trackcomponent14,925,516);
        trackcomponent14.setLocation(918,509);
        TrackComponent trackcomponent15 = new TrackComponent();
        addObject(trackcomponent15,685,507);
        trackcomponent15.setRotation(45);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(685,507);
        trackcomponent15.setLocation(881,596);
        TrackComponent trackcomponent16 = new TrackComponent();
        addObject(trackcomponent16,687,602);
        trackcomponent16.setRotation(90);
        trackcomponent16.setLocation(795,631);
        TrackComponent trackcomponent17 = new TrackComponent();
        addObject(trackcomponent17,603,611);
        trackcomponent17.setRotation(90);
        trackcomponent17.setLocation(651,631);
        TrackComponent trackcomponent18 = new TrackComponent();
        addObject(trackcomponent18,386,605);
        trackcomponent18.setRotation(90);
        trackcomponent18.setLocation(502,632);
        TrackComponent trackcomponent19 = new TrackComponent();
        addObject(trackcomponent19,304,605);
        trackcomponent19.setRotation(90);
        trackcomponent19.setLocation(358,632);
        TrackComponent trackcomponent20 = new TrackComponent();
        addObject(trackcomponent20,286,444);
        trackcomponent20.setRotation(-45);
        trackcomponent20.setLocation(273,595);
        TrackComponent trackcomponent21 = new TrackComponent();
        addObject(trackcomponent21,243,517);
        trackcomponent21.setLocation(237,510);
        TrackComponent trackcomponent22 = new TrackComponent();
        addObject(trackcomponent22,241,370);
        trackcomponent22.setLocation(237,370);
        TrackComponent trackcomponent23 = new TrackComponent();
        addObject(trackcomponent23,244,250);
        trackcomponent23.setRotation(45);
        trackcomponent23.setLocation(271,285);
        TrackComponent trackcomponent24 = new TrackComponent();
        addObject(trackcomponent24,450,228);
        TrackComponent trackcomponent25 = new TrackComponent();
        addObject(trackcomponent25,450,228);
        trackcomponent25.setLocation(684,270);
        trackcomponent24.setLocation(451,271);
        trackcomponent24.setRotation(90);
        trackcomponent24.setLocation(356,249);
        trackcomponent25.setRotation(90);
        trackcomponent25.setLocation(500,249);
        TrackComponent trackcomponent26 = new TrackComponent();
        addObject(trackcomponent26,647,250);
        trackcomponent26.setRotation(90);
        trackcomponent26.setLocation(644,249);
        TrackComponent trackcomponent27 = new TrackComponent();
        addObject(trackcomponent27,767,312);
        trackcomponent27.setRotation(-45);
        trackcomponent27.setLocation(731,284);
        TrackComponent trackcomponent28 = new TrackComponent();
        addObject(trackcomponent28,771,375);
        TrackComponent trackcomponent29 = new TrackComponent();
        addObject(trackcomponent29,613,466);
        trackcomponent29.setRotation(45);
        trackcomponent29.setLocation(735,462);
        TrackComponent trackcomponent30 = new TrackComponent();
        addObject(trackcomponent30,554,470);
        trackcomponent30.setRotation(9);
        trackcomponent30.setRotation(90);
        trackcomponent30.setLocation(647,497);
        TrackComponent trackcomponent31 = new TrackComponent();
        addObject(trackcomponent31,424,464);
        trackcomponent31.setRotation(90);
        trackcomponent31.setLocation(504,497);
        Finishline finishline = new Finishline();
        addObject(finishline,370,469);
        finishline.setRotation(90);
        finishline.setLocation(405,493);
    }

    public void track5(){
     StartLine startline = new StartLine();
     startingLine = startline;
        addObject(startline,72,632);
        TrackComponent trackcomponent = new TrackComponent();
        addObject(trackcomponent,81,490);
        TrackComponent trackcomponent2 = new TrackComponent();
        addObject(trackcomponent2,88,349);
        trackcomponent2.setLocation(82,353);
        trackcomponent2.setLocation(98,333);
        trackcomponent.setLocation(73,491);
        trackcomponent2.setLocation(76,350);
        trackcomponent2.setLocation(73,352);
        trackcomponent2.setRotation(90);
        trackcomponent2.setLocation(132,358);
        trackcomponent2.setRotation(45);
        trackcomponent2.setLocation(108,407);
        TrackComponent trackcomponent3 = new TrackComponent();
        addObject(trackcomponent3,150,330);
        trackcomponent3.setLocation(140,326);
        TrackComponent trackcomponent4 = new TrackComponent();
        addObject(trackcomponent4,564,362);
        trackcomponent4.setRotation(-45);
        trackcomponent4.setLocation(106,240);
        TrackComponent trackcomponent5 = new TrackComponent();
        addObject(trackcomponent5,75,162);
        trackcomponent5.setLocation(70,155);
        TrackComponent trackcomponent6 = new TrackComponent();
        addObject(trackcomponent6,443,168);
        trackcomponent6.setRotation(45);
        trackcomponent6.setLocation(104,71);
        TrackComponent trackcomponent7 = new TrackComponent();
        addObject(trackcomponent7,382,232);
        trackcomponent7.setRotation(90);
        trackcomponent7.setLocation(190,34);
        trackcomponent7.setLocation(202,52);
        trackcomponent6.setLocation(103,83);
        trackcomponent7.setLocation(189,56);
        TrackComponent trackcomponent8 = new TrackComponent();
        addObject(trackcomponent8,337,242);
        trackcomponent8.setRotation(-45);
        trackcomponent8.setLocation(278,92);
        TrackComponent trackcomponent9 = new TrackComponent();
        addObject(trackcomponent9,321,184);
        TrackComponent trackcomponent10 = new TrackComponent();
        addObject(trackcomponent10,330,332);
        trackcomponent10.setLocation(320,332);
        trackcomponent10.setLocation(321,332);
        TrackComponent trackcomponent11 = new TrackComponent();
        addObject(trackcomponent11,325,547);
        trackcomponent11.setRotation(45);
        trackcomponent11.setLocation(284,418);
        TrackComponent trackcomponent12 = new TrackComponent();
        addObject(trackcomponent12,256,511);
        trackcomponent12.setLocation(249,505);
        TrackComponent trackcomponent13 = new TrackComponent();
        addObject(trackcomponent13,255,600);
        trackcomponent13.setRotation(45);
        trackcomponent13.setRotation(-45);
        trackcomponent13.setLocation(285,590);
        TrackComponent trackcomponent14 = new TrackComponent();
        addObject(trackcomponent14,564,605);
        trackcomponent14.setRotation(90);
        trackcomponent14.setLocation(367,625);
        trackcomponent14.setLocation(369,626);
        trackcomponent9.setLocation(314,178);
        trackcomponent10.setLocation(315,320);
        trackcomponent11.setLocation(283,405);
        trackcomponent13.setLocation(284,579);
        trackcomponent14.setLocation(369,617);
        Finishline finishline = new Finishline();
        addObject(finishline,613,599);
        finishline.setRotation(90);
        finishline.setLocation(514,617);
    }
    /*
     * setupRacers - Quickly setup the racers that will be 
     * racing in the game.
     */
    public void setupRacers(StartLine startline){
        addObject(player, startline.getX(), startline.getY());
        addObject(opponent, startline.getX(), startline.getY());
        player.setRotation(startline.getRotation() - 90);
        opponent.setRotation(startline.getRotation() - 90);
    }

    
}