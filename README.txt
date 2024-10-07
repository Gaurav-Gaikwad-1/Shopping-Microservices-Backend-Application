To run the projects

1. Run the discovery server
2. After that run all the other microservices(4)
3. Open docker desktop.
4. Run this command on cmd prompt 
		>docker run -p 8181:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:18.0.0 		start-dev
		
5. If your docker has stopped then you have to create new realm by going to http://localhost:8181/admin/master/console
   login with admin/admin.
6. Clients -> Add realm -> name it "spring-boot-microservices-realm" (Follow this quicky https://www.youtube.com/watch?v=rbKzR6QWKLI&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c&index=6)

7. We have created docker-compose.yml file to run it to create its image in container run this command on cmd promopt on same location as file
docker compose up -d


		