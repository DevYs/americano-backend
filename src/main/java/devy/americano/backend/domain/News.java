package devy.americano.backend.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** 뉴스기사 */
@Getter @Setter @ToString
public class News {
    /** 뉴스기사 식별자 */
    private int newsNo;
    /** 뉴스기사 제목 */
    private String title;
    /** 뉴스기사 원본 링크 */
    private String link;
    /** 뉴스기사 요약 */
    private String description;
    /** 발행일 */
    private LocalDateTime pubDate;
    /** 기사내용 이미지 */
    private String image;
    /** 기자명 */
    private String author;
    /** 등록일 */
    private LocalDateTime regDate;

    public void setRegDate(String regDate) {
        this.regDate = LocalDateTime.parse(regDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).plusHours(9);
    }
}