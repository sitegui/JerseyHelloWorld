FROM maven:3.6-jdk-8

# Cache dependencies
COPY pom.xml .
RUN mvn -f pom.xml dependency:go-offline install

# Build war
COPY . .
RUN mvn package && cp target/JerseyHelloWorld-*.war target/JerseyHelloWorld.war

# Deploy war
FROM jetty:9.4-jre8
COPY --from=0 /target/JerseyHelloWorld.war /var/lib/jetty/webapps/ROOT.war
