# LiquibaseExample
This is a sample Spring Boot application to demonstrate how esure applications
use Liquibase.
It is designed to be as simple as possible, to illustrate the basic principles without distracting details.

# How This Project Was Created

## 1. Start
Start with project PostgresExample

## 2. pom.xml
Add Liquibase and the Liquibase Maven Plugin to pom.xml:
```xml
<dependency>
	<groupId>org.liquibase</groupId>
	<artifactId>liquibase-core</artifactId>
	<version>4.1.0</version>
</dependency>
<dependency>
	<groupId>org.liquibase</groupId>
	<artifactId>liquibase-maven-plugin</artifactId>
	<version>4.1.0</version>
</dependency>
...
<plugin>
	<groupId>org.liquibase</groupId>
	<artifactId>liquibase-maven-plugin</artifactId>
	<version>4.1.0</version>
	<configuration>
		<propertyFile>src/main/resources/liquibase.properties</propertyFile>
	</configuration>
</plugin>
```

## 3. liquibase.properties
create liquibase.properties file in resources folder, as follows:
```
url=jdbc:postgresql://localhost:5432/ucd
username=ucd
password=ucd
outputChangeLogFile=src/main/resources/database/liquibase-outputChangeLog.xml
```
These values are used to generate a change log.

## 4. Generate Change Log
Create a directory "database" under the src/main/resources directory.
Open a cmd window and run the Maven Liquibase plug-in from the project directory: 
```
C:\GITtim\LiquibaseExample>mvn liquibase:generateChangeLog
```
This produces a file "liquibase-outputChangeLog.xml" in this directory. Rename this file to liquibase-master-changelog.xml

## 5. application.yml
Add to application.yml, under "spring:", as follows:
```
  liquibase:
    changeLog: classpath:database/liquibase-master-changelog.xml
    url: jdbc:postgresql://localhost:5432/ucd
    user: ucd
    password: ucd
```
These are used by liquibase to keep the database structure up to date.
