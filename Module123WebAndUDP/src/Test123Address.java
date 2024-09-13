import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test123Address {
    public static void main(String[] args) throws UnknownHostException {
        //public static InetAddress getByName(String host):确定主机名称
//        InetAddress address = InetAddress.getByName("Cuber-txm");
        InetAddress address = InetAddress.getByName("10.202.0.24");

        //public String getHostName ():获取此IP地址的主机名
        String name = address.getHostName();
        //public String getHostAddress():返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);
    }
}
