package com.tags

import grails.plugin.springsecurity.annotation.Secured;

class QuoteController {

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
	def index() { 
		
		[quotes: Quote.list()]
	}
	
	@Secured(['ROLE_ADMIN'])
	def edit() {
		def quote = Quote.get(params.id )
		if (request.method == 'GET') {
			
			return [quote: quote]
		}
		
		quote.text = params.quote_text
		quote.save(flush:true)
		redirect action: 'index'
		
	}
}
