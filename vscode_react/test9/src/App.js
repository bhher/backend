import React from 'react';
import {BrowserRouter} from "react-router-dom";
import RouteMain from "./RouteMain";
function App() {
  return (
   <BrowserRouter>
    <RouteMain/>
  </BrowserRouter>
  );
}

export default App;
