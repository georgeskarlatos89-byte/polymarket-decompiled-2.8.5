package com.socure.idplus.device.internal.utils;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import defpackage.m51;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class g {
    public static String a(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().getLocales().toLanguageTags();
    }

    public static String b(Context context) {
        Object obj;
        List<InputMethodInfo> list = null;
        if (context != null) {
            obj = context.getSystemService("input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            list = inputMethodManager.getEnabledInputMethodList();
        }
        String str = "";
        if (list != null) {
            Iterator<InputMethodInfo> it = list.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
                enabledInputMethodSubtypeList.getClass();
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if (Intrinsics.areEqual(inputMethodSubtype.getMode(), "keyboard")) {
                        String locale = inputMethodSubtype.getLocale();
                        locale.getClass();
                        Locale locale2 = new Locale(locale);
                        if (str.length() > 0) {
                            str = str.concat(",");
                        }
                        str = m51.k(str, locale2.getDisplayLanguage(), "@hw=", locale);
                    }
                }
            }
        }
        return str;
    }

    public static String a(Calendar calendar) {
        calendar.getClass();
        return calendar.getCalendarType();
    }
}
