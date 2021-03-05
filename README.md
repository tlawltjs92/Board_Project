# Board_Project

### Spring을 이용한 게시판 

개발환경
---
* Eclipse(maven)
* sqldeveleoper
* Apache tomcat

사용언어
---
* JAVA
* Spring5
* MyBatis
* Oracle

설명
---
* Front-end 는 Bootstrap을 이용하여 반응형 웹페이지로 제작
* Java Configuration을 이용하여 설정
* 로그인/로그아웃, 게시판 등록/수정/삭제, 게시판 내의 첨부파일 등록/수정/삭제, 게시판 내의 댓글 등록/수정/삭제, 페이징처리

프로젝트 구성
---
* org.zerock.controller _ 사용자의 요청에 따라 어떤 처리를 할지 결정, view로 응답해주는 파일들 위치
* org.zerock.config _ 스프링, 웹, Tomcat, 서블릿, 보안 관련 설정파일들 위치
* org.zerock.domain _ 프로젝트의 DTO, VO 파일들 위치
* org.zerock.mapper _ xml(src/main/resources/org/zerock/mapper내)에 기재된 sql을 호출하기 위한 인터페이스들 위치
* org.zerock.security _ 로그인 시 필요한 Handler와 service 파일들 위치
* org.zerock.security.domain _ 로그인 시 필요한 별도의 VO 파일 위치
* org.zerock.service _ service 와 serviceImpl 파일들 위치
* org.zerock.task _ 등록 된 파일 중 db에서 필요한 파일이 없는 경우 모든 파일을 찾아서 삭제하는 로그파일 위치
* pom.xml _ Maven에 사용하는 라이브러리 관리

DB ERD
---
![image](https://user-images.githubusercontent.com/15559600/110078962-cf9df200-7dcb-11eb-8268-26922133f6ca.png)
