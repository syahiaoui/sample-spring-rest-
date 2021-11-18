# Scalingo cmd

```bash
tar -czvf sample-spring-rest.tar.gz sample-spring-rest


scalingo login --api-token tk-us-uJuwJ7PY2 #get token from web console
scalingo --app sample-spring-rest  env-set JAVA_VERSION=1.8
scalingo --app sample-spring-rest deploy ./target/sample-spring-rest-0.0.1-SNAPSHOT.jar
scalingo --app sample-spring-rest deploy sample-spring-rest.tar.gz



```