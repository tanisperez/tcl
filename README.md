# TCL (Tanis's Common Library)
This project is a Java Library with some utilities and other stuff used in my personal projects. The main reason to wrapper some Java default functions such as *trim()* or *split()* is to guarantee null safety. 

This project is inspired by the Apache Commons Library, but with my own implementations and utilities.

Unit testing is a must in this kind of projects, so TDD is the best aproach to develop a library like this one.

## Modules
This is a multi-module maven project with the following utilities.

### Core
This module contains some utiltes to work with the Java API Collection, String, etc...

* **collection package**
    * CollectionUtils
        * *isEmpty()*

* **converter package**
    * Converter interface
    * BiConverter interface
    * AbstractConverter
    * AbstractBiConverter

* **number package**
    * NumberUtils
        * *isNumber()*

* **string package**
    * StringUtils
        * *isEmpty()*
        * *isBlank()*
        * *trim()*
        * *toLowerCase()*
        * *toUpperCase()*
        * *split()*

* **date package**
    * ZonedDateTimeUtils
        * *now()*
    
### MyBatis (Planned)
Custom MyBatis utilities such as TypeHandlers.

### Spring AOP (Planned)
Custom Java annotations with Aspects to achieve common tasks such as:
* Logging.
* REST security.
* Audit.

### And many moore...
