# MookJiBa Game

## GameView
- RadioButton을 이용해 3개의 묵찌빠를 선택

## GameModel
- PlayingMookJiBa와 묵찌빠엔 현재 누가 공격하고 있는지를 나타내는 isUserAttack르 유지하고 있다.

## GameResult
- 게임으 결과를 나타내는 열거형 타입
- 열거형 : MOOK, JI, BA

## ComputerPlayer class
- 묵찌빠 게임에서 컴퓨터르 처리하는 클래스

## PlayingStrategy interface
- 컴퓨터 플레이어가 다음 손 모양으 결정학 위하 알고리즘을 구현하는 클래스들이 공통적으로 가져야 하는 인터페이스를 정의함

## RandomStrategy class
- 다음에 낼 손을 결정하는 전략으로 랜덤으로 접근하는 전략

## LastHandBasedStrategy class
- 지난번에 제시한 손과 다른 손 중 하나를 내 확률이 높다고 가정하여 만든 전략
