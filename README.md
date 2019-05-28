# Spring Boot + JPA - Lazy Loading Example

This application shows how lazy loading works in Spring Boot + JPA.
Also, it shows how you can eagrly fetch the lazy loaded defined entity.

## Getting Started
There are 4 entities in this example `Country`, `User`, `LocationDivision` and `Store`.
Each Store is assigned to a Location Division.
Each Location Division has a country and a user who manages that location division.

This is how all these entities have relationships.

To understand how lazy and eager loading works please refer `LocationDivisionController.java` and `StoreController.java`
Each controller has `lazy` and `eager` methods.

In case if you have any query please raise is as issue in Github.

## Build With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Ankur Raiyani** 
