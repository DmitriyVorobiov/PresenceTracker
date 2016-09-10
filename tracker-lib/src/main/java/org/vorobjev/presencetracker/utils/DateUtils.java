package org.vorobjev.presencetracker.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateUtils {

    public static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm", Locale.UK);
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);

}