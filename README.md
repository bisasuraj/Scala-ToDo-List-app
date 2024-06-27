# To-Do List Application

A simple to-do list application built with the Play Framework in Scala. This application allows users to add and remove tasks, following the MVC (Model-View-Controller).

## Overview of Structure
This Scala application follows the MVC architecture:

Model: Task.scala defines the task data structure.
View: index.scala.html presents the task list and forms.
Controller: HomeController.scala handles user interactions and updates the model accordingly.
Routes: routes file maps URLs to controller actions.


## Prerequisite
Make sure to install Scala 
https://docs.scala-lang.org/getting-started/index.html

## Installation

### Clone the Repository:
git clone https://github.com/your-username/todo-list-play.git](https://github.com/bisasuraj/Scala-ToDo-List-app/

### Run the Application:
sbt run

## Usage
1. Go to `http://localhost:9000/tasks`.
2. Fill in the "Title" and "Description" fields in the "Add New Task" section.
3. Click the "Add Task" button. The new task will be added to the list.
4. Click the "Remove" button next to the task you wish to delete. The task will be removed from the list.

