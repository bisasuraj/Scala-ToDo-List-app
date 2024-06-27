package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Task

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  var tasks = Seq(
    Task(1, "Finish homework", "Complete all assignments by Friday."),
    Task(2, "Go grocery shopping", "Buy milk, eggs, and bread.")
  )
  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(tasks))
  }
  def addTask() = Action { implicit request: Request[AnyContent] =>
    // Assuming form data is submitted with fields 'title' and 'description'
    val formData = request.body.asFormUrlEncoded
    formData.map { data =>
      val title = data("title").head
      val description = data("description").head
      val newTask = Task(tasks.length + 1, title, description)
      tasks = tasks :+ newTask
    }
    Redirect(routes.HomeController.index())
  }

  def deleteTask(id: Long) = Action { implicit request: Request[AnyContent] =>
    tasks = tasks.filterNot(_.id == id)
    Redirect(routes.HomeController.index())
  }

}
