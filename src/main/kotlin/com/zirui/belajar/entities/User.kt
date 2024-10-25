package com.zirui.belajar.entities

import jakarta.persistence.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    @Column(nullable = false, length = 75)
    var fullName: String,
    @Column(nullable = false, unique = true, length = 75)
    var email: String,
    @Column(nullable = false)
    var password: String
)