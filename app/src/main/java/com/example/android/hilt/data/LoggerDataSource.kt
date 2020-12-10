package com.example.android.hilt.data

/*
 * Created by kth on 2020-12-10.
 */
interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}