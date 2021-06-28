FROM openjdk:8
EXPOSE 8080
ADD target/ecommerce.jar ecommerce.jar
ENTRYPOINT ["java","-jar","ecommerce.jar"]