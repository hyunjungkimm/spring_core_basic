package hello.core.member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements MemberRepository {

    private static final Map<Long, Member> storage = new ConcurrentHashMap<>();

    @Override
    public void save(Member member) {
        storage.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return storage.get(memberId);
    }
}
