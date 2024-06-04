package com.example.hs.global.mail;

public class MailConstant {
  public static final String MAIL_DOMAIN = "http://localhost:8080";
  public static final String MAIL_TITLE_FOR_CERTIFIED = "회원가입 이메일 인증";
  public static final String MAIL_TEXT = "이메일 인증 후 서비스 사용이 가능합니다.<br>";

  public static final String EMAIL_AUTH = "<a href='%s/mails/check/%s/%s'> 이메일 인증 </a> <span>";
  public static final String EXPIRED_TIME_MENTION ="이 링크는 %s까지 유효합니다.";
  public static final int EMAIL_VERIFICATION_LIMIT_IN_SECONDS = 600;
}
