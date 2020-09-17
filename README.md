# SimpleDropwizard
a Simple Dropwizard Application 

This project is a java web application by dropwizard.

# what is dropwizard?

Dropwizard is a sneaky way of making fast Java web applications.

For more details, please reference to https://github.com/dropwizard/dropwizard

# How to Run this project?

## environment prepare

* JDK8

* maven3

If your network is too weak to download dropwizard dependencies, you can set up maven configuration.xml with aliyun maven mirror. 

```$xslt
<mirror>
        <id>nexus-aliyun</id>
        <mirrorOf>central</mirrorOf>
        <name>Nexus aliyun</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public</url>
</mirror>
```

## build project

```$xslt
mvn clean package
```

## run the application

```$xslt
java -jar target/SimpleDropwizard-1.0-SNAPSHOT.jar  server hello-world.yml
```

after seconds, the application start successfully, you can see something like followings:

```$xslt
INFO  [2011-12-03 00:38:32,927] io.dropwizard.cli.ServerCommand: Starting hello-world
INFO  [2011-12-03 00:38:32,931] org.eclipse.jetty.server.Server: jetty-7.x.y-SNAPSHOT
INFO  [2011-12-03 00:38:32,936] org.eclipse.jetty.server.handler.ContextHandler: started o.e.j.s.ServletContextHandler{/,null}
INFO  [2011-12-03 00:38:32,999] com.sun.jersey.server.impl.application.WebApplicationImpl: Initiating Jersey application, version 'Jersey: 1.10 11/02/2011 03:53 PM'
INFO  [2011-12-03 00:38:33,041] io.dropwizard.setup.Environment:

    GET     /hello-world (com.example.helloworld.resources.HelloWorldResource)

INFO  [2011-12-03 00:38:33,215] org.eclipse.jetty.server.handler.ContextHandler: started o.e.j.s.ServletContextHandler{/,null}
INFO  [2011-12-03 00:38:33,235] org.eclipse.jetty.server.AbstractConnector: Started BlockingChannelConnector@0.0.0.0:8080 STARTING
INFO  [2011-12-03 00:38:33,238] org.eclipse.jetty.server.AbstractConnector: Started SocketConnector@0.0.0.0:8081 STARTING
```
## request application

[click here to say hello](http://localhost:8080/hello-world)

[click here to get even friendlier](http://localhost:8080/hello-world?name=Successful+Dropwizard+User)