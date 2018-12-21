# HttpResponseCodeHandling
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16) 
[![](https://jitpack.io/v/paveltech/MoreApps.svg)](https://jitpack.io/#paveltech/MoreApps)



<div align="center">
	<img src="https://raw.githubusercontent.com/paveltech/HttpResponseCodeHandling/master/status-code.png" width="428">
</div>

During HTTP request in android development we can found different response code from the server. If we don't handle this error code then our live application can be crashed cause they don't know the response. In this library, I tried to cover all internet response code so that what happened in our server live application will never be crashed. Here I added a custom Toast library to show the response but if you want you can disable this option.

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
