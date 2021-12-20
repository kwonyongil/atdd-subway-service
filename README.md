<p align="center">
    <img width="200px;" src="https://raw.githubusercontent.com/woowacourse/atdd-subway-admin-frontend/master/images/main_logo.png"/>
</p>
<p align="center">
  <img alt="npm" src="https://img.shields.io/badge/npm-%3E%3D%205.5.0-blue">
  <img alt="node" src="https://img.shields.io/badge/node-%3E%3D%209.3.0-blue">
  <a href="https://edu.nextstep.camp/c/R89PYi5H" alt="nextstep atdd">
    <img alt="Website" src="https://img.shields.io/website?url=https%3A%2F%2Fedu.nextstep.camp%2Fc%2FR89PYi5H">
  </a>
  <img alt="GitHub" src="https://img.shields.io/github/license/next-step/atdd-subway-service">
</p>

<br>

# 지하철 노선도 미션
[ATDD 강의](https://edu.nextstep.camp/c/R89PYi5H) 실습을 위한 지하철 노선도 애플리케이션

<br>

## 🚀 Getting Started

### Install
#### npm 설치
```
cd frontend
npm install
```
> `frontend` 디렉토리에서 수행해야 합니다.

### Usage
#### webpack server 구동
```
npm run dev
```
#### application 구동
```
./gradlew bootRun
```
<br>

## ✏️ Code Review Process
[텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

<br>

## 🐞 Bug Report

버그를 발견한다면, [Issues](https://github.com/next-step/atdd-subway-service/issues) 에 등록해주세요 :)

<br>

## 📝 License

This project is [MIT](https://github.com/next-step/atdd-subway-service/blob/master/LICENSE.md) licensed.


## 1단계
#### 기능 요구사항
- [X] LineSectionAcceptanceTest 리팩터링
    - [X] 지하철 구간을 관리하는 테스트로 통합
    - [X] static 메서드 분리
- [X] LineService 리팩터링
    - [X] 서비스 내의 비즈니스 로직 line 도메인으로 이동
    - [X] 거리 역할 클래스 추가
    - [X] 구간 클래스 도메인 로직 추가
    - [X] 구간 목록 역할 클래스 추가
    - [X] 역 목록 역할 클래스 추가
    - [X] 역 응답 목록 클래스 추가
- [X] 공통 에러처리

#### 코드리뷰
- [X] `NoSuchElementException` 대신 용도에 맞는 새로운 Exception 생성

## 2단계
#### 기능 요구사항
- [X] 최단 경로 조회 인수 테스트 만들기
    - [X] 정상적으로 경로 조회 인수 테스트 생성 ((Outside In)
    - [X] 출발역과 도착역이 같은 경우 인수 테스트 생성 (Inside Out)
    - [X] 출발역과 도착역이 연결이 되어 있지 않은 경우 인수 테스트 생성 (Inside Out)
    - [X] 존재하지 않은 출발역이나 도착역을 조회 할 경우 인수 테스트 생성 (Inside Out)
- [X] 최단 경로 조회 기능 구현하기
    - [X] 정상적으로 경로 조회 (Outside In)
        - [X] PathService 코드 구현
        - [X] PathFinder 코드 구현
    - [X] 출발역과 도착역이 같은 경우 에러(Inside Out)
    - [X] 출발역과 도착역이 연결이 되어 있지 않은 경우 에러(Inside Out)

#### 코드 리뷰
- [X] graph와 sections가 직접적으로 의존하지 않도록 변경?

## 3단계
#### 기능 요구사항
- [X] 토큰 발급 기능 (로그인) 인수 테스트 만들기
    - [X] 로그인 시도 인수 테스트 생성
    - [X] 로그인 실패 인수 테스트 생성
    - [X] 유효하지 않은 토큰 인수 테스트 생성
- [X] 인증 - 내 정보 조회 기능 완성하기
    - [X] 나의 정보를 관리 인수 테스트 생성
        - [X] 나의 정보 수정 인수 테스트 생성
        - [X] 나의 정보 목록 조회 인수 테스트 생성
        - [X] 나의 정보 삭제 인수 테스트 생성
    - [X] 토큰을 통한 인증 구현
        - [X] 나의 정보 수정 기능 토큰 사용하도록 구현
        - [X] 나의 정보 목록 조회 기능 토큰 사용하도록 구현
        - [X] 나의 정보 삭제 기능 토큰 사용하도록 구현

- [X] 인증 - 즐겨찾기 기능 완성하기
    - [X] 인증을 포함하여 전체 ATDD 사이클 구현
        - [X] 즐겨찾기 생성 인수 테스트 생성
        - [X] 즐겨찾기 생성 기능 구현
        - [X] 즐겨찾기 목록 조회 인수 테스트 생성
        - [X] 즐겨찾기 목록 조회 기능 구현
        - [X] 즐겨찾기 삭제 인수 테스트 생성
        - [X] 즐겨찾기 삭제 기능 구현
        - [X] 즐겨찾기 중복 생성 시 에러
        - [X] 존재하지 않는 즐겨찾기 삭제 시 에러
        - [X] 권한이 없는 즐겨찾기 삭제 시 에러

## 4단계
#### 기능 요구사항
- [X] 경로 조회 시 거리 기준 요금 정보 포함하기
    - [X] 금액 계산 기능 추가
        - [X] 기본운임(10㎞ 이내) : 기본운임 1,250원
        - [X] 10km초과∼50km까지(5km마다 100원)
        - [X] 50km초과 시 (8km마다 100원)
- [X] 노선별 추가 요금 정책 추가
    - [X] 추가 요금이 있는 노선을 이용 할 경우 측정된 요금에 추가
    - [X] 경로 중 추가요금이 있는 노선을 환승 하여 이용 할 경우 가장 높은 금액의 추가 요금만 적용
- [X] 연령별 할인 정책 추가
    - [X] 청소년(13세 이상 ~ 19세 미만) 운임에서 350원을 공제한 금액의 20%할인
    - [X] 어린이(6세 이상 ~ 13세 미만) 운임에서 350원을 공제한 금액의 50%할인

## 참고
- [JPA 사용시 @Embedded 주의 사항](https://jojoldu.tistory.com/559)
- [A Better Way to Project Domain Entities into DTOs](https://buildplease.com/pages/repositories-dto/)
- [Domain Store](http://www.corej2eepatterns.com/DomainStore.htm)
- [생성자 주입을 권장하는 이유](https://madplay.github.io/post/why-constructor-injection-is-better-than-field-injection)
- [validation](https://meetup.toast.com/posts/223)
