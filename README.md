<!-- PROJECT LOGO -->
<!-- <h1 align="center">
  <a href="{project-url}">
    <img src="{project-logo}" alt="Logo" width="125" height="125">
  </a>
</h1> -->

<!-- TITLE -->

# DNS takedown

<!-- TABLE OF CONTENTS -->
<!-- ## Table of contents

- [Project name](#project-name)
  - [Table of contents](#table-of-contents)
  - [About](#about)
    - [Built With](#built-with)
  - [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Usage](#usage)
  - [Roadmap](#roadmap)
  - [Contributing](#contributing)
  - [License](#license) -->

<!-- ABOUT -->
## About

A service which automates the process of sending takedown requests to major DNS providers. This tool is intended to help with proactive scam prevention and response.

For more information on DNS registrars and takedown methods, refer to our [research document](./RESEARCH.md)

### Built With

- [Spring Boot](https://spring.io/)
- [Selenium](https://www.selenium.dev/)
- [Docker](https://www.docker.com/)

<!-- GETTING STARTED -->

## Getting Started

### Prerequisites

- Java ([OpenJDK 19.0.2](https://jdk.java.net/19/))
- Docker (optional)

### Usage

To run the app locally using `mvnw`:

```bash
./mvnw spring-boot:run
```

To build and run as a `.jar` file:

```bash
# Build
./mvnw package
# Run
java -jar target/takedown-0.0.1-SNAPSHOT.jar
```

To dockerize:

```bash
# Build
docker build -t <tagname>:<version> .
# Run (using host port 8080)
docker run -p 8080:8080 <tagname>:<version>
```

<!-- ROADMAP -->

## Roadmap

<!-- CONTRIBUTING -->

## Contributing

<!-- LICENSE -->

## License

See [LICENSE.md](./LICENSE.md)
