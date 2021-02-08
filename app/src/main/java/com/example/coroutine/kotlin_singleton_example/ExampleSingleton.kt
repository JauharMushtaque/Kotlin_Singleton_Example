package com.example.coroutine.kotlin_singleton_example

import com.example.coroutine.kotlin_singleton_example.model.User

object ExampleSingleton {

    val singletonUser:User by lazy {
        User("mitchelltabian@gmail.com", "ALI JAUHAR", "some_image_url.png")
    }
}