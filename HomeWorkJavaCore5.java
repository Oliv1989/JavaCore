import java.io.*;

public class HomeWorkJavaCore5 {
    public static void main(String[] args) {
        File file = new File("test.csv");
        AppData appData = new AppData();
        appData.setHeader(new String[]{"One", "Two", "Three"});
        appData.setData(new int[]{1, 2, 3});
        try (BufferedOutputStream outputStream = new BufferedOutputStream(
                new FileOutputStream(file))) {
            if (file.length() == 0) {
                outputStream.write(appData.getHeader());
                outputStream.write(appData.getData());
            } else {
                outputStream.write(appData.getData());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder charCollector = new StringBuilder();
        try (BufferedInputStream inputStream = new BufferedInputStream(
                new FileInputStream(file))) {
            int x;
            while ((x = inputStream.read()) != -1) {
                charCollector.append((char) x);
            }
            System.out.println(charCollector);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
