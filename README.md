androidlogger
=============

A simple wrapper for android.util.Log.

Theoretically, everyone should use android.util.Log.isLoggable() to check whether one can log at the specified level, with
the specified tag. 

Practically, everyone either skips the step or has his own wrapper that delegates the logging to the android.util.Log
only in some circumstances (BuildConfig.DEBUG flag, some resources available only in specific build flavor etc.)

I've created my own wrapper, ALog, that has API compatible in 100% with android.util.Log class, but adds a setter for
minimum log level. Now you can set a minimum log level in runtime, whenever you want, to whatever value you'd like to.

Credits
=======
I used AOSP source code (specifically, android.util.Log) class as a base.

License
=======

    Copyright (C) 2014 Miłosz Lewandowski

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
