package baseball

import camp.nextstep.edu.missionutils.Randoms
import kotlin.system.exitProcess

fun main() {
    var userInput : Int
    var userAnswer : String

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

        // 출력문 실행
        println("숫자 야구 게임을 시작합니다.")

        while (true) {
            // 사용자가 서로다른 3자리 수를 입력 안내 표시
            //  예외처리- 입력된 값이 수가 아니거나(Q.기존에 표시되는 오류를 변경해야 하는지?),
            //          1,10,100의 자리 수를 구분
            //          입력된 3개의 수중 2개가 같은 수일때,
            //          3개의 수보다 크거나 작을때
            print("숫자를 입력해주세요 : ")
            userInput = readLine()!!.toInt()
            userAnswer = userInput.toString()

            if (userInput < 100 || userInput > 999) {
                // 예외 IllegalArgumentException 출력 후 종료
                throw IllegalArgumentException("3자리의 수만 입력이 가능합니다.")
            }

            if (userAnswer[0] == userAnswer[1] || userAnswer[0] == userAnswer[2]
                || userAnswer[1] == userAnswer[2]
            ) {
                // 예외 IllegalArgumentException 출력 후 종료
                throw IllegalArgumentException("3개의 수는 모두 다른 수여야 합니다.")
            }
        }


    }

    // todo: kotlin 코드 컨벤션에서 가이드 확인
}