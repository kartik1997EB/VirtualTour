date


# BUILD THE PROJECT API
echo "========================================================================="
echo "MAVEN BUILDING FROM POM.XML"
mvn -version
echo "Java Version : " 
java -version
echo "Javac Version"
javac -version
mvn clean package
echo "========================================================================="
echo "Executing Final JAR"
# sleep 2000
java -jar ./target/vertualApi-0.0.1-SNAPSHOT.jar
tail -f /dev/null