package org.choongang.board.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.choongang.commons.entities.Base;
import org.choongang.commons.entities.BaseMember;
import org.choongang.member.entities.Member;

import java.util.UUID;

@Data
@Entity
public class BoardData extends Base {
    @Id @GeneratedValue
    private Long seq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boardSeq")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberSeq")
    private Member member;

    private String gid = UUID.randomUUID().toString();

    private String poster; // 작성자
    private String guestPw; // 비회원 비밀번호

    private boolean notice; // 공지글 여부 - true : 공지글

    private String subject;
    private String content;
    
    private int viewCount; // 조회수
    
    private int num1; // 추가 필드 : 정수
    private int num2; // 추가 필드 : 정수
    private int num3; // 추가 필드 : 정수

    private String test1; // 추가 필드 : 한줄 텍스트
    private String test2; // 추가 필드 : 한줄 텍스트
    private String test3; // 추가 필드 : 한줄 텍스트
    
    private String longText1; // 추가 필드 : 여러줄 텍스트
    private String longText2; // 추가 필드 : 여러줄 텍스트
    private String longText3; // 추가 필드 : 여러줄 텍스트
    
}
























