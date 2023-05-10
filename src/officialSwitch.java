import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class officialSwitch {

    public officialSwitch() {
        try {

            //删除B服ini和PCGameSDK文件
            File file = new File("D:\\Star Rail\\Game\\config.ini");
            file.delete();
            File file1 = new File("D:\\Star Rail\\Game\\StarRail_Data\\Plugins\\PCGameSDK.dll");
            file1.delete();

            //读取要写入的配置文件
            InputStream inputStream = new FileInputStream("Source/configFile/official/offiConfig.ini");
            Scanner scanner = new Scanner(inputStream);
            String string;

            //写入配置文件
            String url = "D:\\Star Rail\\Game";//文件路径
            OutputStream outputStream = new FileOutputStream(url + "\\config.ini");
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(scanner.hasNext()){
                string = scanner.nextLine();
                printWriter.println(string);
            }
            printWriter.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
