import net.lingala.zip4j.core.ZipFile
import net.lingala.zip4j.exception.ZipException

println("duke groovy")


def unzip(File zipFile, String dest, String passwd) throws ZipException {
    ZipFile zFile = new ZipFile(zipFile);  // 首先创建ZipFile指向磁盘上的.zip文件
    //zFile.setFileNameCharset("GBK");       // 设置文件名编码，在GBK系统中需要设置
    if (!zFile.isValidZipFile()) {   // 验证.zip文件是否合法，包括文件是否存在、是否为zip文件、是否被损坏等
        throw new ZipException("压缩文件不存在或不合法,可能被损坏.");
    }
    File destDir = new File(dest);     // 解压目录
    if (destDir.isDirectory() && !destDir.exists()) {
        destDir.mkdir();
    }
    if (zFile.isEncrypted()) {
        zFile.setPassword(passwd.toCharArray());  // 设置密码
    }
    zFile.extractAll(dest);      // 将文件抽出到解压目录(解压)
}
//*************************
File file = new File("test.zip");
def dest = ".";
unzip(file, dest, "");
println("unzip file success using zip4j !");





