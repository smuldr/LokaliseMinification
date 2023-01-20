# These are the recommended rules from the Lokalise docs website.
# They do not work: Lokalise only updates the normal TextView content,
# while the TabItems and BottomNavigationView contents are unchanged.
#
# These rules are also overly restrictive: they keep all classes in the
# Lokalise SDK even though that is not necessary. This makes the final
# app size larger than it should be.
-keep class com.lokalise.** { *; }
-dontwarn com.lokalise.*
