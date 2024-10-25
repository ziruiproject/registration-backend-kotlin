package com.zirui.belajar.entities

import jakarta.persistence.*

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    @Column(nullable = false, length = 75)
    var fullName: String,
    @Column(nullable = false, unique = true, length = 75)
    var email: String,
    @Column(nullable = false)
    var password: String
)