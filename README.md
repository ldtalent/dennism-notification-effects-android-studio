# dennism-notification-effects-android-studio


A fast way to get started with the Ancroid Notification Effects.

## How to setup and run the application 
.Clone the repo on your local machine

.Copy the project files into your android studio  project directory.

.Open the project.

.Run on android phone or android emulator

# TOC

  * [Requirements](#requirements)
  * [Android Studio](#android-studio)
    * [Download Android Studio](#download-android-studio)
    * [Open the project](#open-the-project)
    * [Run the app](#run-the-app)
    * [Troubleshooting](#troubleshooting)

# Requirements

Java Development Kit (JDK) [Download](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
Android SDK [Download](http://developer.android.com/sdk/index.html)
[![Android Arsenal](http://img.shields.io/badge/%20%20%20Android%20%20Arsenal%20%20%20-%20%20%20NiftyNotification%20%20%20-blue.svg)](http://android-arsenal.com/details/1/888)
[![Build Status](https://api.travis-ci.org/sd6352051/NiftyNotification.svg?branch=master)](https://travis-ci.org/sd6352051/NiftyNotification)
[![JitPack Maven](https://img.shields.io/github/tag/sd6352051/NiftyNotification.svg?label=JitPack%20Maven)](https://jitpack.io/#sd6352051/NiftyNotification)

# Android Studio

## Download Android Studio
Download Android Studio (http://developer.android.com/sdk/index.html)

## Open the project
  1. On the welcome screen, select "Open an existing Android Studio project" or if you have a project open, choose "File->Open...""
  2. Navigate to the checked out project
  3. Press "Ok"

## Run the app
  1. Ensure your phone is in plugged in, developer mode enabled and screen unlocked
  2. Press the green arrow, or choose Run>Run

# ScreenShot

![Image][2]


# Usage
``` java
  NiftyNotificationView.build(this,msg, effect,R.id.mLyout)
      .setIcon(R.drawable.lion)    //You must call this method if you use ThumbSlider effect
      show();
```
#

```xml

<!-- ViewGroup-->
<RelativeLayout
      android:id="@+id/mLyout"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      >

</RelativeLayout>
```

# Effects
`Flip`, `Jelly`, `Scale`, `SlideIn`, `SlideOnTop`, `Standard`, `ThumbSlider`


[1]: https://github.com/keyboardsurfer/Crouton
