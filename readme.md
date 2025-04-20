

- First add Dockerfile in each service abd edir the resources files(applicaion.properties and appliaction.yml)
`docker build -t yours24/linkedin/post-service ./post-service/`

`docker build -t yours24/linkedin/api-gateway ./api-gateway/`

`docker build -t yours24/linkedin/connection-service ./connection-service/`


`docker build -t yours24/linkedin/discovery-service ./discovery-service/`

`docker build -t yours24/linkedin/notification-service ./notification-service/`


`docker build -t yours24/linkedin/user-service ./user-service/`


- lets say you have so many docker-compose file then out which run perticular docker compose file
`docker-compose -f docker-compose.yml up`