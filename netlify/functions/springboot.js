// netlify/functions/springboot.js

const { exec } = require('child_process');

exports.handler = async (event, context) => {
  const result = await new Promise((resolve, reject) => {
    exec('java -jar path/to/your/springboot-app.jar', (error, stdout, stderr) => {
      if (error) {
        reject(error);
        return;
      }
      resolve(stdout);
    });
  });

  return {
    statusCode: 200,
    body: result,
  };
};
