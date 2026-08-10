# JForce Internal Company Portal (Intranet)

This project is an internal company portal application developed as part of the JForce Bilişim Teknolojileri A.Ş. Software Development Internship. It will be designed to meet the daily operational needs of employees in a digital environment quickly and securely.

## Project Summary
The application is planned to be a platform that includes three different user roles: Employee, Manager, and Admin, offering dynamic menus with role-based authorization.

### Planned Core Modules
* **Home Page (Dashboard):** The main screen where current announcements, today's birthdays, meeting room occupancy summaries, and leave statuses are presented as summary cards.
* **Leave Management:** A module where employees can create annual, excuse, or sick leave requests, and managers can list, approve, or reject these requests.
* **Meeting Room Reservation:** A system where the hourly occupancy status of the "Big Hall" and "Small Room" within the company is tracked, and reservations are made in a way that prevents conflicts.
* **Equipment (Inventory) Management:** An inventory module where employees can create requests for the hardware they need, and the return processes of the approved and assigned hardware are tracked.
* **Announcement Board:** A board where users in the Admin role share internal company notifications, and other employees can interact by liking and leaving comments on these announcements.
* **Profile and Team Directory:** A directory where employees can update their basic identity, department, and e-mail information, and share their areas of expertise (e.g., Java, Spring Boot, React) with other employees by tagging them.

## Used and Planned Technologies
* **Backend:** Java 21 and Spring Boot 3.3.0
* **Database Access:** Spring Data JPA / Hibernate
* **Database:** PostgreSQL
* **Security:** REST API-based architecture and authorization (JWT / Basic Auth)
* **Dependency Management:** Maven
* **Frontend:** React

## Database Architecture
The SQL dump file (`jforce_portal_db.sql`), reflecting the relational database structure of the project, is located in the `docs` folder in the project's root directory.

Additionally, the visual database schema (ER Diagram) can be accessed online via [this link (dbdiagram.io)](https://dbdiagram.io/d/ErenKasparStaj-6a51276e4ac62e474c7b7ff6).

## Next Planned Task
* ⏳ **Next Task:** Implementing Business Logic (Service Layer) and REST Controllers for core modules.

## Planned Features if Time Permits
* Forgot password feature
* Change password (password update) feature

---
**Developer:** Eren Kaspar  
*(June 2026 Internship Period)*