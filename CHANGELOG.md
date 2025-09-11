## [0.0.2] - 2025-09-05
### Added
- **PageController** updated to handle dynamic data with Thymeleaf.
- Dynamic rendering of user details (`name`, `email`, `address`, `GitHub link`) using **Model** and **Thymeleaf**.
- Updated `home.html` template to display user data dynamically.

## [0.0.1] - Initial Setup
- Created new Spring Boot project.
- Added `.gitignore` (to exclude sensitive files like `application.properties`).
- Added `README.md` with commit rules.
- Added `PageController.java` with `/home` route.
- Logs `"home page handler"` in console.
- Added `home.html` template (basic container + welcome text).
- Included inline CSS for simple styling.
- Configured MySQL connection locally.
- Excluded credentials from Git using `.gitignore`.