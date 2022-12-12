import { useState } from "react";
import "./App.css";
// import { Navigate } from "react-router-dom";
import {Route, useNavigate} from 'react-router-dom';



function App() {
  const [usernameError, setUsernameError] = useState('');
  const [passwordError, setPasswordError] = useState('');
  const navigate = useNavigate();
  const onSubmit = (e) => {
    e.preventDefault();

    const formData = new FormData(e.target);
    var username = formData.get('username');
    var password = formData.get('password')
    

    fetch(`http://localhost:8080/login?username=${username}&password=${password}`, {
      method: "GET",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
    })
      .then(response => {return response.json()})
      .then(data => {
        console.log(data.userRole);
        navigate(data.userRole === 'manager'
            ? '/Admin'
            : '/User'
          );
        

      })
      .catch((err) => {
      alert("Invalid username or password.");
  });
  }

  const onUsernameFocus = (e) => {
    e.preventDefault();
    setUsernameError('');
  }

  const onPasswordFocus = (e) => {
    e.preventDefault();
    setPasswordError('');
  }

  return (
    <div className="App">
      <div className="login-root">
        <div
          className="box-root flex-flex flex-direction--column"
          style={{ minHeight: "100vh", flexGrow: 1 }}
        >
          <div className="loginbackground box-background--white padding-top--64">
            <div className="loginbackground-gridContainer">
              <div
                className="box-root flex-flex"
                style={{ gridArea: "top / start / 8 / end" }}
              >
                <div
                  className="box-root"
                  style={{
                    backgroundImage:
                      "linear-gradient(white 0%, rgb(247, 250, 252) 33%)",
                    flexGrow: 1,
                  }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "4 / 2 / auto / 5" }}
              >
                <div
                  className="box-root box-divider--light-all-2 animationLeftRight tans3s"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "6 / start / auto / 2" }}
              >
                <div
                  className="box-root box-background--blue800"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "7 / start / auto / 4" }}
              >
                <div
                  className="box-root box-background--blue animationLeftRight"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "8 / 4 / auto / 6" }}
              >
                <div
                  className="box-root box-background--gray100 animationLeftRight tans3s"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "2 / 15 / auto / end" }}
              >
                <div
                  className="box-root box-background--cyan200 animationRightLeft tans4s"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "3 / 14 / auto / end" }}
              >
                <div
                  className="box-root box-background--blue animationRightLeft"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "4 / 17 / auto / 20" }}
              >
                <div
                  className="box-root box-background--gray100 animationRightLeft tans4s"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
              <div
                className="box-root flex-flex"
                style={{ gridArea: "5 / 14 / auto / 17" }}
              >
                <div
                  className="box-root box-divider--light-all-2 animationRightLeft tans3s"
                  style={{ flexGrow: 1 }}
                ></div>
              </div>
            </div>
          </div>
          <div
            className="box-root padding-top--24 flex-flex flex-direction--column"
            style={{ flexGrow: 1, zIndex: 9 }}
          >
            <div className="box-root padding-top--48 padding-bottom--24 flex-flex flex-justifyContent--center">
              <h1>
                <p>
                  Login  Application
                </p>
              </h1>
            </div>
            <div className="formbg-outer">
              <div className="formbg">
                <div className="formbg-inner padding-horizontal--48">
                  <span className="padding-bottom--15">
                    Sign in to your account
                  </span>
                  <form id="stripe-login" method="GET" autoComplete="off" onSubmit={onSubmit}>
                    <div className="field padding-bottom--24">
                      <label htmlFor="username">Username</label>
                      <input type="text" name="username" onFocus={onUsernameFocus}/>
                      {
                        usernameError ? <span style={{ color: 'red', fontSize: '12px'}}>{usernameError}</span> : ''
                      }
                    </div>
                    <div className="field padding-bottom--24">
                      <div className="grid--50-50">
                        <label htmlFor="password">Password</label>
                      </div>
                      <input type="password" name="password" onFocus={onPasswordFocus}/>
                      {
                        passwordError ? <span style={{ color: 'red', fontSize: '12px'}}>{passwordError}</span> : ''
                      }
                    </div>
                    <div className="field padding-bottom--24">
                      <input type="submit" name="submit" value="Continue" />
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
