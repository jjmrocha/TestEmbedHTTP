# EmbedHTTP Benchmark Testing

This project benchmarks the performance of the [EmbedHTTP](https://github.com/jjmrocha/embedhttp) framework against [Spring Boot](https://spring.io/projects/spring-boot) using the [Beast](https://github.com/jjmrocha/beast) testing tool.

## Project Structure

The workspace is organized as follows:

- **`EmbedHTTP/`**: Contains the implementation of the benchmark using the EmbedHTTP library.
- **`Spring/`**: Contains the implementation of the benchmark using Spring Boot.
- **`test-data.csv`**: A CSV file with test data used to generate payloads for benchmarking.
- **`beast-config.json`**: Configuration file for the Beast testing tool.
- **`run-test.sh`**: A shell script to automate the benchmarking process.
- **`*.yaml`**: Beast templates for testing endpoints.

## Prerequisites

- Java 21 or higher
- Beast testing tool installed ([installation guide](https://github.com/jjmrocha/beast))
- A POSIX-compliant shell (for running `run-test.sh`)

## Setup

1. Clone the repository:
```sh
git clone https://github.com/your-repo/TestEmbedHTTP.git
cd TestEmbedHTTP
```

2. Build the projects:
```sh
cd EmbedHTTP
./gradlew build
cd ../Spring
./gradlew build
```

3. Start the servers:
```sh
cd EmbedHTTP
./gradlew run
```

## Running the Benchmark

### Run beast template:
```sh
./run-test.sh <template> [concurrent requests]
```

Where:
* template: Must be one of `.yaml` files:
  - get-plain.yaml
* concurrent requests: Is the number of request performed simultaneously, defaults to 1  

Example:
```sh
./run-test.sh get-plain.yaml 10
```

## License
EmbedHTTP is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.