package com.example.springpractice.support.error

class CoreApiException(
    val errorType: ErrorType,
    val data: Any? = null,
) : RuntimeException(errorType.message)