# Know Your Neighborhood
 Know Your Neighborhood Application is a website application that provides users with information about their local neighborhood. The application allows user to register, login using their Facebook account through OAuth2, post a store, search another store and user, and edit their personal profile page

**Project Overview**
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

**Technologies Used & System Requirements**
Backend : Java SE 11, MySQL 8, Spring Boot, Spring Security, OAuth2 (Facebook API), Restful API
Frontend : React, Tailwindcss, Axios, React-hook-form, React-router-dom
Tools : Node Js (LTS Ver)

**HOW TO RUN**
Backend
Import Existing Project into STS IDE
Create MySQL database
mysql> create database kyn
Setup application.yml
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
    tokenSecret: <YOUR_TOKEN_SECRET> (you can go to generator online for token secret)
    tokenExpirationMsec: 86400000
  oauth2:
    authorizedRedirectUris:
      - http://localhost:3000/oauth2/redirect
Get Client ID & Client Secret Facebook API
Facebook Docs to create Facebook Login endpoint API
Run Java Application

Frontend
Import existing project to your Text Editor/IDE and run NPM Install
npm install
Run React application with NPM Start (Make sure the backend is also running in the localhost:8080)
npm start
Open http://localhost:3000 to view it in the browser.

**Screenshot**
