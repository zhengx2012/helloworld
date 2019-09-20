# Charter Hello World

This is a basic spring-boot API

## Getting Started

In order to test out this server, run com.charter.hello.world.Application and execute this cURL via command line or Postman:

```
curl -X GET \
  http://localhost:8080/hello \
  -H 'Accept: */*' \
  -H 'Content-Type: application/json'
```

## Goal

Update this project in a feature/ branch to include api functionality to add POST endpoint that will update the response to the above cURL to be user input.

e.g.

If I sent:

```
curl -X POST \
  http://localhost:8080/hello \
  -H 'Accept: */*' \
  -H 'Content-Length: 31' \
  -H 'Content-Type: application/json' \
  -d '{
	"message": "Good Morning!"
}'
```

and _then_ sent:

```
curl -X GET \
  http://localhost:8080/hello \
  -H 'Accept: */*' \
  -H 'Content-Type: application/json'
```

The updated response json should resemble:

```
{
    "message": "Good Morning!"
}
```

## Release Notes

#### 0.0.1

Added support for /hello GET API resource
