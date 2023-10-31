package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import racingcar.utils.Utils;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class UtilsTest {
    @Test
    void 랜덤으로_생성한_숫자가_0과_9사이면_통과() {
        //given
        int case1 = -1;
        int case2 = 10;

        //when
        int result1 = Utils.generateRandomNumber();
        int result2 = Utils.generateRandomNumber();

        //then
        assertThat(result1 > case1 && result1 < case2);
        assertThat(result2 > case1 && result2 < case2);
    }

    @Test
    void 해시맵의_밸류들중에서_최댓값이면_통과() {
        //given
        HashMap<String,String> case1 = new HashMap<>();
        HashMap<String,String> case2 = new HashMap<>();
        HashMap<String,String> case3 = new HashMap<>();
        case1.put("one","-----"); case1.put("two","----");
        case2.put("one","-----"); case1.put("two","-----");
        case3.put("one",""); case3.put("two","");

        //when
        int result1 = Utils.measureMaxNumInHashMapValues(case1);
        int result2 = Utils.measureMaxNumInHashMapValues(case2);
        int result3 = Utils.measureMaxNumInHashMapValues(case3);

        //then
        assertThat(result1 == 5);
        assertThat(result2 == 5);
        assertThat(result3 == 0);
    }
}