echo "start building application"
curl -X POST localhost:8055/actuator/shutdown
docker exec sprinBoot mvn clean package
echo "building package"
docker exec -d sprinBoot java -jar ./target/vertualApi-0.0.1-SNAPSHOT.jar 