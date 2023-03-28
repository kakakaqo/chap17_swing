package com.javalab.awt.pkg10;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * JTable : 목록을 출력해주는 컴포넌트
 * - https://www.javatpoint.com/java-jtable
 */

public class Table01 {

	// 필드
	JFrame frame;

	// 생성자
	public Table01() {
		frame = new JFrame(); // 프레임 객체 생성

		// 테이블에 출력될 값
		String data[][] = 
			{ 
					{ "101", "Amit", "670000" }, 
					{ "102", "Jai", "780000" }, 
					{ "101", "Sachin", "700000" },

		};

		// 테이블에 출력될 제목
		String column[] = { "ID", "NAME", "SALARY" };

		// Table 객체 생성
		JTable table = new JTable(data, column);
		table.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(table);

		frame.add(sp);
		frame.setSize(300, 400);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Table01();
	}
}