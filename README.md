CSC262 Discussion 3 Arrays

In Java’s world, arrays stand as a forest of fixed‐size trees each slot rooted in place, offering direct access but no room for new branches to sprout or old ones to wither (Horstmann, 2016, 6.1). Their size is etched in stone at creation, yet this immutability grants raw speed and stability, with elements laid out in a contiguous block of memory.

By contrast, the ArrayList flows like a river, ever changing and dynamic. Internally it still relies on an array, but on each add() it checks capacity and, if needed, builds a larger vessel, copying its contents along (Horstmann, 2016, §11.2). It carries primitives in object wrappers, trading a bit of performance for agility and a rich API of methods add(), remove(), contains(), and more.

Together, these two structures teach a timeless lesson: when the path is clear and unchanging, the steadfast grove of arrays offers unmatched speed and simplicity. But when the journey demands adaptability and high level operations, the flowing river of ArrayLists becomes the guide to follow.
________________________________________
References
Horstmann, C. S. (2016). Big Java: Late Objects, Enhanced eText (2nd ed.). Wiley.

