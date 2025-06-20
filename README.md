📋 User Management System
A full-stack web application for managing users with authentication. Built using React for the frontend and Spring Boot for the backend. The system supports login functionality, user CRUD operations (create, read, update, delete), and pagination for large datasets.

🌐 Tech Stack
🔧 Backend (Spring Boot)
Java with Spring Boot

Spring Security for authentication

RESTful APIs

MySQL or H2 Database (based on your configuration)

Pagination using page and size query parameters

🎨 Frontend (React)
React.js

Axios for HTTP requests

React Router for navigation

Custom login form

Responsive design with basic styling

🔐 Features
🔑 Login with Spring Security

👤 Add, Edit, Delete Users

📄 View Users with Pagination

🧠 Role-based fields (e.g., name, email, role)

🔐 Backend-protected routes (only logged-in users can access user list)

🚀 Getting Started
✅ Prerequisites
Java 17+

Node.js 18+

MySQL (or embedded H2)

Maven

⚙️ Backend Setup (Spring Boot)
bash
Copy code
cd backend-folder
./mvnw spring-boot:run
By default, backend runs on http://localhost:8080.

Endpoints

POST /login – for authentication

GET /api/users – list users (supports pagination)

POST /api/users – add user

PUT /api/users/{id} – edit user

DELETE /api/users/{id} – delete user

💻 Frontend Setup (React)
bash
Copy code
cd frontend-folder
npm install
npm start
By default, frontend runs on http://localhost:3000.

Make sure to configure CORS and axios.defaults.withCredentials = true; in your frontend for session handling.

🔧 Environment Configuration
application.properties

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
You can also switch to H2 for testing:

properties
Copy code
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
🧪 Sample Credentials
Username	Password
admin	admin123
user	user123

(Assuming in-memory authentication or your own log entity.)

🌍 Deployment
You can deploy the backend to Heroku, Render, or Spring Boot WAR in Tomcat, and the frontend to Vercel, Netlify, or GitHub Pages.
