
#  Gatherly Full-Stack Project – Daily Checklist (14-Day Plan @ 6hr/day)

##  Day 1 – Backend & Frontend Setup
- [ x] Generate Spring Boot project via start.spring.io
- [ x] Add dependencies: Web, Security, JPA, PostgreSQL, Validation, Lombok
- [ x] Run project locally (`./gradlew bootRun`)
- [ x] Install PostgreSQL (locally or Railway/Supabase)
- [ x] Configure `application.properties` (DB connection)
- [ x] Create `GET /api/health` endpoint
- [ x] Create React TypeScript frontend with Tailwind
- [ x] Build simple homepage + test backend connection

##  Day 2 – User Entity + Repository + Controller
- [ ] Create `User` class (id, name, email, password)
- [ ] Create JPA `UserRepository`
- [ ] Create `UserController` with test route
- [ ] Connect to database and test with one User
- [ ] Add error-handling structure with `@ControllerAdvice`

##  Day 3 – Registration + Login (JWT)
- [ ] Create `AuthController`
- [ ] `POST /auth/register` (hash password with BCrypt)
- [ ] `POST /auth/login` (verify password, return JWT)
- [ ] Generate JWT with username
- [ ] Setup Spring Security + JWT filter
- [ ] Protect private routes (e.g., `/events`)

##  Day 4 – Frontend Auth (Login & Register)
- [ ] Build login form (email + password)
- [ ] Build registration form
- [ ] Send login/register requests via Axios
- [ ] Store JWT in `localStorage`
- [ ] Show login status in nav bar

##  Day 5 – Event Entity + API
- [ ] Create `Event` entity (title, description, date, location, user)
- [ ] Create endpoints: `GET /events`, `POST /events`
- [ ] Setup relationship: User ↔ Event (ManyToOne)
- [ ] Return list of events as JSON

##  Day 6 – Events in Frontend
- [ ] Fetch events from API
- [ ] Display events list in React
- [ ] Create event detail page
- [ ] Form to create new events

##  Day 7 – RSVP Functionality
- [ ] Create `RSVP` entity (ManyToMany User ↔ Event)
- [ ] Endpoint: `POST /events/{id}/rsvp`
- [ ] Check if user already RSVPed
- [ ] Show RSVP button in frontend

##  Day 8 – Announcements API
- [ ] Create `Announcement` entity (title, body, createdAt, createdBy)
- [ ] `GET /announcements`
- [ ] `POST /announcements` (auth required)
- [ ] Setup relationship: Announcement ↔ User
- [ ] Return markdown text in body

##  Day 9 – Announcements in Frontend
- [ ] Fetch announcements using Axios
- [ ] Render markdown using `react-markdown`
- [ ] Form to post new announcements

##  Day 10 – UI Improvements
- [ ] Make layout responsive with Tailwind
- [ ] Add NavBar with login/logout buttons
- [ ] Add loading spinners during API calls
- [ ] Add 404 page + protect routes

##  Day 11 – Validation + Error Handling
- [ ] Use `@Valid` for DTOs in backend
- [ ] Show error messages in frontend (e.g., email already used)
- [ ] Create global error handler in Spring Boot
- [ ] Show client-side errors in UI

##  Day 12 – Deployment
- [ ] Create `.env` files for frontend/backend
- [ ] Deploy backend to Render or Railway
- [ ] Deploy frontend to Vercel or Netlify
- [ ] Test full app online (auth, event, RSVP)

##  Day 13 – Documentation & GitHub
- [ ] Write `README.md`:
  - Description
  - Tech stack
  - Setup instructions
  - Live demo link
- [ ] Push clean GitHub repo with commits
- [ ] Use GitHub Projects for tasks/issues

##  Day 14 – Portfolio & LinkedIn
- [ ] Write LinkedIn post describing project
- [ ] Add project to CV/LinkedIn "Projects"
- [ ] Prepare interview pitch (STAR method)
- [ ] Reflect: What did you learn?

