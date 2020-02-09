(ns excel-to-webapp-generator.core-test
  (:require [clojure.test :refer :all]
            [excel-to-webapp-generator.core :refer :all]))

(deftest get-headers
  (testing "should return first rows"
    (def req [["a", "b", "c"] ["1", "2", "3"] ["1b", "2b", "3b"]])
    (is (= ["a", "b", "c"] (getHeaders req)))))



(deftest get-keys
  (testing "should return keys"
    (def req [["a", "b", "c"] ["1", "2", "3"] ["1b", "2b", "3b"]])
    (is (= ["a", "b", "c"] (getHeaders req)))))


