<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center_horizontal"
    android:orientation="vertical"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.win8.myapplication.Search">

    
<TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="Welcome user"
        android:id="@+id/textView"
        android:layout_alignParentTop="true"
        />

    <Switch
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Location"
        android:id="@+id/GPS"
        android:checked="false"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        />


    <MultiAutoCompleteTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Source"
        android:id="@+id/source"
        android:layout_marginTop="78dp"
        android:layout_below="@+id/GPS"
        android:layout_centerHorizontal="true" />



    <MultiAutoCompleteTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Destination"
        android:id="@+id/destination"
        android:layout_marginTop="54dp"
        android:layout_below="@+id/source"
        android:layout_centerHorizontal="true" />



    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Route Me"
        android:id="@+id/routesubmit"
        android:layout_marginTop="56dp"
        android:layout_below="@+id/destination"
        android:layout_centerHorizontal="true" />

</RelativeLayout>
