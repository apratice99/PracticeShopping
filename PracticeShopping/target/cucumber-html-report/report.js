$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/OrderConfirmation.feature");
formatter.feature({
  "line": 2,
  "name": "Order Confirmation",
  "description": "",
  "id": "order-confirmation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OrderConfirm"
    }
  ]
});
formatter.before({
  "duration": 5245371379,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify order confirmation page and order successful",
  "description": "",
  "id": "order-confirmation;verify-order-confirmation-page-and-order-successful",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I sign in",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I select a dress and proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify details on shoppingCart summary page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify address and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify shipping details and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify payment details page and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify order summary page and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify order confirmation page details and verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSignoutContactUsSteps.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 3609880546,
  "status": "passed"
});
formatter.match({
  "location": "SigninSignoutContactUsSteps.i_sign_in()"
});
formatter.result({
  "duration": 4084601950,
  "status": "passed"
});
formatter.match({
  "location": "SelectCheckoutSteps.i_select_a_dress_and_proceed_to_checkout()"
});
formatter.result({
  "duration": 9534649683,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSummarySteps.i_verify_details_on_shoppingCart_summary_page()"
});
formatter.result({
  "duration": 1403504907,
  "status": "passed"
});
formatter.match({
  "location": "AddressSteps.i_verify_address_and_proceed()"
});
formatter.result({
  "duration": 1997826459,
  "status": "passed"
});
formatter.match({
  "location": "ShippingSteps.i_verify_shipping_details_and_proceed()"
});
formatter.result({
  "duration": 1430711915,
  "status": "passed"
});
formatter.match({
  "location": "PaymentSteps.i_verify_payment_details_page_and_proceed()"
});
formatter.result({
  "duration": 1126316464,
  "status": "passed"
});
formatter.match({
  "location": "OrderSummarySteps.i_verify_order_summary_page_and_proceed()"
});
formatter.result({
  "duration": 1918197233,
  "status": "passed"
});
formatter.match({
  "location": "OrderConfirmationSteps.i_verify_order_confirmation_page_details_and_verify_success_message()"
});
formatter.result({
  "duration": 108925262,
  "status": "passed"
});
formatter.after({
  "duration": 1339808008,
  "status": "passed"
});
});