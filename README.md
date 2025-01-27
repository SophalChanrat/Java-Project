# SmartTasker
SmartTasker is an application that does certaine tasks for us. In this case, we want it to post posts in Facebook and set reminders on Google Calendar on a specfic date.

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
- Sophal Chanrat (Project leader)
   - TaskManager
   - GoogleCalendarIntegration
   - APIClient
- Te Chhenghab
   - SmartTaskerApp
   - FacebookIntegration
   - APIClient
- Sithav Seavthean
   - Task
   - ConfigManager
   - DataBaseManager
- Phon Sokleaphea
   - UserInterface
   - NotificationService
   - DataBaseManager
  










