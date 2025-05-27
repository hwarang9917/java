package ch18.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 경로 입력
        System.out.print("원본 파일 경로: ");
        String sourcePath = scanner.nextLine();
        System.out.print("복사 파일 경로: ");
        String targetPath = scanner.nextLine();

        // 2. 원본 파일 존재 여부 확인
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
            return;
        }

        // 3. 복사파일 경로 디렉토리 생성
        File targetFile = new File(targetPath);
        File parentDir = targetFile.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        // 4. 복사 수행 (try-with-resources)
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile));
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("복사가 성공되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
