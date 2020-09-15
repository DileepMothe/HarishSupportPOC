$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "login into application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8022414344,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "login into application",
  "description": "",
  "id": "login-into-application;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login into the Application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.i_NavigateToApplication()"
});
formatter.result({
  "duration": 19714295406,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.doLoginToApplication()"
});
formatter.result({
  "duration": 92646984,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#email\"}\n  (Session info: chrome\u003d85.0.4183.102)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:49518}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: eb82b15ebd5b591eb1dfaccf5d941c14\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\r\n\tat com.support.automation.utils.Elements.SendInput(Elements.java:13)\r\n\tat com.support.automation.implementaion.LoginImplementation.doLogin(LoginImplementation.java:11)\r\n\tat com.support.automation.stepdef.StepDef.doLoginToApplication(StepDef.java:42)\r\n\tat ✽.And I login into the Application(FeatureFiles/login.feature:5)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1073156814,
  "status": "passed"
});
});