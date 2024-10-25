# Square Calculator API

## Описание проекта

Square Calculator API — это простое RESTful веб-приложение на Spring Boot, которое принимает целое число через HTTP GET-запрос и возвращает его квадрат. Приложение имитирует задержку обработки запроса от 1 до 5 секунд, чтобы продемонстрировать асинхронность работы.

## Технологии

- Java 17
- Spring Boot 3.0.0
- Maven

## Структура проекта

```
SquareCalculator/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── Pract2Application.java    // Главный класс
│   │   │           ├── controller/
│   │   │           │   └── SquareController.java   // Контроллер для обработки запросов
│   │   │           └── service/
│   │   │               └── SquareService.java      // Сервис для вычисления квадрата
│   │   └── resources/
│   │       └── application.properties               // Конфигурация приложения
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── SquareCalculatorApplicationTests.java // Тесты
│
├── pom.xml       // Файл конфигурации Maven
│
└── README.md      // Документация проекта
```

## Запуск проекта

1. **Клонируйте репозиторий**:
   ```bash
   git clone <https://github.com/DFE203/Pract_1_2>
   cd SquareCalculator
   ```

2. **Соберите проект**:
   Запустите команду:
   ```bash
   mvn clean install
   ```

3. **Запустите приложение**:
   ```bash
   mvn spring-boot:run
   ```

4. **Откройте браузер или Postman** и выполните запрос:
   ```
   http://localhost:8080/api/square/{число}
   ```
   Замените `{число}` на любое целое число, например:
   ```
   http://localhost:8080/api/square/5
   ```

## Использование

- **Метод**: `GET`
- **URL**: `http://localhost:8080/api/square/{число}`
- **Параметры**:
  - `{число}`: Целое число, квадрат которого вы хотите вычислить.

### Пример запроса

```
GET http://localhost:8080/api/square/7
```

### Пример ответа

После выполнения запроса вы получите ответ с квадратом числа, например:

```json
49
```

## Задержка обработки

Обратите внимание, что каждый запрос будет иметь задержку от 1 до 5 секунд перед тем, как вернется ответ.

