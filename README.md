# Demo for [Letsdev Error Code API](https://github.com/merge-simpson/letsdev-error-code-api)

[letsdev-error-code-api](https://github.com/merge-simpson/letsdev-error-code-api)는
Spring 프레임워크 의존성을 일부 포함하며, 이는 JitPack 배포의 시행착오를 유발합니다.  

JitPack이 빌드에 사용하는 기본 JDK 버전(1.8)과 호환되지 않는 스프링 부트 라이브러리 버전을 발견하고,
bootJar를 비활성화하고 jar를 활성화하며 Maven 배포 포맷에 맞는 파일 이름으로 빌드되도록 설정하고,
Jitpack에서 OpenJDK 21을 사용해 빌드하도록 설정하며,
자바 호환성 버전은 소스와 타깃 모두 1.8로 설정하는 과정 등을 확인할 수 있었던 레포지터리입니다.
