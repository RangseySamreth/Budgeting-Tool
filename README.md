# Budgeting-Tool
## Description
The Budget Tool is a financial management application designed to help users track their daily 
spending, set spending limits, and manage bills effectively. This tool ensures secure data 
handling by encrypting sensitive information such as passwords and balances in the database.
## Features
- User Authentication: Secure login for existing and new users. 
- Budget Management: Set and track spending limits. 
- Bill Management: Enter and pay monthly bills. 
- Data Encryption: Passwords and balances are encrypted for security. 
- Error Reporting: Users can report issues directly from the app. 
- Intuitive UI: Easy-to-use graphical interface for navigation. 
## Getting Started 
1. Install and open the Budget Tool application. 
2. On the login screen, choose your account type (Existing User or New User). 
3. Enter your User Address and Password. 
4. Click Login to access the main dashboard.
# Login & Account Selection 
## Login Screen 
- The ChoiceBox contains two options: 
  . Existing User: Login with an existing account.
  . New User: Register a new account before logging in. 
- User credentials are securely stored using encryption, ensuring passwords and financial data remain protected. 
## Steps to Login: 
1. Select Existing User or New User from the dropdown menu. 
2. Enter your User Address and Password. 
3. Click the Login button to proceed.
# Budget Management 
- The Budget Management Screen allows users to set a daily spending limit, track 
expenses, and check the remaining balance. 
- Features: 
  - Set Daily Limit: Define your spending cap.
  - Track Spending: Record transactions under different categories.
  - View Remaining Balance: Check your financial status.
## Steps to Set Budget:
1. Enter a Daily Spending Limit. 
2. Click Set Limit to apply the changes. 
3. Input Spending Amount and select a category. 
4. Click Track Spending to log expenses.
# Bill Payment 
- Manage monthly bills for utilities, rent, and other expenses.
- Features: 
  - Enter Income: Define total monthly income.
  - Input Bill Amounts: Add details for electricity, water, and rent bills.
  - Pay Bills: Update the balance after bill payments. 
## Steps to Pay Bills: 
1. Enter Total Monthly Income and click Update Balance. 
2. Input Bill Amounts (Energy, Water, Rent, etc.). 
3. Click Pay Bills to update records. 
# Security & Encryption 
- All sensitive data, including passwords and financial balances, are encrypted before 
being stored in the database. 
- The app does not display plaintext passwords or balances, ensuring user privacy and 
security. 
# Troubleshooting 
Common Issues & Solutions 
● Forgot Password: Contact support to reset your credentials. 
● Incorrect Spending Calculation: Ensure correct values are entered. 
● Application Not Responding: Restart the app or check for updates.
# System Requirements
To develop and run this project, ensure your system meets the following requirements: 
- Operating System: Windows / macOS / Linux 
- IDE: IntelliJ IDEA (Recommended) 
- Build Tool: Maven 
- Database: SQLite 
- Java Version: Java 17+ 
- Dependencies:
    - JavaFX (UI framework)
    - SQLite JDBC (Database connection)
    - JFoenix (Material UI components)
    - Ikonli (Icon library)
    - JUnit 5 (Unit testing framework) 
- Hardware Requirements: 
    - RAM: 4GB minimum (8GB+ recommended)
    - SSD: 10GB free space
# Getting the Source Code 
To collaborate on this project, clone the repository from GitHub and set up access:
## Steps to Clone the Repository: 
1. Open IntelliJ IDEA. 
2. Select File > New > Project from Version Control. 
3. Enter the repository URL: 
https://github.com/RangseySamreth/Budgeting-Tool_Group5.git 
4. Click Clone. 
# Adding Collaborators 
1. Go to the repository on GitHub. 
2. Navigate to Settings > Collaborators. 
3. Add teammates using their GitHub usernames. 
# Setup and Compilation 
## Installing Dependencies 
Once the project is cloned, install necessary dependencies using Maven: 
1. Open IntelliJ IDEA. 
2. Go to View > Tool Windows > Maven. 
3. Click Reload All Maven Projects. 
4. Ensure all dependencies are downloaded.
## Running the Application 
1. Navigate to src/main/java/com/budgeting/tool/Main.java. 
2. Click Run to start the application.
# Database Structure 
The project uses an SQLite database to store user information, budget data, and transactions.
## Table 
Budgeting - Stores user credentials and balance. 
# Data Structure 
The application follows a Model-View-Controller (MVC) architecture: 
- Model: Handles data and database interactions.
- View: Manages the UI components.
- Controller: Controls logic and connects UI to the database. 
# Class Relationships 
- Main.java: Entry point of the application.
- ViewFactory.java: Manages JavaFX UI windows.
- DatabaseSetup.java: Handles SQLite operations.
- LoginController.java: Manages user authentication.
- BudgetController.java: Handles budgeting functionalities.
- PayBillsController.java: Handles paying bills functionalities. 
# Conclusion 
This guide provides a comprehensive setup and development process for new team members. 
Follow the instructions to set up, develop, and maintain the Budgeting Tool project efficiently.
#  Contact Support 
For issues, suggestions, or feedback, click the Report button in github.
