import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class BlogController extends Controller {

	//Get all items for a tag
	get("/:tag") { request: Request =>
		var tag = request.params("tag")
		response.ok.body("Get all items for tag: " + tag)
	}

	//Get individual
	get("/:tag/:date") { request: Request =>
		var tag = request.params("tag")
		var date = request.params("date")
		response.ok.body("Get item with tag: " + tag + " on " + date)
	}

	//Mongodb integration
	//_id
	//tag
	//title
	//banner image
	//Subtitle
	//text
	//inline image
}
