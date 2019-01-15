package com.reloadbet.stage.utils

import java.util.*

object RandomData {
    fun fio(wordLength: Int) = getRandomString(1, false) + getRandomString(wordLength - 1, true)


    private fun getRandomString(len: Int, isLower: Boolean) = Random().let { random ->
        val start = (if (isLower) 'а' else 'А').toInt()
        val bound = (if (isLower) 'я' - 'а' else 'Я' - 'А') + 1
        (1..len).joinToString("") { (start + random.nextInt(bound)).toChar().toString() }
    }

    fun iduser() = Random().let { "${it.nextInt(9000) + 1000}" + "%06d".format(it.nextInt(1_000_000)) }
    fun getPhoneNumber() = Random().let { "${it.nextInt(900) + 100}" + "%07d".format(it.nextInt(1_000_00_00)) }
    fun getPhoneNumberStartWith9() = Random().let { "${it.nextInt(100) + 900}" + "%07d".format(it.nextInt(1_000_00_00)) }


}

