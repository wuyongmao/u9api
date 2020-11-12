package com.ruoyi.utils;

import com.ruoyi.common.utils.DateUtils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CommonUtils {
    public static void WriteLog(String className, String functionName, String title, String content) {
        String result = String.format("[%s]%s%s%s%s", title, DateUtils.dateTimeNow("yyyy-MM-dd HH:mm:ss"),
                U9Constant.NewLine, content, U9Constant.NewLine);
        String rootFile = System.getProperty("user.dir") + "\\" + "CustLog" + "\\" + className + "\\" + functionName;


        String filePath = rootFile + "\\" + functionName + "_" + DateUtils.dateTimeNow("yyyyMMdd") + ".txt";
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        AppendLog(file.getPath(), result);
    }

    /// <summary>
    /// response后追加日志
    /// </summary>
    /// <param name="path"></param>
    /// <param name="result"></param>
    private static void AppendLog(String fileName, String content) {
        try {
// 打开一个随机访问文件流，按读写方式
            RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
// 文件长度，字节数
            long fileLength = randomFile.length();
// 将写文件指针移到文件尾。
            randomFile.seek(fileLength);
            randomFile.writeBytes(content + "\r\n");
            randomFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
