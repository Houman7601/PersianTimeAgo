# PersianTimeAgo

* This library will help you display how much time passed.

## Output

20 ثانیه پیش
3 دقیقه پیش
5 ساعت پیش
12 روز قبل
2 ماه پیش
1 سال پیش

### Gradle

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Houman7601:PersianTimeAgo:1.0.0'
	}
## Usage

```java
String timeago = PersianTimeAgo.Companion.getTimeAgo("2019-01-25 02:32:58");
```
## Author

Houman Sanati, houmansnt@gmail.com

## Versioning

* **1.0.0**
    * Initial release
