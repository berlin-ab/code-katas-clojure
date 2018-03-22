(ns code-katas.rps)

(def rock :rock)
(def paper :paper)
(def scissors :scissors)
(def player-one-wins :player-one-wins)
(def player-two-wins :player-two-wins)
(def tie-game :tie-game)
(def invalid-game :invalid-game)

(defn- player-one-beats-player-two [throw-one throw-two]
  (or
    (and
      (= throw-one rock)
      (= throw-two scissors))
    (and
      (= throw-one paper)
      (= throw-two rock))
    (and
      (= throw-one scissors)
      (= throw-two paper))))

(defn- throws-are-equal [throw-one throw-two]
  (= throw-one throw-two))

(defn- valid-throw [throw]
  (or
    (= throw rock)
    (= throw paper)
    (= throw scissors)))

(defn- are-invalid-throws [throw-one throw-two]
  (not
    (and
      (valid-throw throw-one)
      (valid-throw throw-two))))

(defn play [throw-one throw-two]
  (cond
    (are-invalid-throws throw-one throw-two)
      invalid-game
    (throws-are-equal throw-one throw-two)
      tie-game
    (player-one-beats-player-two throw-one throw-two)
      player-one-wins
    :else
      player-two-wins))

