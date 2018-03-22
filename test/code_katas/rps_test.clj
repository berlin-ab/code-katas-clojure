(ns code-katas.rps-test
  (:require [clojure.test :refer :all])
  (:require [code-katas.rps :refer :all]))

(deftest rock-paper-scissors
  (testing "throws"
    (is (= player-one-wins (play rock scissors))))
    (is (= player-one-wins (play scissors paper)))
    (is (= player-one-wins (play paper rock)))
    (is (= player-two-wins (play rock paper)))
    (is (= player-two-wins (play scissors rock)))
    (is (= player-two-wins (play paper scissors)))
    (is (= tie-game (play rock rock)))
    (is (= tie-game (play paper paper)))
    (is (= tie-game (play scissors scissors)))
    (is (= invalid-game (play scissors :something-else))))
