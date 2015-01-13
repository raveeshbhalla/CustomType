CustomType
==========

CustomType allows you to easily use different typfaces in your app. It was created to initially work with the Roboto family of fonts, but has since been adapted to allow you to use any typeface that you would like.

CustomType maintains static Typeface objects to avoid potential memory leaks that can occur. Hence, it is the ideal manner of using any custom typeface in your app, regardless of whether or not it belongs to the Roboto family.

CustomType can be used in two ways:
1. Via XML:
===============
If you would like to mention your Typeface in the XML file itself, you would need to use the in.raveesh.customtype.TextView object in your XML files in place of android.widget.TextView.
After that, using a custom typeface in a TextView is as simple as follows (note the custom implementation of a TextView)

    <in.raveesh.customtype.TextView
            android:text="@string/lorem_ipsum_short"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:typeface="fonts/RobotoCondensed/Light.ttf"
            android:textSize="@dimen/typesize_headline"
            android:textColor="@color/text_primary_light"
            android:layout_marginBottom="@dimen/activity_vertical_margin"/>
    
What you're looking to do is set app:typeface to the path to the typeface file inside the assets folder.

2. Via JAVA:
==============
The FontManager.getTypeface() method returns a typeface object that you can apply to any view that supports the setTypeface() method. You do not need to use the bundled custom TextView or EditText for this. Example code

    tv.setTypeface(CustomType.getTypeface(this,"folder/typeface.ttf"));
    

Do note: the font file must be present within your projects assets folder.

Additional Resources
=====================
The library comes with additional resources, including the text sizes in line with the Material Design spec and the default text colors for the light and dark themes.

How to use the library
=====================
[Download the .aar file](https://github.com/raveeshbhalla/CustomType/raw/master/in.raveesh.customtype.aar) from the project root and place it in your libs folder. After that, add the following to your build.gradle

    repositories{
        flatDir{
            dirs 'libs'
        }
    }

    dependencies {
        compile 'in.raveesh.customtype:in.raveesh.customtype@aar'
    }

