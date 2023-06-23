import React from "react";
import AvatarComponent from "../../../atoms/Avatar";
import TypographyComponent from "../../../atoms/Typography";
import { Box, Avatar } from "@mui/material";
import BoxComponent from "../../../atoms/Box";
import vector from "../../../../../images/Vector.png";
import "./index.css";

function TitleBar() {
  return (
    <Box className="main-container">
      <Box className="text-container">
        <BoxComponent width="229px" height="42px">
          <TypographyComponent variant="h2">New Cash Kick</TypographyComponent>
        </BoxComponent>
        <BoxComponent width="388px" height="27px">
          <TypographyComponent variant="h3">
            {"Let's"} setup a new cash kick to power your Saas
          </TypographyComponent>
        </BoxComponent>
      </Box>
      <Box className="avatar-container">
        <AvatarComponent />
        <Avatar className="drop" src={vector} sx={{width: "8.53px",height: "8.53px",}}/>
      </Box>
    </Box>
  );
}

export default TitleBar;
