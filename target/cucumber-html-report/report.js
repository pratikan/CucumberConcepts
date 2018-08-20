$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/selenium_dev/CucumberFreeCRMLoginTest/src/test/java/features/DealTestMap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Create a new deal Scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal pages",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 13
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 12354592091,
  "status": "passed"
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.title_of_the_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 64035278,
  "status": "passed"
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 316115017,
  "status": "passed"
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 5039272805,
  "status": "passed"
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 16884849,
  "status": "passed"
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.user_moves_to_new_deals_pages()"
});
formatter.result({
  "duration": 4369076462,
  "status": "passed"
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 11658743964,
  "status": "passed"
});
formatter.match({
  "location": "DealsTestUsingMapStepDifinition.user_close_the_browser()"
});
formatter.result({
  "duration": 1066989387,
  "status": "passed"
});
});