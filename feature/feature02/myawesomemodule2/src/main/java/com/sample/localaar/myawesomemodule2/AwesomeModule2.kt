package com.sample.localaar.myawesomemodule2

import com.sample.localaar.myawesomemodule3.AwesomeModule3
import com.sample.localaar.myawesomemodule3.AwesomeStandAloneModule


open class AwesomeModule2{
    companion object {
        val greet = "Hello from AwesomeModule2" + "\n" + AwesomeModule3.greet + "\n" + AwesomeStandAloneModule.greet
    }
}