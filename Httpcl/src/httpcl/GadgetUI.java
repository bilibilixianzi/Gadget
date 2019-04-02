package httpcl;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class GadgetUI {
	Map<String, String> map = new HashMap<String, String>();
	public GadgetUI() {
		JFrame f=new JFrame("Gadget");
		java.awt.Container con=f.getContentPane();
		
		f.setSize(400,350);
		f.setLocation(600,250);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton b1=new JButton("查询");
		b1.setFont(new Font("宋体",Font.BOLD,9));
		b1.setActionCommand("chaxun");
		b1.setBounds(280, 30, 55, 20);
		f.add(b1);
		JButton b2=new JButton("生成");
		b2.setFont(new Font("宋体",Font.BOLD,9));
		b2.setActionCommand("put");
		b2.setBounds(280, 200, 55, 20);
		f.add(b2);
		JButton b3=new JButton("复制");
		b3.setFont(new Font("宋体",Font.BOLD,9));
		b3.setActionCommand("copy");
		b3.setBounds(280, 220, 55, 20);
		b3.setEnabled(false);
		f.add(b3);
		JButton b4=new JButton("清空");
		b4.setFont(new Font("宋体",Font.BOLD,9));
		b4.setActionCommand("clear");
		b4.setBounds(280, 240, 55, 20);
		b4.setEnabled(false);
		f.add(b4);
		
		JTextField bt1=new JTextField("查询天气");
		bt1.setFont(new Font("楷体",Font.BOLD,20));
		bt1.setForeground(Color.BLUE);
		bt1.setBounds(150, 0, 100, 30);
		bt1.setEnabled(false);
		bt1.setBorder(null);
		f.add(bt1);
		JTextField bt2=new JTextField("音乐外链");
		bt2.setFont(new Font("楷体",Font.BOLD,20));
		bt2.setForeground(Color.BLUE);
		bt2.setBounds(150, 170, 100, 30);
		bt2.setEnabled(false);
		bt2.setBorder(null);
		f.add(bt2);
		JTextField bt3=new JTextField("请每次生成后清空数据！");
		bt3.setFont(new Font("华文彩云",Font.BOLD,20));
		bt3.setForeground(Color.BLUE);
		bt3.setBounds(90, 260, 220, 40);
		bt3.setEnabled(false);
		bt3.setBorder(null);
		f.add(bt3);
		
		JTextField st1=new JTextField("请输入城市:");
		st1.setFont(new Font("黑体",Font.BOLD,10));
		st1.setForeground(Color.BLACK);
		st1.setBounds(20, 30, 70, 20);
		st1.setEnabled(false);
		st1.setBorder(null);
		f.add(st1);
		JTextField st11=new JTextField("请输入歌曲:");
		st11.setFont(new Font("黑体",Font.BOLD,10));
		st11.setForeground(Color.BLACK);
		st11.setBounds(20, 200, 70, 20);
		st11.setEnabled(false);
		st11.setBorder(null);
		f.add(st11);
		
		JTextField st2=new JTextField("省份:");
		st2.setFont(new Font("黑体",Font.BOLD,10));
		st2.setForeground(Color.BLACK);
		st2.setBounds(90, 50, 50, 20);
		st2.setEnabled(false);
		f.add(st2);
		JTextField st21=new JTextField("");
		st21.setFont(new Font("黑体",Font.BOLD,10));
		st21.setForeground(Color.BLACK);
		st21.setBounds(140, 50, 140, 20);
		st21.setEnabled(false);
		st21.setHorizontalAlignment(JTextField.CENTER);
		f.add(st21);
		
		JTextField st3=new JTextField("城市:");
		st3.setFont(new Font("黑体",Font.BOLD,10));
		st3.setForeground(Color.BLACK);
		st3.setBounds(90, 70, 50, 20);
		st3.setEnabled(false);
		f.add(st3);
		JTextField st31=new JTextField("");
		st31.setFont(new Font("黑体",Font.BOLD,10));
		st31.setForeground(Color.BLACK);
		st31.setBounds(140, 70, 140, 20);
		st31.setEnabled(false);
		st31.setHorizontalAlignment(JTextField.CENTER);
		f.add(st31);
		
		JTextField st4=new JTextField("天气:");
		st4.setFont(new Font("黑体",Font.BOLD,10));
		st4.setForeground(Color.BLACK);
		st4.setBounds(90, 90, 50, 20);
		st4.setEnabled(false);
		f.add(st4);
		JTextField st41=new JTextField("");
		st41.setFont(new Font("黑体",Font.BOLD,10));
		st41.setForeground(Color.BLACK);
		st41.setBounds(140, 90, 140, 20);
		st41.setEnabled(false);
		st41.setHorizontalAlignment(JTextField.CENTER);
		f.add(st41);
		
		JTextField st5=new JTextField("风力:");
		st5.setFont(new Font("黑体",Font.BOLD,10));
		st5.setForeground(Color.BLACK);
		st5.setBounds(90, 110, 50, 20);
		st5.setEnabled(false);
		f.add(st5);
		JTextField st51=new JTextField("");
		st51.setFont(new Font("黑体",Font.BOLD,10));
		st51.setForeground(Color.BLACK);
		st51.setBounds(140, 110, 140, 20);
		st51.setEnabled(false);
		st51.setHorizontalAlignment(JTextField.CENTER);
		f.add(st51);
		
		JTextField st6=new JTextField("气温:");
		st6.setFont(new Font("黑体",Font.BOLD,10));
		st6.setForeground(Color.BLACK);
		st6.setBounds(90, 130, 50, 20);
		st6.setEnabled(false);
		f.add(st6);
		JTextField st61=new JTextField("");
		st61.setFont(new Font("黑体",Font.BOLD,10));
		st61.setForeground(Color.BLACK);
		st61.setBounds(140, 130, 140, 20);
		st61.setEnabled(false);
		st61.setHorizontalAlignment(JTextField.CENTER);
		f.add(st61);
		
		JTextField st7=new JTextField("湿度:");
		st7.setFont(new Font("黑体",Font.BOLD,10));
		st7.setForeground(Color.BLACK);
		st7.setBounds(90, 150, 50, 20);
		st7.setEnabled(false);
		f.add(st7);
		JTextField st71=new JTextField("");
		st71.setFont(new Font("黑体",Font.BOLD,10));
		st71.setForeground(Color.BLACK);
		st71.setBounds(140, 150, 140, 20);
		st71.setEnabled(false);
		st71.setHorizontalAlignment(JTextField.CENTER);
		f.add(st71);
		
		JTextField text1=new JTextField("北京");
		text1.setForeground(Color.BLUE);
		text1.setBounds(90, 30, 190, 20);
		f.add(text1);
		JTextField text2=new JTextField("lemon");
		text2.setForeground(Color.BLUE);
		text2.setBounds(90, 200, 190, 20);
		f.add(text2);
		JComboBox text3=new JComboBox();
		text3.setForeground(Color.BLACK);
		text3.setEnabled(false);
		text3.setBounds(90, 220, 190, 20);
		f.add(text3);
		JTextField text4=new JTextField("");
		text4.setForeground(Color.BLUE);
		text4.setEnabled(false);
		text4.setBounds(90, 240, 190, 20);
		f.add(text4);
		
		JButton a1=new JButton("复制");
		a1.setFont(new Font("宋体",Font.BOLD,9));
		a1.setActionCommand("a1copy");
		a1.setEnabled(false);
		a1.setBounds(280, 220, 55, 20);
		f.add(a1);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anko c=new Anko();
				String city=text1.getText().toString();
				c.chuli(city);
				st21.setText(c.getMap("province"));
				st31.setText(c.getMap("city"));
				st41.setText(c.getMap("weather"));
				st51.setText(c.getMap("windpower")+"级");
				st61.setText(c.getMap("temperature")+"°");
				st71.setText(c.getMap("humidity"));
				text1.setText("");
			}
		});
		b2.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				text3.setEnabled(true);
				b4.setEnabled(true);
				LvziCon l=new LvziCon();
				String gequ=text2.getText();
				l.Getlia(gequ);
				String[] list=l.getMap();
				for(String a:list) {
					String[] ss=a.split(":");
					map.put(ss[0], ss[1]);
					text3.addItem(ss[0]);
				}
			}
		});
		text3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setEnabled(true);
				String key=(String)text3.getSelectedItem();
				String url="http://www.ytmp3.cn/down/"+map.get(key)+".mp3";
				text4.setText(url);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				String str=(String)text3.getSelectedItem();
				Transferable tText = new StringSelection(text4.getText());
				clip.setContents(tText, null);
				JOptionPane.showMessageDialog(f, "已复制到剪贴板！", "watermark",JOptionPane.WARNING_MESSAGE);
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.removeAllItems();
				map.clear();
				text4.setText(null);
				text2.setText(null);
				text3.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
			}
		});
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			/*
				Windows 风格：           com.sun.java.swing.plaf.windows.WindowsLookAndFeel
				Metal 风格（默认）：javax.swing.plaf.metal.MetalLookAndFeel
				Motif 风格：                  com.sun.java.swing.plaf.motif.MotifLookAndFeel
				Mac 风格：                         com.sun.java.swing.plaf.mac.MacLookAndFeel
				GTK 风格：                         com.sun.java.swing.plaf.gtk.GTKLookAndFeel
			*/
		}catch(Exception e) {
			e.printStackTrace();
		}
		new GadgetUI();
	}
}
