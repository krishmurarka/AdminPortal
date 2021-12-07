import './App.css';
import React, { Component } from 'react';
import Login from "./pages/login.js";
import Profile from "./pages/Profile.js";
import Forgot from './pages/forgot.js'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ProtectedRoute from './pages/protected.js'


function getUserBoard() {
  const user = JSON.parse(localStorage.getItem('user'));
  if (user == null) {
    return false
  }
  if (user.token == undefined || user.token == null || user.token == "") {
    return false
  }
  return true
}
class App extends Component {

  render() {
    return (
      <Router>
        <Switch>
          <Route exact path="/login" component={Login} />
          <ProtectedRoute exact path="/profile" component={Profile} auth={getUserBoard()} />
          <Route exact path="/forgot" component={Forgot}></Route>
        </Switch>
      </Router>
    )
  }
}


export default App;
