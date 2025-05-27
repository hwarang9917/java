package ch18.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) throws IOException {

        String originFileName = null;
        String targetFileName = null;

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로:");
        originFileName = scanner.nextLine();
        System.out.print("복사 파일 경로:");
        targetFileName = scanner.nextLine();
         */

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("원본 파일 경로:");
        originFileName = br.readLine();

        System.out.print("복사 파일 경로:");
        targetFileName = br.readLine();

        try (br; isr) {
            File originalFile = new File(originFileName);
            if (originalFile.exists()) {
                int lastSlashIndex = targetFileName.lastIndexOf("/");
                File directory = new File(targetFileName.substring(0, lastSlashIndex));
                if (!directory.exists()) {
                    directory.mkdirs();
                }

                InputStream is = new FileInputStream(originalFile);
                OutputStream os = new FileOutputStream(targetFileName);

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (bos; bis; os; is;) {
                    byte[] data = new byte[1024];
                    int len = 0;

                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                    bos.flush();
                }

                System.out.println("복사가 성공되었습니다.");

            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        }
    }
}