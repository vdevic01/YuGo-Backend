<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Frontend/blob/main/src/assets/img/LogoLetters.png" height="120">

## YuGo Hailing App

YuGo is mobile and web ride-hailing app designed to provide an efficient and convenient transportation solution to its users. Yugo was developed as out college project. Similar to Uber and Lyft, YuGo allows users to request a ride from their current location and connect with a nearby driver for a reliable and safe trip.

With YuGo, users can easily track their ride in real-time, communicate with their driver and many other things. The app offers a variety of ride options, including standard, luxury, and shared rides, to cater to different preferences and budgets.

YuGo also places a strong emphasis on safety rating system to ensure the quality of the ride experience.

Overall, YuGo is a reliable and user-friendly ride-hailing app that aims to make transportation more accessible and convenient for everyone.


## Backend
The backend of the YuGo app was developed using Java SpringBoot. The REST API was designed to allow communication between the app's frontend and the backend server.

For authentication, the app uses JWT and generates access and refresh tokens upon successful login. The app also utilizes Aspect Oriented Programming to modularize its code and separate its concerns. For development we used H2 Database. To interact with the H2 Database, the app uses JPQL and native SQL queries.

The app has three different roles: driver, passenger, and admin. Each role has different permissions and access levels within the app. STOMP Websockets were used for communication between users, allowing for real-time messaging and updates.

The backend layer of YuGo features a Python script for vehicle movement simulation. This powerful tool allowed us to test and optimize routing algorithms, improving the accuracy and efficiency of the app's service.
## Frontend
The frontend of the YuGo app is designed with a modern and minimalistic approach, providing a clean and intuitive user experience. The app was developed using the Angular framework.

For displaying maps and locations, the team used OpenStreetMap, this allowed the app to provide accurate and reliable location data to both drivers and passengers. To ensure consistency across the codebase, the team utilized ESLint. 

Overall, the frontend of the YuGo app was developed with a focus on usability and simplicity, while also leveraging modern technologies and tools to improve code quality and maintainability.
## Android
The Android app for YuGo is a native app, built using the Android SDK and Java programming language. It's designed with the same minimalistic and intuitive approach as the web app, ensuring a seamless and consistent user experience across both platforms.

One of the standout features of the app is its implementation of both light and dark modes, providing users with the flexibility to customize the app's appearance to their liking. As with the web app, the Android app also utilizes OpenStreetMap to display maps and location data. 

The app's design is focused on simplicity and usability, with a clean interface that makes it easy for users to understand and navigate the app. This, combined with its efficient use of web sockets, ensures a real-time and reliable experience for both drivers and passengers.
## Testing
Our team recognized the importance of thoroughly testing the app's functionality to ensure it was robust and reliable. To that end, we implemented several testing tools and frameworks, including JUnit5, Karma, and Jasmine.

Tests were performed on core features of the ride service, covering both the frontend and backend layers. The team also implemented End-to-End Selenium tests for ride reservations, ensuring that the entire flow from selecting a ride to completing the reservation process was seamless and error-free.

By implementing comprehensive testing procedures, YuGo's development team was able to identify and resolve any potential issues or bugs, ensuring that the app delivers a consistent and reliable experience to its users.

## Features
### Home
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_1.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screen_Recording_20230414_181116_YuGO_1.gif" height="400">
</p>

### Login
The login page in YuGo allows users to securely access their account by generating access and refresh tokens upon successful login.

In addition, the login page also includes a forgot password option. If a user forgets their password, they can initiate a password reset process by providing their email address. The app will then send a verification email to the user's email address, allowing them to reset their password and regain access to their account.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_3.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_003619_YuGO.jpg" height="400">
</p>

### Register
The registration page in YuGo features a user-friendly form that guides users through the registration process. The form includes proper validation for each field, ensuring that users provide all required information and enter it correctly. If any errors or omissions are detected, the form will display appropriate messages to help the user correct the issue.

After submitting the registration form, users will receive a confirmation email to verify their account. This process helps ensure that all accounts are created by actual users and reduces the risk of fraudulent activity.

<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_6.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_003632_YuGO.jpg" height="400">
</p>

### History
The ride history feature in YuGo allows users to view information about their previous rides, including the date, time, pickup and drop-off locations, and cost. Users can also leave a review for each ride, providing feedback that can help improve the overall ride-hailing experience. Additionally, users can add their favorite rides to a favorites list for quick access in the future.

Another convenient feature of the ride history is the ability to create a ride with the same path and people as a previous ride. This feature saves users time and effort, allowing them to quickly and easily recreate a previous ride without having to manually enter all of the details again.

<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_8.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_003824_YuGO.jpg" height="400">
</p>
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_9.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_003816_YuGO.jpg" height="400">
</p>

### Account Info
The account page in YuGo allows passengers and drivers to manage their profile information, including their profile picture, basic details, and password. This allows users to keep their information up-to-date and accurate.

In addition, drivers have exclusive access to additional features on the account page. They can update information about their vehicle and upload their driving and traffic licenses. This ensures that all drivers on the platform are properly licensed and insured.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_14.png" height="400"><br/>
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_005039_YuGO.jpg" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_004404_YuGO.jpg" height="400">
</p>

### Reports And Statistics
The report page allows all users to view reports for a selected date range, which includes information such as the number of rides per day, kilometers traveled per day, and spending per day. These reports provide users with insight into their usage of the app and their spending habits.

Additionally, drivers have exclusive access to lifetime statistics, which allows them to see their overall performance on the platform. This information can be useful for drivers to track their progress and identify areas where they may need to improve.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_11.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_004440_YuGO.jpg" height="400">
</p>
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_12.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_004415_YuGO.jpg" height="400">
</p>

### Ride Request
When a passenger requests a ride, the system evaluates available drivers and selects the best option for the ride. The chosen driver is then presented with a popup dialog, which includes information about the ride, such as the pickup and dropoff locations, the passenger's name, and any special requests they may have.

The driver then has the option to accept or reject the ride. If the driver rejects the ride, they must provide a reason for doing so. 
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_004649_YuGO.jpg" height="400">
</p>

### Ride Reserving
The ride reserving process in YuGo app is made easy and intuitive for the user with step by step dialogs. Firstly, the user selects the starting and ending location for the ride. This can be done either by clicking on the map or by manually entering the address with autocomplete feature.

Next, the user chooses whether the ride will include babies or pets and selects the type of vehicle they prefer from options such as Luxury, Standard, or Van. The user then selects the desired time for the ride, either an immediate ride or a reservation up to 5 hours in advance.

The user can add more people to the ride if they want to track the ride progress too. After that, the app will provide the user with time and price prediction for the ride, and the system will check for the availability of drivers. Here are only some of the screenshots!
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_16.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_003940_YuGO.jpg" height="400">
</p>

### Active Ride
The Active Ride page of the YuGo app allows users to track their ongoing rides. Users can view a map with the current location, start location, and destination of the ride, as well as receive predictions about the estimated time of arrival. In case of any unforeseen events during the ride, both drivers and passengers have access to a panic button where they can enter a reason, and the admin will be notified.

For drivers, they have the option to start and end the ride, and once the ride is finished, the passenger will receive a popup dialog where they can leave a review for the ride and the vehicle.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_21.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_004722_YuGO.jpg" height="400">
</p>

### Chat & Support
The YuGo app features a live chat support system where passengers and drivers can contact the admin team with any questions or concerns. This feature is available on the web app, and allows users to send and receive messages in real-time. When a message is received, the admin team is notified with a chat head in the bottom right corner of their screen, allowing them to quickly respond to the user's inquiry.

The app allows passengers and drivers to communicate with each other about their rides through an in-app messaging system. Users can view their message history and send new messages to their current ride partner. In addition to standard messaging functionality, the app also includes a unique feature that allows users to change the sort direction of messages by shaking their device. The app also includes push notifications so that users receive a notification when someone sends them a new message. 
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_26.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_004320_YuGO.jpg" height="400">
</p>

### Favorite Paths
The Favorite Path feature allows users to save up to 10 favorite paths with custom names. This makes it easy for users to quickly fill out the ride reservation form with just one click. The saved paths include start and destination locations, as well as ride options such as whether it includes pets or babies, and whether someone else will join the ride. This feature saves time for users who frequently use the same routes and makes the ride reservation process more efficient.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_13.png" height="400">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_20230414_003838_YuGO.jpg" height="400">
</p>

### Admin features
The admin of the YuGo app has an exclusive user management page where they can add drivers and passengers manually. From this page, the admin can also view the reports and ride histories of users, as well as see and modify their account information. Additionally, the admin has the ability to reset user passwords as needed. This page provides the admin with complete control over the app's user base.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_24.png" height="400">
</p>
The admin's exclusive panic page is designed to provide the admin with a complete overview of all the rides where the panic button has been pressed. The admin can see the details of the ride, such as the driver, passenger, starting and ending points, and the time of the ride. In addition to this, the admin can also see the reason why the panic button was pressed. This information allows the admin to take appropriate actions in case of an emergency and provide necessary support to the users involved in the ride.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_25.png" height="400">
</p>
Admins can review requests made by drivers to change their vehicle information, such as make, model, or license plate number. Admins have the authority to accept or reject these requests, which gives them control over both normal and abnormal vehicle information changes. By reviewing and managing these requests, admins ensure that the ride service maintains accurate and up-to-date information about the vehicles used by its drivers.
<p float="center">
<img src="https://github.com/YuGo-Ride-Hailing-App/YuGo-Backend/blob/main/Screenshots/Screenshot_27.png" height="400">
</p>

## Authors

- [Jovan Jokić](https://github.com/jokicjovan)
- [Vlada Dević](https://github.com/ForLoop111)
- [Vukašin Bogdanović](https://github.com/vukasinb7)

