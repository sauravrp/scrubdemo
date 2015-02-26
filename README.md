# scrubdemo


Create a single view application that allows the user to view a series of images. 

Requirements:
Dragging left/right changes index of visible image. 
Dragging 60% of the image width advances through all of the frames.
Maintain image aspect ratio.
Scale image to fit screen.

Solution:
load frames from asset folder that has 44 images. provide for a way to user to scrub thru the images frame by frame.
restore the frame location on rotation. 
Tried using Picasso lib first. noticed delay while scrubbing. I tried increasing thread priority as well as memory cache and even preloading the image so that images are loaded from memory on subsequent calls but the lag wouldn't go away.

Switched to using https://github.com/nostra13/Android-Universal-Image-Loader. Only tweaking needed was increasing the thread priority and things started working well.

![alt tag](https://raw.githubusercontent.com/sauravrp/scrubdemo/master/screenshots/scrubdemo.png)
![alt tag](https://raw.githubusercontent.com/sauravrp/scrubdemo/master/screenshots/demo2.png)
![alt tag](https://raw.githubusercontent.com/sauravrp/scrubdemo/master/screenshots/demo3.png)
![alt tag](https://raw.githubusercontent.com/sauravrp/scrubdemo/master/screenshots/demo4.png)

Rotation:
![alt tag](https://raw.githubusercontent.com/sauravrp/scrubdemo/master/screenshots/rotation.png)
