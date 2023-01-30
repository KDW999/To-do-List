package com.example.todolist.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao // 어떤 구성요소인지 써주자
interface TodoDao {
  @Query("SELECT * FROM TodoEntity")
  fun getAll() : List<TodoEntity> // 생성되어있는 TodoEntity에서 모든 데이터를 불러오는 쿼리 함수

  @Insert
  fun InsertTodo(todo : TodoEntity) // TodoEntity 객체를 테이블에 삽입하는 함수
  
  @Delete
  fun deleteTodo(todo : TodoEntity) // 특정 TodoEntity 객체를 테이블에서 삭제하는 함수
  
}