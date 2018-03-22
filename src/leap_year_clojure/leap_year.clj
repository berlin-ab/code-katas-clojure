(ns leap-year-clojure.leap_year)

(defn is-divisible-by [other number]
  (= (mod number other) 0))

(defn is-divisible-by-four [number]
  (is-divisible-by 4 number))

(defn is-divisible-by-one-hundred [number]
  (is-divisible-by 100 number))

(defn is-divisible-by-four-hundred [number]
  (is-divisible-by 400 number))


(defn is-leap-year [number]
  (cond
    (is-divisible-by-four-hundred number) true
    (is-divisible-by-one-hundred number) false
    (is-divisible-by-four number) true
    :else false))
