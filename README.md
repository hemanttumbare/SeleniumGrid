# SeleniumGrid
Sample Grid Configuration

#The Hub:
The hub is the central point where you load your tests into.
There should only be one hub in a grid.

#The Nodes:
Nodes are the Selenium instances that will execute the tests that you loaded on the hub.


~~~ for HUB, use this command:
~~~ for HUB, use this command:
java -jar selenium-server-standalone-3.8.1.jar -role hub

~~~ for Node, use this command:
java -Dwebdriver.chrome.driver="/Users/NaveenKhunteta/Downloads/chromedriver" -jar selenium-server-standalone-3.8.1.jar -role node -hub http://192.168.0.102:4444/grid/register


https://www.techbeamers.com/selenium-grid-webdriver-code-example-java/
