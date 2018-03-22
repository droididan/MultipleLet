package com.example.idan.multipulelet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * Created by Idan Ayalon on 22/03/2018.
 * Multiple let implementation
 */
class MainActivity : AppCompatActivity() {

    private var token: String? = null
    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this block of code will run only if these multiple
        token = "ab1234rwerw4324refasdf234"
        name = "Idan Ayalon"
        multipleLet(token, name) { token, name ->
            print("do something with token: $token  name: $name"  )
        }

        // when one the arguments are null this block will not run
        name = null
        multipleLet(token, name) { token, name ->
            print("do something with token: $token  name: $name"  )
        }

        // we can check if a list of items is not null by using 'whenNotNull'
        // if one of the items was null the block wont run.
        listOf("Hello","from","the","other","side").whenNotNull {
            print(it)
        }

        // 'whenAnyNotNull' extention will iteration with .any operator on the collection.
        // even if we have null on one of the items the block will still run and will give us the
        // items that are not null
        listOf("Hello","from","the",null,"side").whenAnyNotNull {
            print(it)
        }
    }
}
