package com.example.umc4_heron_template_jpa.member;

import com.example.umc4_heron_template_jpa.utils.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Member extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String nickName;
    @Column(nullable = false)
    private String password;


    public Member createMember(String email, String nickName, String password){
        this.email = email;
        this.nickName= nickName;
        this.password = password;
        return this;
    }

    public void updateNickName(String nickName){
        this.nickName = nickName;
    }
}
