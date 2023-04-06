package com.sample.localaar.myawesomemodule1

import com.sample.localaar.myawesomemodule2.AwesomeModule2


class AwesomeModule1{
    companion object {
        val greet = "Hello from AwesomeModule1" + AwesomeModule2.greet
    }
}