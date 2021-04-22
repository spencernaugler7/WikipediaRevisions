# Project Report
Spencer Naugler

## Challenge #1 Complete

I changed a binding in the Guice config class QueryEngineModule,
from FakeQueryEngine.class to WikipediaQueryEngine.class

## Challenge #2 Complete

I added a general Formatter structure that is implemented by the old formatter
and the new CleanRevision formatter that also created.
I made a new state variable in WikipediaAnalyser that allows me to inject the formatter instead of declaring it elsewhere.

I wanted to change how the revision is formatted, so I modified the DateTimeFormatter a bit.
I just had it construct a format using non-military time, ISO standard dates, and the author of the revision listed first. 


## Challenge #3 Complete

I made a resultant string using the reduce function in java's Stream api.
the entire list is reduced into a single string Nice!!

## Reflection Question #1: Functional vs OO

Due to my experience programming being mostly in an iterative style I would still program in this way.
but I see the benefits of functional programming, there is no chance of concurrency issues which are a huge deal.

## Reflection Question #2: Polymorphism and Dependency Inversion

In this solution a polymorphic structure Formatter gave rise to dependency inversion. 
Instead of tailoring the program to work with every kind of Formatter I will make, I just have it work with a generalized formatter.
I have created a dependency inversion because higher order objects no longer rely on any individual lower order formatter.