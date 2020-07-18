package org.xmart.elections.models

data class Candidate(
    val name: String,
    val info: String,
    val type: Type = Type.PERSON
) {

    enum class Type {
        PERSON, AGAINST_ALL
    }

}