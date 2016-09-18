import com.twitter.finatra.http.HttpServer
import com.twitter.finagle.http.Request
import com.twitter.finagle.http.Response
import com.twitter.finatra.http.routing.HttpRouter

object BlogServer extends HttpServer {

	override val defaultFinatraHttpPort: String = ":8080"

	override def configureHttp(router: HttpRouter) {
		router.add[BlogController]
	}
}
