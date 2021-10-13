package com.example.xml_format_assignment

class Students {
    var id: Int = 0
    var name: String? = null
    var marks: Float = 0.toFloat()

    override fun toString(): String {
        return " Id = $id \n Name = $name \n Salary = $marks"
    }
}