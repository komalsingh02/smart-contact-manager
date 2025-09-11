
## [0.0.3] - 2025-09-11
### Added
- Added frontend setup of NodeModules and Tailwind 
- Added Tailwind CSS styling to `home.html`:
    - Classes used: `bg-gray-200`, `text-2xl`, `w-1/2`, `mx-auto`, `mt-4`, `flex`, `flex-col`, `space-y-3`, `p-4`
    - Buttons styled with `px-3 py-2 rounded bg-blue-700 text-white hover:bg-blue-600`
- Linked Tailwind CSS `output.css` using relative path:By adding  rel="stylesheet" th:href="@{/css/output.css}
- Apply styling by running
  npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch

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