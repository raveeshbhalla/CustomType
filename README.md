RobotoText
==========

RobotoText allows you to easily use different typfaces in your app. It was created to initially work with the Roboto family of fonts (hence the name), but has since been adapted to allow you to use any typeface that you would like.

RobotoText maintains static Typeface objects to avoid potential memory leaks that can occur. Hence, it is the ideal manner of using any custom typeface in your app, regardless of whether or not it belongs to the Roboto family.

RobotoText can be used in two ways:
1. Via XML:
===============
If you would like to mention your Typeface in the XML file itself, you would need to use the co.robototext.TextView object in your XML files in place of android.widget.TextView. You would also need to provide the xmnls namespace for the project, which can be done by adding the following line to the top of your XML file:

    xmlns:roboto="http://schemas.android.com/apk/lib/co.raveesh.robototext"

After that, you can add the typeface as an attribute to the co.robototext.TextView in the following manner

    roboto:typeface="Roboto/Light.ttf"
    
Custom typefaces can be added in a similar manner

    roboto:typeface="folder/typeface.ttf"

2. Via JAVA:
==============
The Roboto.getTypeface() method returns a typeface object that you can apply to any view that supports the setTypeface() method. Example codes are:

    tv.setTypeface(this,RobotoCondensed.CONDENSED_BOLD);
    
This sets the Roboto Condensed Bold typeface to the TextView. Do note, to use this method, the font families must be copied to the assets/fonts folder of your project as is. You are free to remove those font files that you do expect to use.

To use with a custom typeface, simply use the following code:

    tv.setTypeface(this,"folder/typeface.ttf");
    

Do note: the font file must be present within your projects assets/fonts folder. Due to a limitation, libraries cannot extract its own assets at runtime.
