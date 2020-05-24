import java.io.File;

/**
 * java.io.File 类
 * 文件和目录途径的抽象形式表示
 * 使用File类方法
 *      创建一个文件/文件夹
 *      删除文件
 *      获取文件
 *      判断文件是否存在
 *      对文件夹进行遍历
 */

public class Demo01File {


    public static void main(String[] args) {
        /**
         * 操作路径不能写死
         * C:\\path\\to\\file\\a.txt windows
         * C:/path/to/file/a.txt linux
         * "C:" + file.separator +
         */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator);
    }
}
