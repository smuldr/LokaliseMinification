# Do not keep any Lokalise SDK classes because that causes unnecessary bloat.
#-keep class com.lokalise.** { *; }
#-dontwarn com.lokalise.*

# Fix a crash when localizing the text in a TabItem using reflection.
-keepclassmembers class com.google.android.material.tabs.TabItem { <fields>; }
