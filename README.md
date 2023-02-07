# TMTOWTDI - Drawing some coloured round dots

(**T**here's **M**ore **T**han **O**ne **W**ay **T**o **D**o **I**t)

This repo is essentially a bunch of little examples of how to do the same thing.

This is all based on [this tweet](https://twitter.com/JeroenFrijters/status/1615204074588180481) 
which in turn is based on [this code](https://github.com/MinBZK/woo-besluit-broncode-digid-app/blob/ad2737c4a039d5ca76633b81e9d4f3f9370549e4/Source/DigiD.iOS/Services/NFCService.cs)
(bottom of the file)

The tweet kicked off various folk discussing how good/bad the code fragment was, how they would do it, how another language would do it, etc.

So I thought it'd be interesting to rewrite that function in Java, then riff on it using different approaches to see what I and other folk think about the readability, correctness, robustness, etc.

Also it provides a focus to look at interesting bugs and edge cases in the different implementations.

This all starts with [this implementation](src/main/OriginalRounds.java) which is a copy-paste of the original function. Take a look, see what you think of it.
