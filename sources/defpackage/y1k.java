package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y1k {
    public static final Pattern a = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static y1k b;

    public y1k(ci5 ci5Var) {
    }

    public final boolean a(sx0 sx0Var) {
        if (TextUtils.isEmpty(sx0Var.c) || sx0Var.f + sx0Var.e < (System.currentTimeMillis() / 1000) + 3600) {
            return true;
        }
        return false;
    }
}
