package fr.zunf1x.logger;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static final Format hour = new SimpleDateFormat("HH:mm:ss");
    private static final Date date = new Date();

    public static void info(String msg) {
        msg(msg, LogState.INFO);
    }

    public static void warn(String msg) {
        msg(msg, LogState.WARN);
    }

    public static void err(String msg) {
        msg(msg, LogState.ERR);
    }

    private static void msg(String msg, LogState state) {
        System.out.println("[" + hour.format(date) + "] [" + Thread.currentThread().getName() + "/" + state.getTitle() + "]: " + msg);
    }
}
