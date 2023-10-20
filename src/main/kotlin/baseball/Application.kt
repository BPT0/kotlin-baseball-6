package baseball

import camp.nextstep.edu.missionutils.Randoms
import kotlin.system.exitProcess

fun main() {
    while (true) {
        // 컴퓨터의 임의 숫자3자리 생성 - random 라이브러리 활용
        val computerAnswer = mutableListOf<Int>()
        while (computerAnswer.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!computerAnswer.contains(randomNumber)) {
                computerAnswer.add(randomNumber)
            }
        }

        // 생성된 랜덤수 확인 코드
        /*computerAnswer.forEach { answer ->
            print("$answer")
        }
        println()*/
    }

    // todo: kotlin 코드 컨벤션에서 가이드 확인
}