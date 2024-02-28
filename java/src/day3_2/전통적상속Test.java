package day3_2;

import javax.swing.*;

/*
	상속은 기능의 확장
*/

class MyFrame extends JFrame {
	public MyFrame() {
		add(new JButton("클릭하세요"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
}
public class 전통적상속Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}