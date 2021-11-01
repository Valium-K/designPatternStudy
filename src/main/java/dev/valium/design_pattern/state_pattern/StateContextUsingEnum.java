package dev.valium.design_pattern.state_pattern;

import java.util.Locale;

public class StateContextUsingEnum {

    /**
     * 상태를 interface 대신 enum으로 구현
     * 중첩 클래스와 같이 사용해 응집성을 높임
     */
    public enum StatusLikeEnum {
        LOWER {
            @Override
            public StatusLikeEnum writeName(String name) {
                System.out.println(name.toLowerCase(Locale.ROOT));
                return StatusLikeEnum.UPPER;
            }
        }, UPPER {
            @Override
            public StatusLikeEnum writeName(String name) {
                System.out.println(name.toUpperCase(Locale.ROOT));
                return StatusLikeEnum.LOWER;
            }
        };

        public abstract StatusLikeEnum writeName(String name);
    }

    /**
     * enum state를 이용하는 context
     */
    private StatusLikeEnum myStatus;

    public StateContextUsingEnum() {
        this(StatusLikeEnum.LOWER);
    }
    public StateContextUsingEnum(StatusLikeEnum status) {
        setState(status);
    }

    public void setState(StatusLikeEnum status) {
        this.myStatus = status;
    }
    public void writeName(final String name) {
        setState(myStatus.writeName(name));
    }
}
