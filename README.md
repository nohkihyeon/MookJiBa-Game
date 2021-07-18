# 전략패턴
 - 패턴의 분류 : 행위패턴
 - 패턴의 목적 : This pattern defines a family of algorithms, encapsulates each one, and make them inter- changeable. It lets the algorithm vary independently from clients that use it. – GoF –
 - 패턴의 수준 : component
 - 패턴의 적용
   - 한 행위를 다양하 수행해야 하는 경우
   - 실행시간까지 객체의 행위 방법을 결정할 수 없는 경우
   - 행위를 수행하는 방법을 쉽게 추가하고 싶은 경우
   - 행위를 추가하면서 코드의 크기를 효과적으로 관리하고 싶을 경우
 - 패턴 적용 가능 시나리오
   - 게임에서 어떤 캐릭터가 다양한 무기를 사용하여 적을 공격할 수 있다.
   - 게임에서 레벨에 따라 특정 유니트가 움직이는 방법이 다르다.
 - 패턴의 참여자
   - 전략 interface: 전략 메소드의 골격이 선언되어 있는 interface
   - 전략 클래스: 전략이 구체적으로 구현되어 있는 클래스. 보통 다수 존재.
   - 클라이언트 클래스: 전략을 활용하는 클래스
 - 패턴의 구조
 
> # MookJiBa Game
>
> ## GameView
> - RadioButton을 이용해 3개의 묵찌빠를 선택
>
> ## GameModel
> - PlayingMookJiBa와 묵찌빠엔 현재 누가 공격하고 있는지를 나타내는 isUserAttack르 유지하고 있다.
>
> ## GameResult
> - 게임으 결과를 나타내는 열거형 타입
> - 열거형 : MOOK, JI, BA
>
> ## ComputerPlayer class
> - 묵찌빠 게임에서 컴퓨터르 처리하는 클래스
>
> ## PlayingStrategy interface
> - 컴퓨터 플레이어가 다음 손 모양으 결정학 위하 알고리즘을 구현하는 클래스들이 공통적으로 가져야 하는 인터페이스를 정의함
>
> ## RandomStrategy class
> - 다음에 낼 손을 결정하는 전략으로 랜덤으로 접근하는 전략
>
> ## LastHandBasedStrategy class
> - 지난번에 제시한 손과 다른 손 중 하나를 내 확률이 높다고 가정하여 만든 전략
