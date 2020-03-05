## Intro

In this project, we pretend we have a map with shipyards that are able to produce fishing ships.
We are aiming to make it possible to upgrade the ships we are creating when a new era comes.
Imagine a small shipyard that creates small barges. At some point they figure bigger vessels,
more fish, less time consumed on traveling there and back.

Hope all of you have played Age of Empires.

## Description of domain
The GameMapInterface provides the ability to:
- Get Shipyard
- Build a ship using Shipyard
- Adds built ships to the fleet
- Can send all the fishing ships to fish

The Shipyard:
- Has some resources
- Has Blueprints on how to make ships
- Creates ships


Fishing barge
- Has max speed
- Has cargo size
- Has crew
- Can go fishing

## Task
The day is here, the new modern era is upon us. By progressing to the new age, we can now build bigger and better ships.

- Make it possible for player to call `upgrade()` on the GameInterface
- Before the upgrade, Shipyard will produce `FishingBarge`
- The upgrade will make Shipyards to produce new type of ship, `SturdyFishingShip`
- After the upgrade it won't be possible to create new fishing barges anymore (in any Shipyard)
- The `SturdyFishingShip` will have larger cargo and speed
- All the `SturdyFishingShip` crew members have to be over 18
