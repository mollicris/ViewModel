package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel


class MainActivityViewModel : ViewModel() {

    private var total = 0

    fun getResult():Int{
        return  total
    }

    fun setResult(inputText:Int){
     total += inputText
    }
}