How to run in JVM mode:

docker build -f src/main/docker/Dockerfile.jvm -t jvm/url-shorter .
docker run -i --rm -p 8080:8080 jvm/url-shorter

How to run in NATIVE mode:

docker build -f src/main/docker/Dockerfile.native -t native/url-shorter .
docker run -i --rm -p 8080:8080 native/url-shorter