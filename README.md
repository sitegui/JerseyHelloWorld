# Jersey Hello World

## Motivation

I was annoyed with multiple Java tutorials showing how to implement a simple REST API with Jersey and none of them that:

- explained from a completely Java noob perspective
- do not hide what's happening behind a specific IDE

I don't like clicking buttons around, show me the command line :)

Coming from a Node.js background, everything around this stack is naturally new to me and there are simply too many concepts and names to understand.
Don't get me wrong, the technology behind it all is amazing, but I just want to roll my REST API

So this is a repo to remind me how to do it cleanly (with my definition of clean, of course!)

## Shut up and show me the code

The code is actually pretty simple, there are only four short files. Just navigate the repo, I'll add lots of comments around.

It seems contradictory that I've just sad it felt much hard than I was expecting and the final result is so simple.
Well, you're right, it is crazy! But extracting those few actually necessary lines from all the references bellow was the fun part.

## How to use

With just Docker installed you can compile and run it with:

```shell script
docker build -t jersey-hello-world . && docker run --rm -p 8080:8080 jersey-hello-world
```

and then use it like

```shell script
curl -s http://localhost:8080/hi 
```

Of course, if you want to develop it you will need a bigger Java setup.
However, no hidden strings attached to any IDE, you can cleanly compile, run and debug by creating a execution target that simply does `mvn jetty:run`

## Main concepts

First, a fare warning: I have probably gotten half of the concepts wrong and I'm open for suggestions and corrections.

* Java: the language (I'm using the version 8 of the language because the codebase at work is ancient)
* OpenJDK: an implementation of the language and its tools (compiler and virtual machine)
* Maven: a package manager and building tool
* JavaRX: a specification on how to implement REST stuff in Java
* Jersey: an implementation of JavaRX (there are others, I've chosen this one because I've heard nice things about)
* WAR: the deployable JAVA bundle, with my compiled code and all dependencies
* Jetty: a HTTP server that encapsulates the Jersey WAR

## References

TODO

