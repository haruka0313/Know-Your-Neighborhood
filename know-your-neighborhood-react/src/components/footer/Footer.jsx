import React from "react";
import { Link } from "react-router-dom";

const Footer = () => {
  return (
    <footer className="min-h-[60px] flex items-center justify-center border-t bg-gray-100 px-5 text-secondary font-medium mt-5">
      <p className="text-center">
        Created by{" "}
        <a
          href="https://github.com/haruka0313"
          target="_blank"
          rel="noreferrer"
          className="text-color1 hover:decoration-solid hover:underline"
        >
          Ni Made Bella Sridiana Wati
        </a>{" "}
        |{" "}
        <Link
          to="/terms"
          className="text-color1 hover:decoration-solid hover:underline"
        >
          Terms and Conditions
        </Link>{" "}
        | All Rights Reserved
      </p>
    </footer>
  );
};

export default Footer;
