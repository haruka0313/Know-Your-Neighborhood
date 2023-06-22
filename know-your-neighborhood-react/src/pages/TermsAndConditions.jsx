import React from 'react';
import LayoutFull from "../components/layout/LayoutFull";

const TermsAndConditions = () => {
  return (
    <LayoutFull>
    <div className="my-4"></div> {/* Add spacing here */}
      <div className="flex justify-center items-center min-h-screen bg-gray-100">
        <div className="w-1/2 p-8 bg-white rounded shadow">
          <h1 className="text-2xl font-bold mb-6 text-center">Terms and Conditions</h1>
          <div className="prose">
            <h2 className="font-bold">Welcome to our website!</h2>
            <p>
              Thank you for visiting our website. Please take a moment to review the following terms and conditions before using our services.
            </p>
            <div className="my-4"></div> {/* Add spacing here */}
            <h2 className="font-bold">Authorization & Authentication</h2>
            <ul className="list-disc pl-6">
            <li>
                By accessing and using our website, you agree to abide by the terms and conditions set forth in this agreement.
              </li>
              <li>
                You must not attempt to gain unauthorized access to any part of our website or systems.
              </li>
              <li>
                You are responsible for maintaining the confidentiality of your account information and ensuring that your account is used only by authorized individuals.
              </li>
              <li>
                Any unauthorized use or access to our website may result in legal action and termination of your account.
              </li>
              <li>
                We reserve the right to revoke or modify access to our website at any time without prior notice.
              </li>
            </ul>
            <div className="my-4"></div> {/* Add spacing here */}
            <h2 className="font-bold">Intellectual Property Rights</h2>
            <ul className="list-disc pl-6">
            <li>
                All content available on our website, including text, graphics, images, logos, and trademarks, is the intellectual property of our company.
              </li>
              <li>
                You must not reproduce, distribute, modify, transmit, or display the content without prior written consent from our company.
              </li>
              <li>
                Any unauthorized use of our intellectual property may violate copyright, trademark, and other applicable laws and may result in legal action.
              </li>
              <li>
                We reserve the right to enforce our intellectual property rights to the fullest extent permitted by law.
              </li>
            </ul>
          </div>
          <div className="mt-8">
            <input
              type="checkbox"
              id="agreeCheckbox"
              className="mr-2"
            />
            <label htmlFor="agreeCheckbox">
              I have read and agree to the Terms and Conditions
            </label>
          </div>
          <a href="/" className="block mt-4">
            <button className="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded">
              Accept
            </button>
          </a>
        </div>
      </div>
    </LayoutFull>
  );
};

export default TermsAndConditions;
