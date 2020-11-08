# SWA Module, Graded Exercise

## Commit Proposal

Matriculation Number: (_to be filled by student_)

#### Project idea short description:

You might choose between following **Java** applications:
* Contact list
* Library

The delivered application should be composed of multiple **modules** resp. should generate multiple **jars**.

I'm mainly interested in the **backend** architecture. The **frontend** (probably in its own **module**/**component**) might be a **React** client, a simple **CLI**, and/or **Server Pages** based.

To start the application, you might use one of the following mechanisms:
* Using **Java** [modules](https://github.com/ribeaud/ch.fhnw.swa.modserv.cli/blob/master/Commands.txt).
* [Repacking](https://ribeaud.github.io/SWA/lectures/5/#10) a **Spring Boot** application into a single **jar**.
* Using `-classpath` **Java** option.

#### Minimum requirements

The application should be able to at least do the following:
* List the entities
* Create/edit one entity

You will have to use a repository (or database), where you will _persist_ the entities. This repository could be a _real_ database (deployed via **Docker** for instance), an _in-memory_ one or a simple file.

#### Possible extensions

* Entity:
  * `Magazine` (as extension of `Book`)
  * `Company` (as extension of `Person`)
* Image upload (in its own *module*)

#### References

* [ch.fhnw.swa.modserv.cli](https://github.com/ribeaud/ch.fhnw.swa.modserv.cli)
* [myshop](https://github.com/ribeaud/blog-code-samples/tree/master/myshop)
* [PetClinic](https://github.com/spring-projects/spring-petclinic)

## Project delivery
(_to be filled by student_)

How to start the project:

How to test the project:

Hand-written project description:

(_could be HTML, Markdown, any other format and should contain a class/component diagram_)

External contributions:

Other comments:

I'm particular proud of:

## Project grading

(_to be filled by lecturer_)
