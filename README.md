## GitHub OAuth2 with Spring Security

### GitHub OAuth Apps
GitHub's OAuth implementation supports 
[See more](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/)

### Configuration
#### Environmental Variables Setting
| CLIENT_ID  | The client ID you received from GitHub  |
|---|---|
| CLIENT_SECRET  |  The client secret you received from GitHub | 
Please fill out your own `CLIENT_ID` and `CLIENT_SECRET`

### Run Application locally
#### Installation
```bash
$ ./mvnw install
```

#### Run
```bash
$ ./mvnw install
$ ./mvnw spring-boot:run
```


### Run Application With Container
#### Build Image
```bash
$ ./mvnw spring-boot:build-image 
```

#### Run
```bash
$ docker-compose up -d 
```