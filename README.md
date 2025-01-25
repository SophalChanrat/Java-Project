# SmartTasker
SmartTasker is an application that does certaine tasks for us. In this case, we want it to do posting in Facebook and set a reminder on Google Calendar.

## Classes and Functions
Main Classes
1. SmartTaskerApp
   - main
   - initializeComponents
3. TaskMannager
   - addtask
   - removetask
   - getTaskByDate
   - excuteScheduledTasks
5. Task
   - Task
7. FacebookIntegration
   - authenticate
   - postToFacebook
   - schedulePost
9. GoogleCalendarIntegration
    - authenticate
    - addReminder
    - getEventsByDate
11. DataBaseManager
    - connect
    - saveTask
    - deleteTask
    - getAllTasks
13. UserInterface
    - displayMainMenu
    - getUserInput
    - displayTaskList
    - notifyUser

Utility classes
1. APIClient
   - sendPostRequest
   - sendGetRequest
2. NotificationService
   - sendNotification
3. ConfigManager
   - loadConfig
   - saveConfig

## Responsibilities











