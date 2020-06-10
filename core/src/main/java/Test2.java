import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.*;
import org.apache.hadoop.util.ReflectionUtils;

import ru.yandex.clickhouse.BalancedClickhouseDataSource;
import ru.yandex.clickhouse.ClickHouseConnection;
import ru.yandex.clickhouse.settings.ClickHouseProperties;

import java.io.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


/**
 * @author haowang
 * @date 2020-06-09 1:34 下午
 */
public class Test2 {
  public static void main(String[] args) throws Exception {
    func1();

  }

  public static void func1() throws Exception {
    BalancedClickhouseDataSource dataSource;
    ClickHouseProperties properties = new ClickHouseProperties();
    ClickHouseConnection connection = null;
    Statement statement = null;

    properties.setUser("");
    properties.setPassword("");
    properties.setDatabase("data");

    dataSource = new BalancedClickhouseDataSource("jdbc:clickhouse://localhost:8123", properties);

    try {
      connection = dataSource.getConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    File file = new File("/Users/haowang/IdeaProjects/test/OrcTest/src/main/resources/part-m-00000.snappy");
    Configuration conf = new Configuration();
    Class codecClass = SnappyCodec.class;
    CompressionCodec codec = (CompressionCodec) ReflectionUtils.newInstance(codecClass, conf);
    Decompressor deCompressor = CodecPool.getDecompressor(codec);

    CompressionInputStream cis = codec.createInputStream(new FileInputStream(file), deCompressor);

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cis, "utf8"));


    try {
      statement = connection.createStatement();


      String line = null;
      int i = 1;
      StringBuffer sb = new StringBuffer();
      sb.append("INSERT INTO data.test FORMAT JSONEachRow");
      System.out.println(new Date().toString());
      while ((line = bufferedReader.readLine()) != null) {
        if (i % 200000 == 0) {
          statement.executeUpdate(sb.toString());
          connection.commit();
          statement.clearBatch();
          sb = new StringBuffer();
          sb.append("INSERT INTO data.test FORMAT JSONEachRow");
        }
        sb.append("\n");
//        sb.append(line.replaceAll("\r|\n|\t|", " ").replace("\001", "\t"));
        sb.append(UserUtil.formattedItem(line));
        i++;

//      System.out.println(line.split("\\001")[1]);
//      System.out.println(line.replace("\001", "\t"));
      }

      statement.executeUpdate(sb.toString());
      connection.commit();
      statement.clearBatch();
      System.out.println(new Date().toString());

      statement.close();
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (statement != null) {
          statement.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      try {
        if (connection != null) {
          connection.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
//    IOUtils.copyBytes(cis, new FileOutputStream("/Users/haowang/IdeaProjects/test/OrcTest/src/main/resources/part-m-00000"), 1024);
      cis.close();
    }
  }

  public static void func2() throws Exception {

    File file = new File("/Volumes/Allen/xdata/users/inc/2018-10-27/part-m-00000.snappy");
    File outfile = new File("/Volumes/Allen/xdata/users/inc/2018-10-27/part-m-00000");

    Configuration conf = new Configuration();
    Class codecClass = SnappyCodec.class;
    CompressionCodec codec = (CompressionCodec) ReflectionUtils.newInstance(codecClass, conf);
    Decompressor deCompressor = CodecPool.getDecompressor(codec);

    CompressionInputStream cis = codec.createInputStream(new FileInputStream(file), deCompressor);

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cis));

    String line;
    FileOutputStream fileOutputStream = new FileOutputStream(outfile);
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

    int i = 0;
    while ((line = bufferedReader.readLine()) != null) {

//      System.out.println(line.split("\\001")[1]);
//      System.out.println(line.replace("\001", "\t"));
//      if (line.contains("49480160")) {
//        System.out.println(line);
//        System.out.println(line.replace("\001", "\t"));
//        System.out.println(line.replaceAll("\\r|\\n|\\t", " ").replace("\001", "\t"));
//      }
//      bufferedWriter.write(line.replaceAll("\r|\n|\t", " ").replace("\001", "\t"));
//      bufferedWriter.newLine();

//      System.out.println(UserUtil.formattedItem(line));
      UserUtil.formattedItem(line);
      if (i++ % 10000 == 0) {
        System.out.println(i);
      }

    }


//    IOUtils.copyBytes(cis, new FileOutputStream("/tmp/part-m-00000"), 1024);
  }
}

