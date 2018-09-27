Generative flowers inspired by the *Fugly Flowers* project by [@mokafolio](https://twitter.com/mokafolio).

**Note: when running the pde every click on the canvas creates a new bunch of flowers.**

![Flower](https://github.com/jriede/flowers/petals-1054.png)


## What is a Flower?
A flower in the botanical sense is is the reproductive structure found in flowering plants and contains a vegetative part (the perianth - sepal and petals) and a reproductive part (carpel and stamens).

When we look at a flower from a design perspective it's a structure containing a stem, petals and a center. It grows at a certain point (the stem's starting point) and has a defined height (stem length) as well as center with a defined diameter and a number of petals originating from the center, with a certain shape.

## Generative Flowers
Generative flowers contain the following parts:

* stem
* center
* petals

### Stem
Stems have a defined origin (the place they emerge from the ground), a certain height and end in a center or on the edge of a center.

A stem has the following properties:

* origin
* direction
* length
* color
* thickness

The *direction* and *length* properties could be combined into an *endpoint* property but I prefer to list them separately for versatility.

The most simple stem is a straight line from a point a (the origin) to point b (the center), but that wouldn't be as  visually appealing as if you were drawing a flower by hand so we add some random noise.

### Center
The center emulates the calyx and reproductive parts of a flower. If assumed to be a simple circle for the beginning, it has the following properties:

* position (stem end)
* diameter
* color

### Petals
Petals surround the center in a generative flower. They have a certain shape and there is a defined number of petals for each flower.


*Now let's play.*
