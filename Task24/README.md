# Task 24: Vibe Coding for Cloud-Based Feature

## Description
This task demonstrates building a cloud-based feature using Generative AI and prompt engineering. Iterative prompts are used to generate a REST API, cloud deployment steps, and security configurations. The prompts are refined to improve output quality and usability.

---

## Objective
- Generate REST API using AI
- Generate cloud deployment steps
- Apply security configurations
- Improve results using iterative prompts

---

## Tool Used
- ChatGPT (Generative AI)

---

# 🔹 Step 1: Initial Prompt (Version 1)

### Prompt
"Create a REST API for product management in Spring Boot."

### Output (Summary)
- Basic CRUD API generated
- Included GET, POST methods

### Issues
- Missing validation
- No proper structure
- No error handling

---

# 🔹 Step 2: Refined Prompt (Version 2)

### Prompt
"Create a complete Spring Boot REST API for product management with CRUD operations, validation, and proper layered architecture."

### Output (Summary)
- Controller, Service, Entity structure
- CRUD operations implemented
- Validation annotations included

### Improvements
- Better structure ✔
- More realistic ✔
- Production-ready elements ✔

---

# 🔹 Step 3: Cloud Deployment Prompt

### Prompt
"Provide steps to deploy a Spring Boot application on AWS EC2."

### Output (Summary)
1. Launch EC2 instance
2. Install Java
3. Upload JAR file
4. Run application using java -jar

### Evaluation
- Simple and correct ✔
- Needs security and scaling improvements ⚠

---

# 🔹 Step 4: Security Configuration Prompt

### Prompt
"Add basic security configuration for a Spring Boot REST API."

### Output (Summary)
- Basic authentication
- Secured endpoints

### Evaluation
- Improves security ✔
- Needs JWT for production ⚠

---

# 🔹 Prompt Iteration Comparison

| Version | Quality | Features | Usability |
|--------|--------|----------|----------|
| V1     | Basic  | Low      | Limited  |
| V2     | Improved | Medium | Practical |
| V3 (with security + cloud) | High | High | Real-world ready |

---

# 🔥 Key Learnings

## Prompt Engineering Benefits
- Better prompts → better results
- More details → more accurate code
- Iteration improves quality

## Vibe Coding Benefits
- Faster development
- Interactive improvements
- Reduced manual effort

---

# 📊 Evaluation

| Criteria        | Result |
|-----------------|--------|
| Accuracy        | High after refinement |
| Scalability     | Improved with better prompts |
| Security        | Basic → Improved |
| Real-world Use  | Achieved after iteration |

---

# ⚠ Limitations
- AI output needs validation
- Not always production-ready
- Requires developer knowledge

---

# ✅ Conclusion
Using Vibe Coding and prompt engineering, a complete cloud-based feature was built. Iterative prompting significantly improved code quality, scalability, and usability for real-world applications.