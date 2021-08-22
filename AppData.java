import java.nio.charset.StandardCharsets;

public class AppData {
    private String[] header;
    private int[] data;

    public AppData(String[] header, int[] data){
        this.header = header;
        this.data = data;
    }

    public AppData(){}

    public byte[] getHeader() {
        StringBuilder builder = new StringBuilder();
        for (String item: header) {
            builder.append(item+";");
        }
        builder.append('\n');
        return builder.toString().getBytes(StandardCharsets.UTF_8);}
    public byte[] getData() {
        StringBuilder builder = new StringBuilder();
        for (int item: data) {
            builder.append(item+";");
        }
        builder.append('\n');
        return builder.toString().getBytes(StandardCharsets.UTF_8);}

    public void setData(int[] data) {this.data = data;}
    public void setHeader(String[] header) {this.header = header;}
}
