package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class memberServiceTest {
    MemberService ms = new MemberServiceImpl();
    @Test
    void join(){
        //given
        Member member = new Member(1L,"뿌뿌",Grade.VIP);

        //when
        ms.join(member);
        Member findMem = ms.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMem);
    }
}
