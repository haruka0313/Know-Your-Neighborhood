import React from "react";

const Features = () => {
  return (
    <section className="grid md:grid-cols-3 mt-8 md:mt-14 gap-5 md:gap-10">
      <div className="flex flex-col text-center p-5 border rounded bg-gray-100 shadow-sm space-y-4">
        <h2 className="font-bold text-primary text-lg">
          Meet New People 
        </h2>
        <i className="fa-solid fa-people-group text-5xl" />
        <p className="text-gray-500 text-[15px]">
        For individuals who are unfamiliar with the locality, having a dedicated section providing resources and information to assist them in getting acclimated would be beneficial. 
        </p>
      </div>

      <div className="flex flex-col text-center p-5 border rounded bg-gray-100 shadow-sm space-y-4">
        <h2 className="font-bold text-primary text-lg">
          Directory of local businesses
        </h2>
        <i className="fa-solid fa-warehouse text-5xl" />
        <p className="text-gray-500 text-[15px]">
          A directory of local businesses, including restaurants, shops, and
          service providers, can be a valuable resource for residents.
        </p>
      </div>

      <div className="flex flex-col text-center p-5 border rounded bg-gray-100 shadow-sm space-y-4">
        <h2 className="font-bold text-primary text-lg">
          User-generated content
        </h2>
        <i className="fa-solid fa-user text-5xl" />
        <p className="text-gray-500 text-[15px]">
          Allowing users to submit their own photos, videos, and reviews of
          local businesses and events can help to create a sense of community on
          the website.
        </p>
      </div>
    </section>
  );
};

export default Features;
