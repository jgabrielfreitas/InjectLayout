[![](https://jitpack.io/v/jgabrielfreitas/DataControllerDemo.svg)](https://jitpack.io/#jgabrielfreitas/DataControllerDemo) [![](https://img.shields.io/badge/Language%20-Java-4682b4.svg)](https://jitpack.io/#jgabrielfreitas/DataControllerDemo)
![InjectLayout](imgs/LayoutId-header.png)

## How to
**Step 1.** Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

**Step 2.** Add the dependency
```gradle
dependencies {
		compile 'com.github.jgabrielfreitas:InjectLayout:1.0.1'
	}
```

## Usage

#### Using in an Activity

+ Extends `InjectLayoutBaseActivity`
+ Call `@InjectLayout` annotation and pass your Activity's layout

``` java
@InjectLayout(layout = R.layout.activity_main)
public class MainActivity extends InjectLayoutBaseActivity {

}
```

> That's it. Your Activity is working.


#### Using in an Fragment

+ Extends `InjectLayoutBaseFragment`
+ Call `@InjectLayout` annotation and pass your Fragment's layout

```java
@InjectLayout(layout = R.layout.fragment_hello_fragment)
public class HelloFragment extends InjectLayoutBaseFragment {

}
```
> That's it. Your Fragment is working.



### License
```
The MIT License (MIT)

Copyright (c) 2016 João Gabriel de Freitas

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
