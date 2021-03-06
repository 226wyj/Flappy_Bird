package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

/**
 * 游戏界面
 */
public class BirdGame extends JPanel {

    // 背景图片
    BufferedImage background;

    /**
     * 初始化游戏
     */
    public BirdGame() throws Exception {
        // 初始化背景图片
        String imgPath = "D:\\Files\\Github\\Flappy_Bird\\src\\resources\\bg.png";
        background = ImageIO.read(new FileInputStream(imgPath));
    }

    /**
     * 绘制界面
     */
    public void paint(Graphics g) {
        // 绘制背景
        g.drawImage(background, 0, 0, null);
    }

    /**
     * 启动方法
     */
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        BirdGame game = new BirdGame();
        frame.add(game);
        frame.setSize(440, 670);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}