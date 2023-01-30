package com.example.todolist.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity   // 어떤 구성요소인지를 알려주려면 꼭 어노테이션을 써주어야 한다.
          // Annotation : @을 이용하여 프로그램에 추가 정보를 제공하는 방법, 이를 통해 컴파일러가 특정 오류를 억제하거나 실행 시 특정 행동을 하게 된다.
data class TodoEntity (  // data class는 소괄호?
    @PrimaryKey(autoGenerate = true) var id : Int? = null, // 모든 테이블은 기본 키(Primary key)가 있어야 한다. 각 정보를 식별하는 값이라 생각 ex) 주민번호, 학번
                                                           // Todo테이블의 기본키로 id를 생성, 새로운 값이 생성될 때 id가 자동 1씩 증가 (autoGenerate = true)
    @ColumnInfo(name="title") val title : String,          // 각 할 일에 저장될 내용(title)과 중요도(importance)를 String, Inte형으로 생성
    @ColumnInfo(name="importance") val importance : Int
        )