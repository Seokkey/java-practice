package com.java005.programming_basic;

/**
 * 입문 005.자바 프로그래밍의 기본
 *
 * <p>Study Goal : 조건문 반복문을 이용한 프로그래밍 흐름의 이해
 */
public class ProgrammingBasic {
  public static void main(String[] args) {
    // 1. 프로그램 실행 순서
    // 프로그램은 위에서 아래로 순차적(Sequence)으로 실행된다.
    // 프로그램의 순서를 제어하기 위함 조건문에는 if, switch, 삼항연산자(?:)가 있다.
    // 프로그램의 특정 부분을 반복시키는 반복문에는 for, while, do~while이 있다.
    // 조건문과 반복문을 이용해 문제를 해결하는 것을 "알고리즘" 이라고 한다.

    // 2. 주석
    // 한줄 주석

    /*
     * 여러 줄 주석
     */

    // 3. 조건문
    // 참, 거짓에 따라 if ~ else
    // 정수값에 따라 switch ~ case

    // 홀수 짝수 판단
    int temp = 100;
    if(temp%2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }

    //else if 구문
    if (temp == 100) {
      System.out.println("100이랑 같음");
    } else if (temp > 100) {
      System.out.println("100 보다 큼");
    } else {
      System.out.println("100 보다 작음");
    }

    // 간단한 if~else 구문은 삼항 연산자
  }

}
