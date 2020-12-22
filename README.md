# SWA Module, Graded Exercise

## Project
Andreas Leu

Matriculation Number: 14-729-591

You might choose between following **Java** applications:
* Contact list
* Library

The delivered application should be composed of multiple **modules** resp. should generate multiple **jars**.

The **frontend** (or **view** - probably in its own **module**/**component**) might be a **REST** API or **Server Pages** based. If you implement a **REST** API, then you will have to provide me a client (i.e., **React**) or you will have to tell how I can realise the minimum requirements (see below).

To start the application, you might use one of the following mechanisms:
* Using **Java** [modules](https://github.com/ribeaud/ch.fhnw.swa.modserv.cli/blob/master/Commands.txt).
* [Repacking](https://ribeaud.github.io/SWA/lectures/5/#10) a multi-**modules** **Spring Boot** application into a single **jar**.
* Using `-classpath` **Java** option.

#### Minimum requirements

The application should be able to, at least, do the following:
* List the entities
* Create/edit one entity

You will have to use a repository (or database), where you will _persist_ the entities. This repository could be a _real_ database (deployed via **Docker** for instance), an _in-memory_ one or a simple file.

#### Suggested course of action

1. Think about the components you will need
1. Draw a component/class diagram
1. Start to code

#### Possible extensions

* Delete
* Entity:
  * `Magazine` (as extension of `book`)
  * `Company` (as extension of `Person`)
* Image upload (in its own *module*)

#### Reference applications

* [ch.fhnw.swa.modserv.cli](https://github.com/ribeaud/ch.fhnw.swa.modserv.cli)
* [myshop](https://github.com/ribeaud/blog-code-samples/tree/master/myshop)
* [PetClinic](https://github.com/spring-projects/spring-petclinic)

## Project delivery

###How to start the project:
To start the application, the __MyLibrarySWA__ in the __App__ package has to be launched.

###How to test the project:
To use the functionalities, use the __requests.http__  file, located at app/.../resources has to be used.

The commands are prepared and have to be launched by pressing the green launch button on the left side. The result will then be displayed in the _run_ tab of Itellij"

###External contributions:
All the code was written by me, with help from Quetsalkoatl on Discord

###Other comments:
I have omitted the UI as the main task of this assignment was the separation of modules, not the designing of an UI.
 
###I'm particular proud of:
How minimalistic this application is while still fulfilling all it's functions

## Project grading

When asking for _testing the project_, I am talking about running Unit/Integration tests.
I do NOT count `requests.http` as integration tests as the format is IDE specific.

The idea of writing a client is to be able to gather some extra points. Nevertheless, writing a minimal version
and making use of `requests.http` is a good idea.

Kindly Refer to [GradedExercise.xlsx](GradedExercise.xlsx) for grading details.

Grade: **4.4**
