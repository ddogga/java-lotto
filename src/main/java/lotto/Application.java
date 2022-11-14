package lotto;

import java.util.List;

public class Application {
    public static void main(String[] args) {


        // TODO: 프로그램 구현

        //구입금액 입력 받기
        int price = InputNum.askPrice();

        //로또 개수 구하기
        int lotto_cnt = Calculator.countLotto(price);

        Print.printLottoCnt(lotto_cnt);
        
        //로또 발행하기
        List<Lotto> lottos = Publish.makeLottoNums(lotto_cnt);
        
        //당첨 번호 입력 받기
        List<Integer> winningNums = InputNum.askWinningNumbers();

        //수익률 구하기
        double rate = Calculator.CalculateRate(lottos, winningNums);
        System.out.println("rate = " + rate);
        
        
        

    }



}
