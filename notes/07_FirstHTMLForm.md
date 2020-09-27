## What You Will Learn during this Step:
- Create Simple HTML form

- Added form tag in login.jsp to input data from user and submit button in last. 
- by default when we submit, name and password details are shown in URL. Since actual request when hitting server passes 
  through many routers, its not safe to pass userdata in URL. To do this we should use POST method in login.jsp.  
-  now data will not be seen in URL. Also, when we look into network tab, there is one more tab call PARAMS where data will be visible. 

Next, by default same page is displayed since we only have one method defined in controller which will be default method used for GET,POST,PUT etc. 
So we need to create different methods in controler for each type of request. 
Created another method "welcomeMessage" for Request type POST and also created welcome.jsp for post request display. 





