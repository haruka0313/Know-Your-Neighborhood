# Know Your Neighborhood
Know Your Neighborhood is a website application that provides users with valuable information about their local neighborhood. With this application, users can register and login using their Facebook account through OAuth2, allowing for a seamless and secure authentication process. 

#Project Overview
The Know-Your-Neighborhood website consists of the following Key pages

Home Page
Registration Page
Login Page with social login (Facebook)
Contact us Page
About us Page
Stores Page
Store Detail Page
Post Store
View Profile page
Customers can login using the existing API and fetch basic information such as name, email from API.

#Technologies Used & System Requirements
Backend : Java SE 11, MySQL 8, Spring Boot, Spring Security, OAuth2 (Facebook API), Restful API
Frontend : React, Tailwindcss, Axios, React-hook-form, React-router-dom
Tools : Node Js (LTS Ver)

#HOW TO RUN
Backend
1.Import Existing Project into STS IDE
2. Create MySQL database
mysql> create database kyn

3.Setup application.yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/kyn
    username: <YOUR_DB_USERNAME>
    password: <YOUR_DB_PASSWORD>

  jpa:
    show-sql: true
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL8Dialect
  security:
    oauth2:
      client:
        registration:
          facebook:
            clientId: <YOUR_FACEBOOK_CLIENTID>
            clientSecret: <YOUR_FACEBOOK_CLIENTSECRET>
            redirectUri: http://localhost:8080/oauth2/callback/facebook
            scope:
              - email
              - public_profile
        provider:
          facebook:
            authorizationUri: https://www.facebook.com/v3.0/dialog/oauth
            tokenUri: https://graph.facebook.com/v3.0/oauth/access_token
            userInfoUri: https://graph.facebook.com/v3.0/me?fields=id,name,email,picture.width(250).height(250)

app:
  auth:
    tokenSecret: <YOUR_TOKEN_SECRET> (you can go to a token secret generator online)
    tokenExpirationMsec: 86400000
  oauth2:
    authorizedRedirectUris:
      - http://localhost:3000/oauth2/redirect

3.Get Client ID & Client Secret Facebook API
4.Facebook Docs to create Facebook Login endpoint API
5.Run Java Application

Frontend
1. Import existing project to your Text Editor/IDE and run NPM Install
npm install
2. Run React application with NPM Start (Make sure the backend is also running in the localhost:8080)
npm start
3. Open http://localhost:3000 to view it in the browser.


