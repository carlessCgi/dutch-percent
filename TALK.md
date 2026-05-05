# Talk Notes

This repo exists mainly to drive a talk about how we like our code to look.

This doc is the notes to help steer that talk. The plan is no slides and minimal hand-waving, maximal actual working code and as much discussion as possible.

## Start here
The [original code](https://github.com/MinBZK/woo-besluit-broncode-digid-app/blob/ad2737c4a039d5ca76633b81e9d4f3f9370549e4/Source/DigiD.iOS/Services/NFCService.cs) is some C# for a mobile app for a Dutch public transport org.

## Original
I turned that into a [Java implementation](src/main/OriginalRounds.java) which is a copy-paste of the original function.

Impl notes
* changed some names for personal preference
* wrapped in an interface to make multi-impl easier
* added shared unit tests
* interface and abstract to ensure same tests for all


* It clearly works and gets the job done
* We can all read it and figure it out
* It's not trying to be clever
* Take a number 0.0 - 1.0, return a set of 10 dots as a score


* It's not "pretty", but there is a pattern
* Duplication
* Fragile conditionals
* Questionable logic / validation

Next
* keep the pattern
* simplify the conditionals

## Simplified "ifs"

[Implementation](src/main/SimplifiedConditionRounds.java)
* collapse the number checks
* true one-liners
* same logic
* prettier pattern
* Double max calls out the "edge cases"

Next
* pile of ifs against the same var - that's a switch/case
* extract the ranking logic

## Switch Expression

[Implementation](src/main/SwitchExpressionRounds.java)
* use a Switch Expression (yay for modern Java)
* still a pretty pattern
* maintains the edge cases
* separates scoring from visuals

Next
* numbers from 0 to N returning a String
* we have a data structure for that

## Switch Expression

[Implementation](src/main/ArrayRounds.java)
* static array of Strings - instance vs class
* score then lookup the response
* we've switched from conditions to data lookup (structure vs logic)
* needs bounds checking for compiler

Next
* we've still got a load of repeated dots
* that's duplication and waste
* we just want <rank> blue + <10-rank> white

## String Building

[Implementation](src/main/RepeatBuilderRounds.java)
* so simple, so small
* score it, glue the right dots together, job done
* less code - easier to read?
* no semantic separation

Next
* extract "magics"
* put the separation back

## Parameterised String Building

[Implementation](src/main/ParameterisedBuilderRounds.java)
* consts - at the top, easily found & changed
* separated concerns
* data hiding
* edge case / validation handling preserved and explicit
* probably considered "good practice"
* easiest to read?

Next
* still gluing chars and strings together
* commonly thought slow - can we do better?

## Sliding Window

[Implementation](src/main/SlidingWindowRounds.java)
* Common to embedded and games/graphics devs
* "clever" code?
* Structurally almost identical to previous


* Hidden gotcha
* Unit tests FTW!
