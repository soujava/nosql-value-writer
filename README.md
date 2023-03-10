# ValueWriter Example

![MongoDB Project](http://www.jnosql.org/img/logos/mongodb.png)

You are creating a converter for Eclipse NoSQL that will work without a mapping annotation. You can use both ValueWriter and ValueReader.

* **ValueWriter**: This interface represents an instance of Value to write in a database.
* **ValueReader**: This interface represents how the Value will convert to Java application. This interface will use the <T> T get(Class<T> type) and <T> T get(TypeSupplier<T> typeSupplier).


## Steps

* The first step is to create the converter to a custom type database, the ValueWriter.
* ValueWriter created and the Money type will save as String, then the next step is read information to Java application. As can be seen, a ValueReader implementation.


After both implementations have been completed, the last step is to register them into two files:

* `META-INF/services/jakarta.nosql.ValueReader`
* `META-INF/services/jakarta.nosql.ValueWriter`

## Using Docker

1. Install docker: https://www.docker.com/
2. https://store.docker.com/images/mongo
3. Run docker command
4. Run MongoDB: verify MongoDB image name with the command `docker images`, it can be mongodb or mongo, and then execute this command 
   1. `docker run -d --name mongodb-instance -p 27017:27017 mongo`



## Run the code

With a MongoDB instance running go to the class **App** and have fun.
