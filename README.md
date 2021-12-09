# Description
Poc Keycloak Business SpringBoot Microservice

## The Architecture of the business PoC

This diagram showes a business microservices PoC Architecture integrated with an IAM service using a **Outh2/ OpenID** implementation and **role-based access control (RBAC)** approach to restricting system access to authorized users:

- Implement **Outh2/ OpenID** and **IAM Admin API**: users, roles, groups and clients entities from **RedHat Keycloak**

- Implement **RBAC** from **Spring Boot Security**

![Architecture](captures/architecture.png "Architecture")

## Test Get products from realm with Postman
This endpoint it's securized with **access token** and **admin, operator**, **user** roles

![Products Postman Test](captures/read_create_product.png "Products Postman Test")

## Test Create product from realm with Postman
This endpoint it's securized with **access token** and **admin, operator** roles

![Create User Product Test](captures/postman_create_product.png "Create Product Postman Test")