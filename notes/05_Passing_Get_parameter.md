## What You Will Learn during this Step:
- You first GET Parameter.
- Problem with using GET

- When we hit this URL http://localhost:8080/login?name=Nitin,then Request Header will change but Response is still same since we haven't made any
  changes on jsp side.

- we need to first get data in the controller.

- Here Model will come into picture which will collect data from controller and passes to view. 
- So Controller controls the entire flow and once it has some data it puts into model and redirect it to view. 
- View uses model data to render data on screen.

- Use @RequestParam and ModelMap objects in Controller method to pass data to model.  
- Then in login.jsp it will be retrieved using ${name} experession.


