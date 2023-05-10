import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIJFrame extends JFrame {
    public UIJFrame(){//构造方法
        initGameJFrame();
        this.setVisible(true);
    }

    private void initGameJFrame() {
//        //菜单栏
//        JMenuBar menubar = new JMenuBar();
//        JMenu mainMenu = new JMenu("菜单");
//        JMenu aboutMenu = new JMenu("关于");
//        JMenuItem reStart = new JMenuItem("重新开始");
//        JMenuItem backTitle = new JMenuItem("返回标题页");
//        JMenuItem tips = new JMenuItem("提示");
//        JMenuItem aboutUs = new JMenuItem("关于我们");
//
//        //添加子菜单
//        mainMenu.add(reStart);
//        mainMenu.add(backTitle);
//        mainMenu.add(tips);
//        aboutMenu.add(aboutUs);
//        //添加菜单到菜单栏
//        menubar.add(mainMenu);
//        menubar.add(aboutMenu);

        //按钮
        JButton button1 = new JButton("切换官服");
        JButton button2 = new JButton("切换B服");
        button1.setBounds(95,80,90,55);
        button2.setBounds(95,200,90,55);
        button1.addActionListener(e -> new officialSwitch());
        button2.addActionListener(e -> System.out.println("当前为B服"));

        //布局

        JPanel panel1= new JPanel();
        ImageIcon background = new ImageIcon("Source/1.jpg");
        JLabel label = new JLabel(background);
        label.add(button1);
        label.add(button2);
        panel1.add(label);
        this.getContentPane().add(panel1);



        //窗口图标
        Image iconimage = getToolkit().getImage("Source/iconpic.png").getScaledInstance(15,15,Image.SCALE_DEFAULT);
        this.setIconImage(iconimage);//设置图标


        //窗体构造设置
//        this.setJMenuBar(menubar);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setSize(background.getIconWidth(),background.getIconHeight());
        this.setTitle("LaunchSwitch");
        this.setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
