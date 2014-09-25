/*
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
 */
package com.github.plnice.androidlogger;

import android.util.Log;

/**
 * A simple wrapper for android.util.Log, allowing to set the minimum log level. Calls to methods
 * that log below the minimum level will be skipped, other will be simply passed to the
 * android.util.Log.
 */
public class ALog {
    /**
     * Priority constant for the println method; use Log.v.
     */
    public static final int VERBOSE = 2;

    /**
     * Priority constant for the println method; use Log.d.
     */
    public static final int DEBUG = 3;

    /**
     * Priority constant for the println method; use Log.i.
     */
    public static final int INFO = 4;

    /**
     * Priority constant for the println method; use Log.w.
     */
    public static final int WARN = 5;

    /**
     * Priority constant for the println method; use Log.e.
     */
    public static final int ERROR = 6;

    /**
     * Priority constant for the println method.
     */
    public static final int ASSERT = 7;

    // Currently set minimum log level.
    private static int sMinLogLevel = VERBOSE;
    
    private ALog() {
    }

    /**
     * Sets minimum log level. Calls to log methods that refer to the log levels below the provided
     * value will be skipped.
     * @param value Log level to be set, one of VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT.
     */
    public static void setMinLogLevel(int value) {
        sMinLogLevel = value;
    }

    /**
     * Checks to see whether or not a log for the specified tag is loggable at the specified level.
     * @param tag The tag to check.
     * @param level The level to check.
     * @return Whether or not this tag is allowed to be logged.
     */
    public static boolean isLoggable(String tag, int level) {
        return level >= sMinLogLevel;
    }

    /**
     * Send an {@link #VERBOSE} log message.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @return The number of bytes written.
     */
    public static int v(String tag, String msg) {
        if (sMinLogLevel <= VERBOSE) {
            return Log.v(tag, msg);
        }
        return 0;
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log.
     * @return The number of bytes written.
     */
    public static int v(String tag, String msg, Throwable tr) {
        if (sMinLogLevel <= VERBOSE) {
            return Log.v(tag, msg, tr);
        }
        return 0;
    }

    /**
     * Send an {@link #DEBUG} log message.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @return The number of bytes written.
     */
    public static int d(String tag, String msg) {
        if (sMinLogLevel <= DEBUG) {
            return Log.d(tag, msg);
        }
        return 0;
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log.
     * @return The number of bytes written.
     */
    public static int d(String tag, String msg, Throwable tr) {
        if (sMinLogLevel <= DEBUG) {
            return Log.d(tag, msg, tr);
        }
        return 0;
    }

    /**
     * Send an {@link #INFO} log message.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @return The number of bytes written.
     */
    public static int i(String tag, String msg) {
        if (sMinLogLevel <= INFO) {
            return Log.i(tag, msg);
        }
        return 0;
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log.
     * @return The number of bytes written.
     */
    public static int i(String tag, String msg, Throwable tr) {
        if (sMinLogLevel <= INFO) {
            return Log.i(tag, msg, tr);
        }
        return 0;
    }

    /**
     * Send an {@link #WARN} log message.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @return The number of bytes written.
     */
    public static int w(String tag, String msg) {
        if (sMinLogLevel <= WARN) {
            return Log.w(tag, msg);
        }
        return 0;
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log.
     * @return The number of bytes written.
     */
    public static int w(String tag, String msg, Throwable tr) {
        if (sMinLogLevel <= WARN) {
            return Log.w(tag, msg, tr);
        }
        return 0;
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param tr An exception to log.
     * @return The number of bytes written.
     */
    public static int w(String tag, Throwable tr) {
        if (sMinLogLevel <= WARN) {
            return Log.w(tag, tr);
        }
        return 0;
    }

    /**
     * Send an {@link #ERROR} log message.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @return The number of bytes written.
     */
    public static int e(String tag, String msg) {
        if (sMinLogLevel <= ERROR) {
            return Log.e(tag, msg);
        }
        return 0;
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log.
     * @return The number of bytes written.
     */
    public static int e(String tag, String msg, Throwable tr) {
        if (sMinLogLevel <= ERROR) {
            return Log.e(tag, msg, tr);
        }
        return 0;
    }

    /**
     * What a Terrible Failure: Report a condition that should never happen.
     * The error will always be logged at level ASSERT with the call stack.
     * Depending on system configuration, a report may be added to the
     * {@link android.os.DropBoxManager} and/or the process may be terminated
     * immediately with an error dialog.
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @return The number of bytes written.
     */
    public static int wtf(String tag, String msg) {
        if (sMinLogLevel <= ASSERT) {
            return Log.wtf(tag, msg);
        }
        return 0;
    }

    /**
     * What a Terrible Failure: Report an exception that should never happen.
     * Similar to {@link #wtf(String, Throwable)}, with a message as well.
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr An exception to log. May be null.
     * @return The number of bytes written.
     */
    public static int wtf(String tag, String msg, Throwable tr) {
        if (sMinLogLevel <= ASSERT) {
            return Log.wtf(tag, msg, tr);
        }
        return 0;
    }

    /**
     * What a Terrible Failure: Report an exception that should never happen.
     * Similar to {@link #wtf(String, String)}, with an exception to log.
     * @param tag Used to identify the source of a log message.
     * @param tr An exception to log.
     * @return The number of bytes written.
     */
    public static int wtf(String tag, Throwable tr) {
        if (sMinLogLevel <= ASSERT) {
            return Log.wtf(tag, tr);
        }
        return 0;
    }

    /**
     * Handy function to get a loggable stack trace from a Throwable.
     * @param tr An exception to log.
     */
    public static String getStackTraceString(Throwable tr) {
        return Log.getStackTraceString(tr);
    }

    /**
     * Low-level logging call.
     * @param priority The priority/type of this log message. Please note that currently ASSERT
     *                 level is not supported.
     * @param tag Used to identify the source of a log message. It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @return The number of bytes written.
     */
    public static int println(int priority, String tag, String msg) {
        switch (priority) {
            case VERBOSE:
                return v(tag, msg);
            case DEBUG:
                return d(tag, msg);
            case INFO:
                return i(tag, msg);
            case WARN:
                return w(tag, msg);
            case ERROR:
                return e(tag, msg);
            case ASSERT:
            default:
                // Not supported.
                throw new UnsupportedOperationException("Logging at ASSERT level not supported");
        }
    }

}
