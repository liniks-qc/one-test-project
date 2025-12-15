package com.study;

//public class GenerateBCryptPassword {
//}
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenerateBCryptPassword {
    public static void main(String[] args) {
        // 实例化 BCrypt 加密器（与项目配置一致）
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // 这里替换成你想设置的新密码（明文），例如 "newPassword123"
        String newRawPassword = "123456";
        // 生成加密后的密文
        String encodedPassword = encoder.encode(newRawPassword);
        System.out.println("新密码的 BCrypt 密文：" + encodedPassword);
    }
}
