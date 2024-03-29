(ns re-frame-presentation.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/register-sub
 :seconds
 (fn [db]
   (reaction (:seconds @db))))
