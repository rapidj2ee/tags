import com.tags.Person;
import com.tags.PersonRole;
import com.tags.Quote
import com.tags.Role

class BootStrap {

    def init = { servletContext ->
		
		def adminRole = new Role(authority: "ROLE_ADMIN").save(failOnError: true)
		def userRole = new Role(authority: "ROLE_USER").save(failOnError: true)
		
		def admin = new Person(name: "Admin", username: "admin@tag.com" , password: "password" ).save(failOnError: true)
		def user = new Person(name: "User", username: "user@tag.com" , password: "password" ).save(failOnError: true)
		
		PersonRole.create(admin , adminRole)
		PersonRole.create(user, userRole)
		
		["Hello World" , "Foo Bar" , "Moar dots" , "Thank you jeeves"].each { new Quote(text: it , person: admin).save()}
		
		
    }
    def destroy = {
    }
}
