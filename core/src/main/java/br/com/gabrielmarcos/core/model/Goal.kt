package br.com.gabrielmarcos.core.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "future_goal")
data class Goal(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String = "",
    @ColumnInfo(name = "description") val description: String = "",
    @ColumnInfo(name = "status") val status: String? = Status.TODO.name,
    @ColumnInfo(name = "initAt") val initAt: Long = 0,
    @ColumnInfo(name = "finishAt") val finishAt: Long? = 0,
    @ColumnInfo(name = "remember") val remember: Boolean? = false,
    @ColumnInfo(name = "rememberAt") val rememberAt: Long? = 0
)

enum class Status {
    TODO,
    PROGRESS,
    DONE
}