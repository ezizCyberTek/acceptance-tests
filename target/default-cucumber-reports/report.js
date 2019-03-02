$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/prestashop/features/user_information.feature");
formatter.feature({
  "name": "User account information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify account info",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I login using username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on my personal information button",
  "keyword": "When "
});
formatter.step({
  "name": "the system should display the user\u0027s account information",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "\u003cfirstname\u003e",
        "\u003clastname\u003e",
        "\u003cusername\u003e",
        "\u003cpassword\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "name",
        "lastname",
        "aziz-8454@mail.ru",
        "password"
      ]
    },
    {
      "cells": [
        "John",
        "Smith",
        "nitoyey@dumoac.net",
        "password"
      ]
    },
    {
      "cells": [
        "Geraldine",
        "Whitehead",
        "lectus@sociisnatoquepenatibus.rg",
        "password"
      ]
    },
    {
      "cells": [
        "Inigo",
        "Montoya",
        "vel.quam@Dones.org",
        "password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify account info",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login using username \"aziz-8454@mail.ru\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.i_login_using_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on my personal information button",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_user_clicks_on_my_personal_information_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system should display the user\u0027s account information",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "name",
        "lastname",
        "aziz-8454@mail.ru",
        "password"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_system_should_display_the_user_s_account_information(User\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verify account info",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login using username \"nitoyey@dumoac.net\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.i_login_using_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on my personal information button",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_user_clicks_on_my_personal_information_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@title\u003d\u0027Information\u0027]\"}\n  (Session info: chrome\u003d72.0.3626.119)\n  (Driver info: chromedriver\u003d2.46.628411 (3324f4c8be9ff2f70a05a30ebc72ffb013e1a71e),platform\u003dMac OS X 10.14.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Ezizs-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:18bb:2db6:ec3c:9c44%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.3\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628411 (3324f4c8be9ff2..., userDataDir: /var/folders/6t/6k9b5flx62s...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53120}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.119, webStorageEnabled: true}\nSession ID: 800e0a98161844229aeff6eb4dbee979\n*** Element info: {Using\u003dxpath, value\u003d//a[@title\u003d\u0027Information\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\n\tat com.prestashop.step_definitions.UserRegistrationStepDefs.the_user_clicks_on_my_personal_information_button(UserRegistrationStepDefs.java:63)\n\tat ✽.the user clicks on my personal information button(file:src/test/resources/com/prestashop/features/user_information.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "the system should display the user\u0027s account information",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "John",
        "Smith",
        "nitoyey@dumoac.net",
        "password"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_system_should_display_the_user_s_account_information(User\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verify account info",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login using username \"lectus@sociisnatoquepenatibus.rg\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.i_login_using_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on my personal information button",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_user_clicks_on_my_personal_information_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@title\u003d\u0027Information\u0027]\"}\n  (Session info: chrome\u003d72.0.3626.119)\n  (Driver info: chromedriver\u003d2.46.628411 (3324f4c8be9ff2f70a05a30ebc72ffb013e1a71e),platform\u003dMac OS X 10.14.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Ezizs-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:18bb:2db6:ec3c:9c44%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.3\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628411 (3324f4c8be9ff2..., userDataDir: /var/folders/6t/6k9b5flx62s...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53215}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.119, webStorageEnabled: true}\nSession ID: ee3158413b667d34d8945a577a2cc80c\n*** Element info: {Using\u003dxpath, value\u003d//a[@title\u003d\u0027Information\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\n\tat com.prestashop.step_definitions.UserRegistrationStepDefs.the_user_clicks_on_my_personal_information_button(UserRegistrationStepDefs.java:63)\n\tat ✽.the user clicks on my personal information button(file:src/test/resources/com/prestashop/features/user_information.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "the system should display the user\u0027s account information",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "Geraldine",
        "Whitehead",
        "lectus@sociisnatoquepenatibus.rg",
        "password"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_system_should_display_the_user_s_account_information(User\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verify account info",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login using username \"vel.quam@Dones.org\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.i_login_using_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on my personal information button",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_user_clicks_on_my_personal_information_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@title\u003d\u0027Information\u0027]\"}\n  (Session info: chrome\u003d72.0.3626.119)\n  (Driver info: chromedriver\u003d2.46.628411 (3324f4c8be9ff2f70a05a30ebc72ffb013e1a71e),platform\u003dMac OS X 10.14.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Ezizs-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:18bb:2db6:ec3c:9c44%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.3\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628411 (3324f4c8be9ff2..., userDataDir: /var/folders/6t/6k9b5flx62s...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53315}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.119, webStorageEnabled: true}\nSession ID: 4d1a1a23bfe84885e07ab1a839e4ece8\n*** Element info: {Using\u003dxpath, value\u003d//a[@title\u003d\u0027Information\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\n\tat com.prestashop.step_definitions.UserRegistrationStepDefs.the_user_clicks_on_my_personal_information_button(UserRegistrationStepDefs.java:63)\n\tat ✽.the user clicks on my personal information button(file:src/test/resources/com/prestashop/features/user_information.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "the system should display the user\u0027s account information",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "Inigo",
        "Montoya",
        "vel.quam@Dones.org",
        "password"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistrationStepDefs.the_system_should_display_the_user_s_account_information(User\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
});