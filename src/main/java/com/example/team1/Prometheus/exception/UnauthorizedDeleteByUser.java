package com.example.team1.Prometheus.exception;

public class UnauthorizedDeleteByUser extends SecurityException{
    public UnauthorizedDeleteByUser(String userName) {
        super("\'" + userName + "\' 님은 삭제 권한이 없습니다.");
    }
}
