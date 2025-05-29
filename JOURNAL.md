# Todo
- [x] Run all tests from command line using gradle.
- [x] Set up GitHub Actions to run all the tests.
- [x] Set browser locale so that expectations can be in English.
- [ ] Set up a cookie to bypass login to make other tests independent.
- [ ] Write a test to update "My Info".
- [x] Don't run GitHub actions when pushing only .md files. 
- [x] Write a test that migrates from a page to another.
- [x] Introduce Cucumber to make it behaviour-driven.
- [x] Find a website that is simpler than eBay.com.au
- [x] Maximise browser window size before interacting elements.

## 2025-05-29 Thu
Found a better website to work on so migrated from Orange HRM. Tested successful login only for starters.

## 2025-05-16 Fri
Tests failed as the web page was displayed in Chinese. Set locale then.

## 2025-05-13 Tue
Fleshed out README.md with more details about the project, including technologies used, getting started instructions, and project structure highlights.

## 2025-04-30 Wed
Added options such as headless mode to Chrome driver to run tests on GitHub Actions.
Confirmed that all existing tests pass on GitHub Actions.

## 2025-04-29 Tue
Added `.github/workflows/ci.yml` to run all tests on GitHub Actions.

## 2025-04-27 Sun
Finally succeeded in running tests from command line.
cf. https://www.baeldung.com/java-cucumber-gradle

## 2025-04-24 Thu
Cucumber prohibits step definition classes from extending another step class so implemented them using composition.

## 2025-04-18 Fri
Introduced Cucumber then wrote a Login test that passes.

## 2025-04-16 Wed
Fixed the first test for the new site.

## 2025-04-15 Tue
Finding web elements in eBay was so hard that I found a simpler site to easily select web elements.
Migrated from eBay.com.au to Orange HRM.

## 2025-04-14 Mon
Maximised browser size. 
Wrote a test to search "iPhone" to ensure that the first item in the result includes the word in the title. But selecting the first item in the list is difficult so still trying.

## 2025-04-12 Sat
Set up Selenium WebDriver, wrote a small test and pushed to GitHub.
