(ns leap-year-clojure.leap-year-test
  (:require [clojure.test :refer :all]
            [leap-year-clojure.leap_year :refer :all]))

(deftest leap-year-test
  (testing "numbers divisible by 4 are leap years"
    (is (true? (is-leap-year 2004)))
    (is (true? (is-leap-year 4)))
    (is (true? (is-leap-year 8))))
  (testing "numbers divisible by four and 100 are not leap years"
    (is (false? (is-leap-year 100)))
    (is (false? (is-leap-year 200)))
    (is (false? (is-leap-year 300))))
  (testing "numbers divisible by four hundred are actually leap years"
    (is (true? (is-leap-year 400)))
    (is (true? (is-leap-year 2000))))
  (testing "number not divisible by 4 are not leap years"
    (is (false? (is-leap-year 3)))
    (is (false? (is-leap-year 5)))))


