
<%@page language="java" %>
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Number Input Form</title>
  </head>
  <body>
      <form action="add">
          <label for="number1">Enter Number 1:</label>
          <input type="number" id="number1" name="number1" required>
          <br><br>
          <label for="number2">Enter Number 2:</label>
          <input type="number" id="number2" name="number2" required>
          <br><br>
          <input type="submit" value="Calculate">
      </form>
  </body>
  </html>
