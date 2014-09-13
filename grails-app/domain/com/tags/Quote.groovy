package com.tags

class Quote {
	
	String text
	static belongsTo = [person:Person]

    static constraints = {
    }
}
