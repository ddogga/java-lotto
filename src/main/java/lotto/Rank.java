package lotto;

import java.util.Arrays;

public enum Rank {

    FIRST(6, 2000000000, false),
    SECOND(5,3000000, true),
    THIRD(5, 1500000, false),
    FOURTH(4, 50000, false),
    FIFTH(3, 5000, false),
    NOTHING(0,0, false);


    private final int prize;
    private final int winNum;
    private final boolean bonus;

    Rank(int winNum, int prize, boolean bonus) {
        this.prize = prize;
        this.winNum = winNum;
        this.bonus = bonus;
    }

    //개수로 랭크 판별
    public static Rank getRank(int matchedNumCnt,boolean isbonusMatched) {
        return Arrays.stream(values())
                .filter(rank -> rank.winNum == matchedNumCnt && rank.bonus == isbonusMatched)
                .findFirst()
                .orElse(NOTHING);
    }

    public int getPrize(){
        return prize;
    }
}
