이커머스 - 물품 구매, 판매

1. 회원가입: 회원가입 시의 약관을 만들고 고객에게 보여줌. 고객이 회원으로
가입할 때 정보를 기입할 수 있도록 시스템을 만듬

2. 이메일 인증 - 고객이 이메일로 인증할 때, 이메일 확인 칸을 누른 뒤, 해당 이메일로 가서 정보를
확인할 수 있게 한다. 이 때 발생되는 오류 확인하고 해결할 장치 만듬

3. 로그인- 회원가입할 때의 ID, PW 를 집어넣고 ID, PW 가 맞는지 확인하고 아니면
“비밀번호가 맞지 않습니다.”라고 창을 띄운 뒤 다시 기입하도록 함.

4. 상품등록, 수정, 삭제 - 상품의 정보: 아이디, 판매자 아이디, 이름, 가격, 성능,
특징, 크기, 무게 등의 상세정보 기입, 수정 시 새 값 기입할 수 있는 창 만듬,
삭제 시 “정말로 삭제 하시겠습니까?”라는 창 띄우기

5. 장바구니 추가, 확인, 변경, 삭제 - 고객이 장바구니 에다 물품을 추가 시킨 뒤
어떤 물품이 담겨 있는지를 확인하고 원치 않는 물품은 명단에서 변경, 삭제하기

6. 결제 - 고객의 계좌/휴대폰번호를 적은 뒤 결제 진행. 만일 고객이 돈이 부족하다면 “돈이 부족합니다.”라고 적기

build.grade: Spring Web, Spring Data JPA, H2 Database, Lombok
 
기술 스택: Java, Spring, H2 Database
* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
출처: https://github.com/meene11/cart, 제로베이스 Part 11 전체

ERD




<img width="279" alt="스크린샷 2023-09-19 오후 9 00 32" src="https://github.com/mgcztech576/e-commerce/assets/127584002/f00d4740-0357-4b81-9766-6b0293ec18bf">

