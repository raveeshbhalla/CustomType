CustomType
==========

CustomType allows you to easily use different typfaces in your app. It was created to initially work with the Roboto family of fonts (hence the name), but has since been adapted to allow you to use any typeface that you would like.

CustomType maintains static Typeface objects to avoid potential memory leaks that can occur. Hence, it is the ideal manner of using any custom typeface in your app, regardless of whether or not it belongs to the Roboto family.

CustomType can be used in two ways:
1. Via XML:
===============
If you would like to mention your Typeface in the XML file itself, you would need to use the co.robototext.TextView object in your XML files in place of android.widget.TextView. You would also need to provide the xmnls namespace for the project, which can be done by adding the following line to the top of your XML file:

    xmlns:roboto="http://schemas.android.com/apk/lib/in.raveesh.customtype"

After that, using a custom typeface in a TextView is as simple as follows (note the custom implementation of a TextView)

    <in.raveesh.customtype.TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/lorem_ipsum"
        roboto:typeface="fonts/RobotoCondensed-LightItalic.ttf" />
    
What you're looking to do is set roboto:typeface to the path to the typeface file inside the assets folder.

2. Via JAVA:
==============
The Roboto.getTypeface() method returns a typeface object that you can apply to any view that supports the setTypeface() method. Example code

    tv.setTypeface(this,"folder/typeface.ttf");
    

Do note: the font file must be present within your projects assets/fonts folder. Due to a limitation, libraries cannot extract its own assets at runtime.
