package com.example.telegramanimalshelterholiday.exception;

import lombok.Getter;

@Getter
public class NotFoundConfigException extends RuntimeException {

    private final String NOT_FOUND_EXCEPTION_DESCRIPTION = "Данных для интеграции не найдено";

}
