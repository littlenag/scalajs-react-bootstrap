react-bootstrap for scalajs-react
=================================
Wanting to use bootstrap v4 with ScalaJS and React? Look no further!

This library adapts the [react-bootstrap](http://react-bootstrap.github.io/) JavaScript/React components 
for the [scalajs-react](https://github.com/japgolly/scalajs-react) library by japgolly.

# Status
Most of the `react-bootstrap` components now have a component representation. 
 
Note: some props parameters may be absent. If something is missing, or incorrect, please open an issue, or provide a PR. 

# Version matrix

| scalajs-react-bootstrap | scalajs-react | react-bootstrap | bootstrap |
| ----------------------- | ------------- | --------------- | --------- |
| 0.0.1-SNAPSHOT          |  1.4.1        | 1.0.0-beta.5    |     4.2   |

# How to use

Add the library as a dependency:

```
libraryDependencies += "com.github.littlenag" %%% "scalajs-react-bootstrap" % "0.0.1-SNAPSHOT"
```

You will also need to ensure that react-bootstrap is available and importable from JavaScript. The react-bootstrap library will further require: jquery, popper, and bootstrap v4.

For an example of how to use this library, as well as ensure that all dependencies are available, see the [scala-pet-store](https://github.com/littlenag/scala-pet-store/) example.