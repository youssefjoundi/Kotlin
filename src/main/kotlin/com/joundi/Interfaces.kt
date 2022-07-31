package com.joundi

interface Time {
    fun setTime(hours : Int, min : Int = 0, sec: Int = 0)
    fun setTime(time: currentTime) = setTime(time.hours)
}

interface pastTime {
    fun setTime(time: currentTime){}
}

class currentTime{
    var hours : Int = 0;
    var minutes : Int = 0;
    var seconds : Int = 0;
}

class yetTime : Time, pastTime {
    override fun setTime(hours: Int, min: Int, sec: Int) {
        TODO("Not yet implemented")
    }

    override fun setTime(time: currentTime) {
        super<Time>.setTime(time)
        super<pastTime>.setTime(time)
    }
}