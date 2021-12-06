# Description
Poc Keycloak Authentication/Authorization SpringBoot Microservice

# Keycloak resources: realm, client, roles and users

## Create client

- **Name**: business-api
- **Root URL**: http://localhost:8082 (This is the domain where microservice is running)

![Create Client](captures/keycloak_client.png "Create Client")

## Create client roles
Inside the client we created these roles:

- **name**: admin, operator, user

![Create Roles](captures/client_roles.png "Client Roles")

## Add users roles for business client
- **name**: admin with roles: **admin** in **business-api** client
- **name**: operator with role: **operator** in **business-api** client
- **name**: user with role: **user** in **business-api** client

![User Roles](captures/user_roles.png "User Roles")

## Test Get products from realm with Postman
This endpoint it's securized with **access token** and **admin, operator**, **user** roles

![Products Postman Test](captures/read_create_product.png "Products Postman Test")

## Test Create product from realm with Postman
This endpoint it's securized with **access token** and **admin, operator** roles

![Create User Product Test](captures/postman_create_product.png "Create Product Postman Test")