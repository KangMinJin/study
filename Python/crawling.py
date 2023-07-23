from selenium import webdriver
import chromedriver_autoinstaller
import time
# import pandas as pd
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

# chrome_ver = chromedriver_autoinstaller.get_chrome_version().split('.')[0]
# print(chrome_ver)

driver = webdriver.Chrome()
driver.get('http://www.naver.com')

# 검색창 누르기
search = driver.find_element('xpath', '//*[@id="query"]')
search.click()

search.send_keys("python") # 검색엔진에 입력하고 싶은 키워드 쓰기
search.send_keys(Keys.ENTER) # 키워드 입력 후 엔터

# driver.implicitly_wait(time_to_wait=2)

# for i in range(0, 10000, 10):
#     driver.execute_script("window.scrollTo(0, {})".format(i))