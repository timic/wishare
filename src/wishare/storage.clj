(ns wishare.storage
  (:require [datomic.api :as d]
            [carica.core :refer [config]]))

(def uri (config :db :uri))
(def conn (d/connect uri))


(defn add-user [email])
(defn find-all-users [])
