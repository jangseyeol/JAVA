package ex05;

import java.util.Scanner;

public class MediaPlayerControl {
	public static void main(String[] args) {
		
		MediaPlayer player = new FLACPlayer();
		
		Scanner sc = new Scanner(System.in);
		
		while(FLACPlayer.state != -1) {
			System.out.print("1 : 플레이 실행, 0 : 일시정지, -1 : 중지 ==>");
		switch(sc.nextInt()) {
		case 1 :
			player.play();
			break;
		case 0 :
			player.pause();
			break;
		case -1 :
			player.stop();
			break;
		}
		
		}
		
		System.out.println("play stop");
	}
}
