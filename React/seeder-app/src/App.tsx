import React from "react";
import { ThemeProvider } from "styled-components";
import { theme } from "./themes";
import "./App.css";
import Maintemplate from "./components/templates/Maintemplate";

function App() {
  


    return (
      <ThemeProvider theme={theme}>
          <Maintemplate/>
      </ThemeProvider>
    );
  }

  
 


export default App;
