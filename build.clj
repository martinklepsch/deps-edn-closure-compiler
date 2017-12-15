(require 'cljs.build.api)

(cljs.build.api/build 
  ["src"]
  {:compiler-stats true
   ;; :verbose     true
   :output-to     "target/android/app.js"
   :main          'app.core
   :output-dir    "target/android"
   :optimizations :none})
