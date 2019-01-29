# PersianTimeAgo 

* This library will help you display how much time have passed.

## Demo

 ![logo](https://github.com/Houman7601/PersianTimeAgo/blob/master/image/p2.jpg)

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
	        implementation 'com.github.Houman7601:PersianTimeAgo:1.0.1'
	}
## Usage

```java
String timeago = PersianTimeAgo(context).getTimeAgo("2019-01-25 02:32:58");
```

## Author

Houman Sanati, houmansnt@gmail.com

## Versioning

* **1.0.0**
    * Initial release
* **1.0.1**
    * Added "moments ago"
    * Added "weeks ago"
