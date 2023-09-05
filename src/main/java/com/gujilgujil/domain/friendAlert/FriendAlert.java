package com.gujilgujil.domain.friendAlert;

import com.gujilgujil.domain.member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FriendAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Member sendMember;

    @ManyToOne(cascade = CascadeType.ALL)
    private Member receiveMember;
}
