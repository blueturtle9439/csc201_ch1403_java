import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;
import java.util.Collections;

public class ch1403 extends Frame implements WindowListener {
    String path = "D:\\programs\\workplace\\intellijworkspace\\csc201_ch1403_java\\card images\\";
    static String file1 = "";
    static String file2 = "";
    static String file3 = "";

    public static void main(String[] args) {
        ch1403 f = new ch1403();
        f.setSize(750, 400);
        f.setVisible(true);

        Integer[] arr = new Integer[52];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        file1 = arr[1].toString();
        file2 = arr[2].toString();
        file3 = arr[3].toString();
        System.out.println(file1);


    }

    public ch1403() {
        MyCanvas mc = new MyCanvas();
        add("Center", mc);

        addWindowListener(this);
    }

    class MyCanvas extends Canvas {
        public void paint(Graphics g) {
            Toolkit myToolkit = Toolkit.getDefaultToolkit();
            Image myImage = myToolkit.getImage(path + file1 + ".jpg"); // 경로수정해주시면됩니다
            Image myImage2 = myToolkit.getImage(path + file2 + ".jpg"); // 경로수정해주시면됩니다
            Image myImage3 = myToolkit.getImage(path + file3 + ".jpg"); // 경로수정해주시면됩니다
            g.drawImage(myImage, 0, 0, this);
            g.drawImage(myImage2, 250, 0, this);
            g.drawImage(myImage3, 500, 0, this);

        }
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }


    public void windowDeactivated(WindowEvent e) {
    }

}

